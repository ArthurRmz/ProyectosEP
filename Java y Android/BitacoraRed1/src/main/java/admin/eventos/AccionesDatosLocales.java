/**
 * 
 */
package admin.eventos;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import javax.swing.JTextField;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import admin.BitacoraRed;

/**
 * @author Arturo Ramírez Hernández
 *
 */
public class AccionesDatosLocales implements ItemListener {
	private JTextField direccionIP, direccionMAC;
	private static final Logger logger = LogManager.getLogger(BitacoraRed.class);

	public AccionesDatosLocales(JTextField direccionIP, JTextField direccionMAC) {
		this.direccionIP = direccionIP;
		this.direccionMAC = direccionMAC;
	}

	public String obtenerMAC() {
		NetworkInterface a;
		String linea = "";
		try {
			a = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
			byte[] mac = a.getHardwareAddress();

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mac.length; i++) {
				sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
			}
			linea = sb.toString();
			return linea;
		} catch (Exception e) {
		}
		return linea;
	}

	private String obtenerIP() throws UnknownHostException {
		String buffer = "";
		InetAddress inAdd = InetAddress.getLocalHost();
		buffer = inAdd.getHostAddress();
		return buffer;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			direccionMAC.setText(obtenerMAC());
			direccionIP.setEditable(false);
			direccionMAC.setEditable(false);
			try {
				direccionIP.setText(obtenerIP());
			} catch (UnknownHostException e1) {
				logger.error("Al parecer no estas conectado a una red" + e1.getMessage());
			}
		} else {
			direccionIP.setText("");
			direccionMAC.setText("");
			direccionIP.setEditable(true);
			direccionMAC.setEditable(true);
		}

	}

}
