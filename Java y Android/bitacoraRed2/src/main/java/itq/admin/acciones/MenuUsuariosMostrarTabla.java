package itq.admin.acciones;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import itq.admin.bd.Bd;

public class MenuUsuariosMostrarTabla implements MouseListener{

	private JTable tabla;
	
	/**
	 * @param tabla
	 */
	public MenuUsuariosMostrarTabla(JTable tabla) {
		super();
		this.tabla = tabla;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			Object[] opciones = {"Eliminar","Cancelar"};
			int opcion = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer con el usuario seleccionado?", "Selecccionar", 1, 1, null, opciones, "1");
			String cadena = "";
			if(opcion==0) {
				int id = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(),0)+"");
				Bd bd = new Bd();
				ArrayList<Object> parametros = new ArrayList<>();
				parametros.add(new Integer(id));
				ResultSet rs = bd.query("SELECT ID, NOMBRE, CLAVE FROM USUARIOS WHERE ID = ?",parametros);
				try {
					rs.next();
					cadena += rs.getInt(1)+"\n";
					cadena += rs.getString(2)+"\n";
					cadena += rs.getString(3)+"\n";
				} catch (SQLException e1) {}
				opcion = JOptionPane.showConfirmDialog(null, "Se eliminara la siguiente información:\n"+cadena,"Confirmación",JOptionPane.YES_NO_OPTION,1);
				if (opcion == JOptionPane.YES_OPTION) {
					parametros.clear();
					parametros.add(new Integer(id));
					bd.query("UPDATE USUARIOS SET ESTATUS = 0 WHERE ID = ?",parametros);
					bd.cerrarConexion();
					JOptionPane.showMessageDialog(null, "Usuario borrado correctamente", "Borrar usuarios", 1);
				}
			}
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
