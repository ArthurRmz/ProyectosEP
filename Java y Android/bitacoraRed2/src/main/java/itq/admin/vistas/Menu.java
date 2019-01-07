/**
 * 
 */
package itq.admin.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import itq.admin.acciones.MenuCerrar;
import itq.admin.acciones.MenuConexionesMostrar;
import itq.admin.acciones.MenuReportesAlta;
import itq.admin.acciones.MenuReportesMostrar;
import itq.admin.acciones.MenuSalir;
import itq.admin.acciones.MenuUsuariosAlta;
import itq.admin.acciones.MenuUsuariosMostrar;

/**
 * @author arthur
 *
 */
public class Menu extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JDesktopPane p;
	private int width = 1200;
	private int height = 400;
	private int x = 10;
	private int y = 10;

	public Menu(int privilegios) {
		p = new JDesktopPane();
		p.setLayout(null);
		p.setBackground(new Color(16, 188, 252));
		p.setBounds(0, 0, width, height);
		setJMenuBar(tipoUsuario(privilegios));
		add(p, BorderLayout.CENTER);
		setResizable(false);
		setSize(width, height+20);
		setLocation(x, y);
		setUndecorated(true);
		setLayout(null);
		setVisible(true);
	}

	private JMenuBar tipoUsuario(int privilegios) {
		if (privilegios == 1)
			return rolAdmin(privilegios);
		return rolNormal(privilegios);
	}
	
	private JMenuBar rolAdmin(int privilegios) {
		JMenuBar menuBar = new JMenuBar();

		JMenu reportes = new JMenu("Reportes");
		reportes.setMnemonic(KeyEvent.VK_R);
		menuBar.add(reportes);

		JMenuItem elemento = new JMenuItem("Mostrar");
		elemento.addActionListener(new MenuReportesMostrar(p,privilegios));
		reportes.add(elemento);

		elemento = new JMenuItem("Alta");
		elemento.addActionListener(new MenuReportesAlta(p));
		reportes.add(elemento);

		JMenu usuarios = new JMenu("Usuarios");
		usuarios.setMnemonic(KeyEvent.VK_U);
		menuBar.add(usuarios);

		elemento = new JMenuItem("Mostrar");
		elemento.addActionListener(new MenuUsuariosMostrar(p));
		usuarios.add(elemento);
		
		elemento = new JMenuItem("Alta");
		elemento.addActionListener(new MenuUsuariosAlta(p));
		usuarios.add(elemento);

		JMenu conexiones = new JMenu("Conexiones");
		conexiones.setMnemonic(KeyEvent.VK_C);
		menuBar.add(conexiones);

		elemento = new JMenuItem("Mostrar");
		elemento.addActionListener(new MenuConexionesMostrar(p));
		conexiones.add(elemento);

		menuBar.add(opcionesCuenta());

		return menuBar;
	}

	private JMenuBar rolNormal(int privilegios) {
		JMenuBar menuBar = new JMenuBar();

		JMenu reportes = new JMenu("Reportes");
		reportes.setMnemonic(KeyEvent.VK_R);
		menuBar.add(reportes);

		JMenuItem elemento = new JMenuItem("Mostrar");
		elemento.addActionListener(new MenuReportesMostrar(p,privilegios));
		reportes.add(elemento);

		menuBar.add(opcionesCuenta());

		return menuBar;
	}

	private JMenu opcionesCuenta() {
		JMenu cuenta = new JMenu("Opciones");
		cuenta.setMnemonic(KeyEvent.VK_O);

		JMenuItem elemento = new JMenuItem("Salir");
		elemento.setMnemonic(KeyEvent.VK_S);
		elemento.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		elemento.addActionListener(new MenuSalir());
		cuenta.add(elemento);

		elemento = new JMenuItem("Cerrar");
		elemento.setMnemonic(KeyEvent.VK_C);
		elemento.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		elemento.addActionListener(new MenuCerrar(this));
		cuenta.add(elemento);

		return cuenta;
	}
}
