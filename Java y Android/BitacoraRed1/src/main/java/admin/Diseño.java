/**
 * 
 */
package admin;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import admin.eventos.AccionesDatosLocales;
import admin.eventos.AccionesGuardarReporte;


/**
 * @author Arturo Ramírez Hernández
 *
 */
public class Diseño extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private int width = 520, height = 330;
	private String titulo = "Bitácora de red";
	private JPanel p;
	private JLabel nombreRedL, numeroPartesL, macAddressL, ipL, adminPasswordL, recursoComL, permisosL, proxyL,
			gatewayL, dnsL, responsableL, firmaL;
	private JTextField nombreRedTF, numeroPartesTF, macAddressTF, ipTF, adminPasswordTF, recursoComTF, permisosTF,
			proxyTF, gatewayTF, dnsTF, responsableTF, firmaTF;
	private JCheckBox datosLocales;
	private JButton guardarReporte;

	public Diseño() {
		p = new JPanel();
		p.setLayout(null);
		p.setBounds(0, 0, width, height);

		nombreRedL = new JLabel("Nombre red:");
		nombreRedL.setBounds(10, 10, 100, 30);

		nombreRedTF = new JTextField("");
		nombreRedTF.setBounds(120, 10, 130, 30);
		nombreRedTF.setToolTipText("Ingresa el nombre de la red");

		numeroPartesL = new JLabel("Número partes:");
		numeroPartesL.setBounds(10, 50, 100, 30);

		numeroPartesTF = new JTextField("");
		numeroPartesTF.setBounds(120, 50, 130, 30);
		numeroPartesTF.setToolTipText("Ingresa el número de partes");

		macAddressL = new JLabel("Dirección MAC:");
		macAddressL.setBounds(10, 90, 100, 30);

		macAddressTF = new JTextField("");
		macAddressTF.setBounds(120, 90, 130, 30);
		macAddressTF.setToolTipText("Ingresa la dirección MAC");

		ipL = new JLabel("Dirección IP:");
		ipL.setBounds(10, 130, 100, 30);

		ipTF = new JTextField("");
		ipTF.setBounds(120, 130, 130, 30);
		ipTF.setToolTipText("Ingresa la dirección IP");

		adminPasswordL = new JLabel("Indicios");
		adminPasswordL.setBounds(10, 170, 100, 30);

		adminPasswordTF = new JTextField("");
		adminPasswordTF.setBounds(120, 170, 130, 30);
		adminPasswordTF.setToolTipText("Ingresa los indicios de claves");

		recursoComL = new JLabel("Recursos:");
		recursoComL.setBounds(10, 210, 100, 30);

		recursoComTF = new JTextField("");
		recursoComTF.setBounds(120, 210, 130, 30);
		recursoComTF.setToolTipText("Ingresa los recursos compartidos");

		permisosL = new JLabel("Permisos:");
		permisosL.setBounds(260, 10, 100, 30);

		permisosTF = new JTextField("");
		permisosTF.setBounds(370, 10, 130, 30);
		permisosTF.setToolTipText("Ingresa los permisos del recurso compartido");

		proxyL = new JLabel("Proxy:");
		proxyL.setBounds(260, 50, 100, 30);

		proxyTF = new JTextField("");
		proxyTF.setBounds(370, 50, 130, 30);
		proxyTF.setToolTipText("Ingresa la dirección Ip del proxy");

		gatewayL = new JLabel("Gateway");
		gatewayL.setBounds(260, 90, 100, 30);

		gatewayTF = new JTextField("");
		gatewayTF.setBounds(370, 90, 130, 30);
		gatewayTF.setToolTipText("Ingresa la dirección del gateway");

		dnsL = new JLabel("DNS:");
		dnsL.setBounds(260, 130, 100, 30);

		dnsTF = new JTextField("");
		dnsTF.setBounds(370, 130, 130, 30);
		dnsTF.setToolTipText("Ingresa la dirección del DNS");

		responsableL = new JLabel("Responsable");
		responsableL.setBounds(260, 170, 100, 30);

		responsableTF = new JTextField("");
		responsableTF.setBounds(370, 170, 130, 30);
		responsableTF.setToolTipText("Ingresa el nombre del responsable");

		firmaL = new JLabel("Firma:");
		firmaL.setBounds(260, 210, 100, 30);

		firmaTF = new JTextField("");
		firmaTF.setBounds(370, 210, 130, 30);
		firmaTF.setToolTipText("Ingresa la firma del responsable");

		datosLocales = new JCheckBox("Usar datos locales");
		datosLocales.setBounds(370, 250, 200, 20);
		datosLocales.setFocusable(true);

		guardarReporte = new JButton("Guardar reporte");
		guardarReporte.setBounds(10, 250, 130, 30);

		p.add(nombreRedL);
		p.add(nombreRedTF);
		p.add(numeroPartesL);
		p.add(numeroPartesTF);
		p.add(macAddressL);
		p.add(macAddressTF);
		p.add(ipL);
		p.add(ipTF);
		p.add(adminPasswordL);
		p.add(adminPasswordTF);
		p.add(recursoComL);
		p.add(recursoComTF);
		p.add(permisosL);
		p.add(permisosTF);
		p.add(proxyL);
		p.add(proxyTF);
		p.add(gatewayL);
		p.add(gatewayTF);
		p.add(dnsL);
		p.add(dnsTF);
		p.add(responsableL);
		p.add(responsableTF);
		p.add(firmaL);
		p.add(firmaTF);
		p.add(datosLocales);
		p.add(guardarReporte);

		add(p);

		guardarReporte.addActionListener(new AccionesGuardarReporte(nombreRedTF, numeroPartesTF, macAddressTF, ipTF,
				adminPasswordTF, recursoComTF, permisosTF, proxyTF, gatewayTF, dnsTF, responsableTF, firmaTF));
		datosLocales.addItemListener(new AccionesDatosLocales(ipTF, macAddressTF));

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}
		});

		setResizable(false);
		setTitle(titulo);
		setSize(width, height);
		setLayout(null);
		setVisible(true);
	}
}
