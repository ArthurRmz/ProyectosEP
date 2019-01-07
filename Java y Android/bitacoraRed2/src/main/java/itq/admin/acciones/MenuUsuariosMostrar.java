package itq.admin.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import itq.admin.bd.Bd;

public class MenuUsuariosMostrar implements ActionListener{
	private  JDesktopPane p;
	
	private JPanel pInter;

	
	/**
	 * @param p
	 */
	public MenuUsuariosMostrar(JDesktopPane p) {
//		super();
		this.p = p;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		int width=p.getWidth()-10,height=p.getHeight()-30;
		JInternalFrame internalFrame = new JInternalFrame("Lista de usuarios", false, true, false, true);
		p.add(internalFrame);
		
		pInter = new JPanel();
		pInter.setLayout(null);
		pInter.setBounds(0, 0, width,height);
		
		Vector<String> cols = new Vector<>();
		cols.add("Id");
		cols.add("Nombre");
		cols.add("Clave");
		
		JTextField entrada = new JTextField();
		entrada.setBounds(10,10,100,30);
		
		JComboBox<String> opciones = new JComboBox<String>();
		llenarComboBox(opciones);
		opciones.setBounds(120, 10, 100, 30);
		
		Vector<Vector<String>> rows = conexiones();
		
		JTable tabCon = new JTable(rows,cols);
		tabCon.setEnabled(true);
		tabCon.addMouseListener(new MenuUsuariosMostrarTabla(tabCon));
		
		JButton buscar = new JButton("Buscar");
		buscar.setBounds(230, 10, 100, 30);
		buscar.addActionListener(new MenuUsuariosMostrarBuscar(entrada,opciones,rows,cols,tabCon));
				
		JScrollPane scroll = new JScrollPane();
		
		scroll.setViewportView (tabCon);
		scroll.setBounds(5, 50,width-20, height-100);
		
		pInter.add(entrada);
		pInter.add(opciones);
		pInter.add(buscar);
		pInter.add(scroll);
		
		internalFrame.add(pInter);
        internalFrame.setSize(width,height);
        internalFrame.setVisible(true);
	}
	
	private void llenarComboBox(JComboBox<String> combo) {
		combo.addItem("NOMBRE");
	}
	
	private Vector<Vector<String>> conexiones(){
		Vector<Vector<String>> res = new Vector<>();
		Bd bd = new Bd();
		ResultSet rs = bd.query("SELECT * FROM "
				+ "(SELECT ID,NOMBRE,CLAVE "
				+ "FROM USUARIOS "
				+ "WHERE ESTATUS = 1 "
				+ "ORDER BY ID DESC) "
				+ "WHERE ROWNUM < 11");
		try {
			
			while (rs.next()) {
				Vector<String> cols = new Vector<>();
				cols.add(rs.getInt(1)+"");
				cols.add(rs.getString(2));
				cols.add(rs.getString(3));
				res.add(cols);
			}
			
			bd.cerrarConexion();
			return res;
		} catch (SQLException e) {}
		
		return res;
	}

}
