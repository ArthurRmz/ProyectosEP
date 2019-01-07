package itq.admin.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import itq.admin.bd.Bd;

public class MenuUsuariosAltaAlta implements ActionListener{

	private JPasswordField clavePF,clavePF1;
	private JTextField usuarioTF;
	
	/**
	 * @param clavePF
	 * @param clavePF1
	 * @param usuarioTF
	 */
	public MenuUsuariosAltaAlta(JPasswordField clavePF, JPasswordField clavePF1, JTextField usuarioTF) {
		super();
		this.clavePF = clavePF;
		this.clavePF1 = clavePF1;
		this.usuarioTF = usuarioTF;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String usuarioF =usuarioTF.getText(), claveF="", claveF1="";
		for (int i = 0; i < clavePF.getPassword().length; i++) {
			claveF+=clavePF.getPassword()[i];
			claveF1+=clavePF1.getPassword()[i];
		}
		if(!usuarioF.isEmpty() && !claveF.isEmpty() && !claveF1.isEmpty()){
			Bd bd = new Bd();
			ArrayList<Object> parametros = new ArrayList<>();
			parametros.add(new String(usuarioF));
			ResultSet rs = bd.query("SELECT NOMBRE FROM USUARIOS WHERE NOMBRE = ?",parametros);
			String aux = "";
			try {
				rs.next();
				aux = rs.getString(1);
				bd.cerrarConexion();
			} catch (SQLException e1) {}
			if(!aux.equals(usuarioF)) {
				if(claveF.equals(claveF1)) {
					String consulta = "INSERT INTO USUARIOS VALUES (SEQUSUARIOS.nextval,?,?,2,1)";
					bd = new Bd();
					parametros.clear();
					EncriptarDatos encriptarDatos = new EncriptarDatos();
					String con = "e8538f556eee42717a74af37924f7520";
					String auxClave = encriptarDatos.encriptar(con,claveF);
					parametros.add(new String(usuarioF));
					parametros.add(new String(auxClave));
					bd.query(consulta,parametros);
					bd.cerrarConexion();
					JOptionPane.showMessageDialog(null, "Usuario agregado", "Alta", 1);
				}
				else
					JOptionPane.showMessageDialog(null, "Las contraseñas deben de ser iguales", "Error", 0);
			}
			else
				JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe", "Error", 0);	
		}
		else
			JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos", "Error", 0);
	}

}
