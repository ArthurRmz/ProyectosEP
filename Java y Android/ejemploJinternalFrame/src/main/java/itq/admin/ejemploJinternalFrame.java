package itq.admin;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class ejemploJinternalFrame extends JFrame implements ActionListener{
private static final long serialVersionUID = 1L;
JLayeredPane desktop;
JInternalFrame internalFrame;

public ejemploJinternalFrame() {
    super("Test To Maximize Internal Frame");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Make the big window be indented 50 pixels from each edge of the screen.
    int inset = 50;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension screenMinus50 = new Dimension(screenSize.width - inset*2, screenSize.height - inset*2); 

    this.setPreferredSize(screenMinus50);
    desktop = new JDesktopPane();
    setJMenuBar(createMenuBar());
    this.add(desktop, BorderLayout.CENTER);
    this.pack();
    this.setSize(screenMinus50);
    this.setLocationRelativeTo(null);
}
protected JMenuBar createMenuBar() {
    JMenuBar menuBar = new JMenuBar();
    //Set up the File menu.
    JMenu FileMenu = new JMenu("File");
    FileMenu.setMnemonic(KeyEvent.VK_F);
    menuBar.add(FileMenu);
    //Set up the first menu item.
    JMenuItem menuItem = new JMenuItem("New");
    menuItem.setMnemonic(KeyEvent.VK_N);
    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
    menuItem.setActionCommand("new");
    menuItem.addActionListener(new OpenListener());
    FileMenu.add(menuItem);
    //Set up the second menu item.
    menuItem = new JMenuItem("Quit");
    menuItem.setMnemonic(KeyEvent.VK_Q);
    menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.ALT_MASK));
    menuItem.setActionCommand("quit");
    menuItem.addActionListener(this);
    FileMenu.add(menuItem);

    return menuBar;
    }
class OpenListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        // create internal frame
        internalFrame = new JInternalFrame("this internal frame needs to be maximized", true, true, true, true);
        desktop.add(internalFrame);
        internalFrame.setSize(internalFrame.getMaximumSize());
        internalFrame.pack();
        internalFrame.setVisible(true);
    }
}
public static void main(String args[]) {
    ejemploJinternalFrame myParentFrame = new ejemploJinternalFrame();
    myParentFrame.setVisible(true);
}
public void actionPerformed(ActionEvent e) {if ("quit".equals(e.getActionCommand())){System.exit(0);}}
}