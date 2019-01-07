package itq.admin.acciones;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import itq.admin.bd.Bd;

public class MenuReportesMostrarTabla implements MouseListener{

	private JTable tabla;
	private JDesktopPane p;
	
	/**
	 * @param tabla
	 */
	public MenuReportesMostrarTabla(JTable tabla,JDesktopPane p) {
		super();
		this.tabla = tabla;
		this.p = p;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			Object[] opciones = {"Editar","Eliminar","Ver","Cancelar"};
			int opcion = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer con el reporte seleccionado?", "Selecccionar accion", 1, 1, null, opciones, "1");
			switch (opcion) {
			case 0:
				editar();
				break;
			case 1:
				eliminar();
				break;
			case 2:
				ver();
				break;
			default:
				break;
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

	private void editar() {
		int id = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(),0)+"");
		Bd bd = new Bd();
		ArrayList<Object> parametros = new ArrayList<>();
		parametros.add(new Integer(id));
		ResultSet rs = bd.query("SELECT ID, HORAINI, HORAFIN, ACTIVIDADRE, RESPONSABLERE, ACTIVIDADPRO, RESPONSABLEPRO, TURNO FROM BITACORA WHERE ID = ?",parametros);
		try {
			rs.next();
			MenuReportesAlta menuReportesAlta = new MenuReportesAlta(p, 2, rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
			menuReportesAlta.construirVentana();
		} catch (SQLException e1) {}
	}
	
	private void eliminar() {
		String cadena = "";
		int id = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(),0)+"");
		Bd bd = new Bd();
		ArrayList<Object> parametros = new ArrayList<>();
		parametros.add(new Integer(id));
		ResultSet rs = bd.query("SELECT ID, FECHA, HORAINI, HORAFIN, ACTIVIDADRE, RESPONSABLERE, ACTIVIDADPRO, RESPONSABLEPRO, TURNO FROM BITACORA WHERE ID = ?",parametros);
		try {
			rs.next();
			cadena += rs.getInt(1)+"\n";
			cadena += rs.getString(2)+"\n";
			cadena += rs.getString(3)+"\n";
			cadena += rs.getString(4)+"\n";
			cadena += rs.getString(5)+"\n";
			cadena += rs.getString(6)+"\n";
			cadena += rs.getString(7)+"\n";
			cadena += rs.getString(8)+"\n";
			cadena += rs.getString(9)+"\n";
		} catch (SQLException e1) {}
		int opcion = JOptionPane.showConfirmDialog(null, "Se eliminara la siguiente información:\n"+cadena,"Confirmación",JOptionPane.YES_NO_OPTION,1);
		if (opcion == JOptionPane.YES_OPTION) {
			parametros.clear();
			parametros.add(new Integer(id));
			bd.query("UPDATE BITACORA SET ESTATUS = 0 WHERE ID = ?",parametros);
			bd.cerrarConexion();
			JOptionPane.showMessageDialog(null, "Reporte borrado correctamente", "Borrar reportes", 1);
		}
	}
	
	private void ver() {
		String cadena = "";
		int id = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(),0)+"");
		Bd bd = new Bd();
		ArrayList<Object> parametros = new ArrayList<>();
		parametros.add(new Integer(id));
		ResultSet rs = bd.query("SELECT ID, FECHA, HORAINI, HORAFIN, ACTIVIDADRE, RESPONSABLERE, ACTIVIDADPRO, RESPONSABLEPRO, TURNO FROM BITACORA WHERE ID = ?",parametros);
		try {
			rs.next();
			cadena += rs.getInt(1)+"\n";
			cadena += rs.getString(2)+"\n";
			cadena += rs.getString(3)+"\n";
			cadena += rs.getString(4)+"\n";
			cadena += rs.getString(5)+"\n";
			cadena += rs.getString(6)+"\n";
			cadena += rs.getString(7)+"\n";
			cadena += rs.getString(8)+"\n";
			cadena += rs.getString(9)+"\n";
		} catch (SQLException e1) {}
		JOptionPane.showMessageDialog(null, "Información completa:\n"+cadena, "Detalles", 1);
	}
}
