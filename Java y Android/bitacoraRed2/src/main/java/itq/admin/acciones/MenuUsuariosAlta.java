package itq.admin.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MenuUsuariosAlta implements ActionListener{
	private  JDesktopPane p;
	private JPanel pInter;
	
	
	/**
	 * @param p
	 * @param pInter
	 */
	public MenuUsuariosAlta(JDesktopPane p) {
		super();
		this.p = p;
	}

	public void construirVentana() {
		int width = p.getWidth()-10,height=p.getHeight()-30;
		JInternalFrame internalFrame = new JInternalFrame("Alta/Modificación de reportes", false, true, false, true);
		p.add(internalFrame);
		
		pInter = new JPanel();
		pInter.setLayout(null);
		pInter.setBounds(0, 0, width,height);
		
		JLabel usuarioL = new JLabel("Usuario");
		usuarioL.setBounds(10,10,100,30);
		
		JTextField usuarioTF = new JTextField();
		usuarioTF.setBounds(120,10,100,30);
		
		JLabel claveL = new JLabel("Clave");
		claveL.setBounds(230,10,100,30);
		
		JPasswordField clavePF = new JPasswordField();
		clavePF.setBounds(340,10,100,30);
		clavePF.addKeyListener(new LoginClavePF(clavePF));
		
		JLabel claveL1 = new JLabel("Rep. clave");
		claveL1.setBounds(230,50,100,30);
		
		JPasswordField clavePF1 = new JPasswordField();
		clavePF1.setBounds(340,50,100,30);
		clavePF1.addKeyListener(new LoginClavePF(clavePF1));
		
		JButton altaB = new JButton("Alta");
		altaB.setBounds(10, 170, 100, 30);
		altaB.addActionListener(new MenuUsuariosAltaAlta(clavePF, clavePF1, usuarioTF));
		
		pInter.add(usuarioL);
		pInter.add(usuarioTF);
		pInter.add(claveL);
		pInter.add(clavePF);
		pInter.add(claveL1);
		pInter.add(clavePF1);
		pInter.add(altaB);
		
		internalFrame.add(pInter);
        internalFrame.setSize(width,height);
        internalFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		construirVentana();
	}
}
