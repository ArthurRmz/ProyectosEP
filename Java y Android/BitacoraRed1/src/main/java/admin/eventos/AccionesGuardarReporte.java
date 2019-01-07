/**
 * 
 */
package admin.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextField;

/**
 * @author Arturo Ramírez Hernández
 *
 */
public class AccionesGuardarReporte implements ActionListener {
	private JTextField nombreRedTF, numeroPartesTF, macAddressTF, ipTF, adminPasswordTF, recursoComTF, permisosTF,
			proxyTF, gatewayTF, dnsTF, responsableTF, firmaTF;

	/**
	 * @param nombreRedTF
	 * @param numeroPartesTF
	 * @param macAddressTF
	 * @param ipTF
	 * @param adminPasswordTF
	 * @param recursoComTF
	 * @param permisosTF
	 * @param proxyTF
	 * @param gatewayTF
	 * @param dnsTF
	 * @param responsableTF
	 * @param firmaTF
	 */
	public AccionesGuardarReporte(JTextField nombreRedTF, JTextField numeroPartesTF, JTextField macAddressTF,
			JTextField ipTF, JTextField adminPasswordTF, JTextField recursoComTF, JTextField permisosTF,
			JTextField proxyTF, JTextField gatewayTF, JTextField dnsTF, JTextField responsableTF, JTextField firmaTF) {
		this.nombreRedTF = nombreRedTF;
		this.numeroPartesTF = numeroPartesTF;
		this.macAddressTF = macAddressTF;
		this.ipTF = ipTF;
		this.adminPasswordTF = adminPasswordTF;
		this.recursoComTF = recursoComTF;
		this.permisosTF = permisosTF;
		this.proxyTF = proxyTF;
		this.gatewayTF = gatewayTF;
		this.dnsTF = dnsTF;
		this.responsableTF = responsableTF;
		this.firmaTF = firmaTF;
	}

	public void crearArchivo(String archivo) {
		FileWriter fw;
		BufferedWriter bw;
		PrintWriter pw;
		try {
			fw = new FileWriter(archivo, true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.write(nombreRedTF.getText() + "|");
			pw.write(numeroPartesTF.getText() + "|");
			pw.write(macAddressTF.getText() + "|");
			pw.write(ipTF.getText() + "|");
			pw.write(adminPasswordTF.getText() + "|");
			pw.write(recursoComTF.getText() + "|");
			pw.write(permisosTF.getText() + "|");
			pw.write(proxyTF.getText() + "|");
			pw.write(gatewayTF.getText() + "|");
			pw.write(dnsTF.getText() + "|");
			pw.write(responsableTF.getText() + "|");
			pw.write(firmaTF.getText());
			pw.write("\n");
			bw.close();
		} catch (IOException ex) {
		}
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getID() == ActionEvent.ACTION_PERFORMED) {
			crearArchivo("bitacora.txt");
		}
	}

}
