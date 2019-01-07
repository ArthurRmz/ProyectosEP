/**
 * 
 */
package itq.admin.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import itq.admin.bd.Bd;
import itq.admin.vistas.Menu;

/**
 * @author arthur
 *
 */
public class LoginAcceder implements ActionListener{

	private JTextField usuarioTF;
	private JPasswordField clavePF;
	private JFrame login;
	
	/**
	 * @param usuarioTF
	 * @param clavePF
	 * @param login
	 */
	public LoginAcceder(JTextField usuarioTF, JPasswordField clavePF, JFrame login) {
//		super();
		this.usuarioTF = usuarioTF;
		this.clavePF = clavePF;
		this.login = login;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String usuarioF=usuarioTF.getText(),claveF="";
		for (int i = 0; i < clavePF.getPassword().length; i++) {
			claveF+=clavePF.getPassword()[i];
		}
		if (!usuarioF.isEmpty() && !claveF.isEmpty()) {
			String clave="";
			int privilegios=0;
			Bd bd = new Bd();
			ArrayList<Object> datos = new ArrayList<>();
			datos.add(new String(usuarioF));
			ResultSet s = bd.query(
					"SELECT CLAVE, PRIVILEGIOS "
					+ "FROM USUARIOS "
					+ "WHERE NOMBRE = ?"
					+ "AND ESTATUS = 1",datos);
			try {
				s.next();
				clave = s.getString(1);
				privilegios = s.getInt(2);
				bd.cerrarConexion();
			} catch (SQLException e1) {}
			EncriptarDatos enc = new EncriptarDatos();
			String con = "e8538f556eee42717a74af37924f7520";
			String claveDes="";
			claveDes = enc.desecriptar(con, clave);
			if (claveDes.equals(claveF)) {
				Menu m = new Menu(privilegios);
				m.setVisible(true);
				login.dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, "Clave o usuario incorrectos", "Advertencia", 1);
			}
				
		}
	}
}
