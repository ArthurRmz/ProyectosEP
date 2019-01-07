/**
 * 
 */
package itq.admin.vistas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import itq.admin.acciones.DatosLocales;
import itq.admin.acciones.LoginAcceder;
import itq.admin.acciones.LoginClavePF;
import itq.admin.bd.Bd;

/**
 * @author arthur
 *
 */
public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width = 500;
	private int height = 300;
	private JPanel p;
	private int y = 10;
	private int x = 10;
	private JLabel usuarioL;
	private JTextField usuarioTF;
	private JLabel claveL;
	private JPasswordField clavePF;
	private JButton entrar;
	private JPanel pInterno;
	private JButton salir;

	public Login() {
		capturarDatos();
		
		p = new JPanel();
		p.setLayout(null);
		p.setBackground(new Color(16, 188, 252));
		p.setBounds(0, 0, width, height);

		pInterno = new JPanel();
		pInterno.setLayout(null);
		pInterno.setBackground(Color.WHITE);
		pInterno.setBounds(50, 50, width - 100, height - 100);

		usuarioL = new JLabel("Usuario");
		usuarioL.setBounds(100, 30, 100, 30);

		usuarioTF = new JTextField("");
		usuarioTF.setBounds(210, 30, 120, 30);
		usuarioTF.setToolTipText("Ingresa nombre de usuario");

		claveL = new JLabel("Contraseña");
		claveL.setBounds(100, 70, 100, 30);

		clavePF = new JPasswordField("");
		clavePF.setBounds(210, 70, 120, 30);
		clavePF.setToolTipText("Ingresa la contraseña");

		entrar = new JButton("Entrar");
		entrar.setBounds(100, 110, 100, 30);

		salir = new JButton("Salir");
		salir.setBounds(210, 110, 120, 30);

		pInterno.add(usuarioL);
		pInterno.add(usuarioTF);
		pInterno.add(claveL);
		pInterno.add(clavePF);
		pInterno.add(entrar);
		pInterno.add(salir);

		salir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		entrar.addActionListener(new LoginAcceder(usuarioTF,clavePF,this));
		
		clavePF.addKeyListener(new LoginClavePF(clavePF));

		p.add(pInterno);
		add(p);

		setResizable(false);
		setSize(width, height);
		setLocation(x, y);
		setUndecorated(true);
		setLayout(null);
		setVisible(true);
	}
	private void capturarDatos() {
		String mac="",ip="",fecha="";
		DatosLocales datosLocales = new DatosLocales();
		mac = datosLocales.obtenerMAC();
		ip = datosLocales.obtenerIP();
		fecha = datosLocales.obtenerFecha();
		Bd bd = new Bd();
		ArrayList<Object> param = new ArrayList<>();
		param.add(new String(mac));
		param.add(new String(ip));
		param.add(new String(fecha));
		param.add(new Integer(1));
		bd.query("INSERT INTO CONEXIONES VALUES(SEQCONEXIONES.nextval,?,?,?,?)", param);
		bd.cerrarConexion();
	}
}
