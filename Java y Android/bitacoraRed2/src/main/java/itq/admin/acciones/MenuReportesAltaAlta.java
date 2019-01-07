/**
 * 
 */
package itq.admin.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import itq.admin.bd.Bd;

/**
 * @author arthur
 *
 */
public class MenuReportesAltaAlta implements ActionListener{
	JTextField horaIniTF,horaFinTF,respReTF,actividadesReTF,respProTF,actividadesProTF;
	JComboBox<String> turnoCB;
	
	/**
	 * @param horaIniTF
	 * @param horaFinTF
	 * @param respReTF
	 * @param actividadesReTF
	 * @param respProTF
	 * @param actividadesProTF
	 * @param turnoCB
	 */
	public MenuReportesAltaAlta(JTextField horaIniTF, JTextField horaFinTF, JTextField respReTF,
			JTextField actividadesReTF, JTextField respProTF, JTextField actividadesProTF, JComboBox<String> turnoCB) {
		super();
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
		altaActualizar();
	}
	
	public void altaActualizar() {
		String horaIniTFT,horaFinTFT,respReTFT,actividadesReTFT,respProTFT,actividadesProTFT,turnoCBT;
		horaIniTFT = horaIniTF.getText();
		horaFinTFT = horaFinTF.getText();
		respReTFT = respReTF.getText();
		actividadesReTFT = actividadesReTF.getText();
		respProTFT = respProTF.getText();
		actividadesProTFT = actividadesProTF.getText();
		turnoCBT = turnoCB.getSelectedItem()+"";
		if(!horaIniTFT.isEmpty() && !horaFinTFT.isEmpty() && !respReTFT.isEmpty() && !actividadesReTFT.isEmpty() && !respProTFT.isEmpty() && !actividadesProTFT.isEmpty() && !turnoCBT.isEmpty()) {
			alta(horaIniTFT, horaFinTFT, actividadesReTFT, respReTFT, actividadesProTFT, respProTFT, turnoCBT);
		}
	}
	
	public void alta(String horaIniTFT,String horaFinTFT,String actividadesReTFT,String respReTFT,String actividadesProTFT,String respProTFT,String turnoCBT) {
		String consulta = "INSERT INTO BITACORA VALUES(SEQBITACORA.nextval,?,?,?,?,?,?,?,?,?)";
		Bd bd = new Bd();
		ArrayList<Object> parametros = new ArrayList<>();
		DatosLocales dL = new DatosLocales();
		parametros.add(new String(dL.obtenerFecha()));
		parametros.add(new String(horaIniTFT));
		parametros.add(new String(horaFinTFT));
		parametros.add(new String(actividadesReTFT));
		parametros.add(new String(respReTFT));
		parametros.add(new String(actividadesProTFT));
		parametros.add(new String(respProTFT));
		parametros.add(new String(turnoCBT));
		parametros.add(new Integer(1));
		bd.query(consulta,parametros);
		bd.cerrarConexion();
		JOptionPane.showMessageDialog(null, "El reporte se ha generado correctamente", "Aviso", 1);
	}
}
