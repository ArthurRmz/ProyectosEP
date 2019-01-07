package itq.admin.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import itq.admin.bd.Bd;

public class MenuReportesActualizar implements ActionListener{

	private int id;
	private JTextField horaIniTF,horaFinTF,respReTF,actividadesReTF,respProTF,actividadesProTF;
	private JComboBox<String> turnoCB;
	

	/**
	 * @param id
	 * @param horaIniTF
	 * @param horaFinTF
	 * @param respReTF
	 * @param actividadesReTF
	 * @param respProTF
	 * @param actividadesProTF
	 * @param turnoCB
	 */
	public MenuReportesActualizar(int id, JTextField horaIniTF, JTextField horaFinTF, JTextField respReTF,
			JTextField actividadesReTF, JTextField respProTF, JTextField actividadesProTF, JComboBox<String> turnoCB) {
		super();
		this.id = id;
		this.horaIniTF = horaIniTF;
		this.horaFinTF = horaFinTF;
		this.respReTF = respReTF;
		this.actividadesReTF = actividadesReTF;
		this.respProTF = respProTF;
		this.actividadesProTF = actividadesProTF;
		this.turnoCB = turnoCB;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<Object> parametros = new ArrayList<>();
		String horaIniTFT,horaFinTFT,respReTFT,actividadesReTFT,respProTFT,actividadesProTFT,turnoCBT;
		horaIniTFT = horaIniTF.getText();
		horaFinTFT = horaFinTF.getText();
		respReTFT = respReTF.getText();
		actividadesReTFT = actividadesReTF.getText();
		respProTFT = respProTF.getText();
		actividadesProTFT = actividadesProTF.getText();
		turnoCBT = turnoCB.getSelectedItem()+"";
		Bd bd = new Bd();
		parametros.add(new String(horaIniTFT));
		parametros.add(new String(horaFinTFT));
		parametros.add(new String(respReTFT));
		parametros.add(new String(actividadesReTFT));
		parametros.add(new String(respProTFT));
		parametros.add(new String(actividadesProTFT));
		parametros.add(new String(turnoCBT));
		parametros.add(new Integer(id));
//		System.out.println(id);
		bd.query("UPDATE BITACORA SET HORAINI=?, HORAFIN=?, RESPONSABLERE=?, ACTIVIDADRE=?,  RESPONSABLEPRO=?, ACTIVIDADPRO=?, TURNO=? WHERE ID = ?",parametros);
		bd.cerrarConexion();
		JOptionPane.showMessageDialog(null, "Reporte actualizado correctamente", "Actualizar reporte", 1);
	}

}
