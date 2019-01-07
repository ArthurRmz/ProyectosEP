/**
 * 
 */
package itq.admin.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import itq.admin.bd.Bd;

/**
 * @author arthur
 *
 */
public class MenuConexionesMostrarBuscar implements ActionListener{

	private JTextField entrada;
	private JComboBox<String> opciones;
	private Vector<Vector<String>> listaDatos;
	private Vector<String> encabezados;
	private JTable tabla;
	
	/**
	 * @param entrada
	 * @param opciones
	 * @param listaDatos
	 * @param encabezados
	 * @param tabla
	 */
	public MenuConexionesMostrarBuscar(JTextField entrada, JComboBox<String> opciones,
			Vector<Vector<String>> listaDatos, Vector<String> encabezados, JTable tabla) {
		super();
		this.entrada = entrada;
		this.opciones = opciones;
		this.listaDatos = listaDatos;
		this.encabezados = encabezados;
		this.tabla = tabla;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String filtro = entrada.getText(), opcion = opciones.getSelectedItem()+"";
		filtro = filtro.toLowerCase();
		if (!filtro.isEmpty() && !opcion.isEmpty()) {
			listaDatos.clear();
			
			DefaultTableModel modelo = new DefaultTableModel();
			tabla.setModel(modelo);
			modelo = (DefaultTableModel) tabla.getModel();
			modelo.fireTableDataChanged();
			
			Bd bd = new Bd();
			ArrayList<Object> parametros = new ArrayList<>();
			parametros.add(new String("%"+filtro+"%"));
			ResultSet rs = bd.query("SELECT * FROM (SELECT ID, MAC, IP, FECHA FROM CONEXIONES WHERE ESTATUS = 1 AND LOWER("+opcion+") LIKE ? ORDER BY ID DESC) WHERE ROWNUM<11",parametros);
			try {
				
				while (rs.next()) {
					Vector<String> cols = new Vector<>();
					cols.add(rs.getInt(1)+"");
					cols.add(rs.getString(2));
					cols.add(rs.getString(3));
					cols.add(rs.getString(4));
					listaDatos.add(cols);
				}
				bd.cerrarConexion();
			} catch (SQLException e1) {}

			for (int i = 0; i < encabezados.size(); i++) {
				modelo.addColumn(encabezados.get(i));
			}
			for (int i = 0; i < listaDatos.size(); i++) {
				modelo.addRow(listaDatos.get(i));
			}
			

		}
	}

}
