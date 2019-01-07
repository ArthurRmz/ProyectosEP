package itq.admin.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuReportesAlta implements ActionListener{
	private  JDesktopPane p;
	private JPanel pInter;
	private int opcion=1;
	private String horaIni="",horafin="", actividadesRe="", responsableRe="", actividadPro ="", responsablePro="", turno="";
	private int id;
	
	/**
	 * @param p
	 */
	public MenuReportesAlta(JDesktopPane p) {
//		super();
		this.p = p;
	}

	/**
	 * @param p
	 * @param opcion
	 * @param horaIni
	 * @param horafin
	 * @param actividadesRe
	 * @param responsableRe
	 * @param actividadPro
	 * @param responsablePro
	 * @param turno
	 */
	public MenuReportesAlta(JDesktopPane p, int opcion, int id, String horaIni, String horafin, String actividadesRe,
			String responsableRe, String actividadPro, String responsablePro, String turno) {
		super();
		this.p = p;
		this.opcion = opcion;
		this.id = id;
		this.horaIni = horaIni;
		this.horafin = horafin;
		this.actividadesRe = actividadesRe;
		this.responsableRe = responsableRe;
		this.actividadPro = actividadPro;
		this.responsablePro = responsablePro;
		this.turno = turno;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		construirVentana();
	}
	
	public void construirVentana() {
		int width=p.getWidth()-10,height=p.getHeight()-30;
		JInternalFrame internalFrame = new JInternalFrame("Alta/Modificación de reportes", false, true, false, true);
		p.add(internalFrame);
		
		pInter = new JPanel();
		pInter.setLayout(null);
		pInter.setBounds(0, 0, width,height);
		
		JLabel horaIniL = new JLabel("Hora inicio");
		horaIniL.setBounds(10,10,100,30);
		
		JTextField horaIniTF = new JTextField();
		horaIniTF.setBounds(120,10,100,30);
		horaIniTF.setText(horaIni);
		
		JLabel horaFinL = new JLabel("Hora final");
		horaFinL.setBounds(230,10,100,30);
		
		JTextField horaFinTF = new JTextField();
		horaFinTF.setBounds(340,10,100,30);
		horaFinTF.setText(horafin);
		
		JLabel respReL = new JLabel("Responsable");
		respReL.setBounds(10,50,100,30);
		
		JTextField respReTF = new JTextField();
		respReTF.setBounds(120,50,100,30);
		respReTF.setText(responsableRe);
		
		JLabel actividadesReL = new JLabel("Act. realizadas");
		actividadesReL.setBounds(230,50,100,30);
		
		JTextField actividadesReTF = new JTextField();
		actividadesReTF.setBounds(340,50,100,30);
		actividadesReTF.setText(actividadesRe);
		
		JLabel respProL = new JLabel("Responsable");
		respProL.setBounds(10,90,100,30);
		
		JTextField respProTF = new JTextField();
		respProTF.setBounds(120,90,100,30);
		respProTF.setText(responsablePro);
		
		JLabel actividadesProL = new JLabel("Prox. actividades");
		actividadesProL.setBounds(230,90,100,30);
		
		JTextField actividadesProTF = new JTextField();
		actividadesProTF.setBounds(340,90,100,30);
		actividadesProTF.setText(actividadPro);
		
		JLabel turnoL = new JLabel("Turno");
		turnoL.setBounds(10,130,100,30);
		
		JComboBox<String> turnoCB = new JComboBox<String>();
		llenarComboBox(turnoCB);
		turnoCB.setBounds(120, 130, 100, 30);
		turnoCB.setSelectedItem(turno);
		
		JButton altaB = new JButton("Alta");
		altaB.setBounds(10, 170, 100, 30);
		opciones(altaB, opcion,horaIniTF,horaFinTF,respReTF,actividadesReTF,respProTF,actividadesProTF,turnoCB);
	
		pInter.add(horaIniL);
		pInter.add(horaIniTF);
		pInter.add(horaFinL);
		pInter.add(horaFinTF);
		pInter.add(respReL);
		pInter.add(respReTF);
		pInter.add(actividadesReL);
		pInter.add(actividadesReTF);
		pInter.add(respProL);
		pInter.add(respProTF);
		pInter.add(actividadesProL);
		pInter.add(actividadesProTF);
		pInter.add(turnoL);
		pInter.add(turnoCB);
		pInter.add(altaB);
		
		internalFrame.add(pInter);
        internalFrame.setSize(width,height);
        internalFrame.setVisible(true);
	}
	
	private void llenarComboBox(JComboBox<String> combo) {
		combo.addItem("Matutino");
		combo.addItem("Vespertino");
		combo.addItem("Nocturno");
	}
	
	private void opciones(JButton alta, int opcion, JTextField horaIniTF, JTextField horaFinTF,JTextField respReTF,JTextField actividadesReTF,JTextField respProTF, JTextField actividadesProTF, JComboBox<String> turnoCB) {
		if(opcion==1) {
			alta.addActionListener(new MenuReportesAltaAlta(horaIniTF,horaFinTF,respReTF,actividadesReTF,respProTF,actividadesProTF,turnoCB));
		}else{
			alta.setText("Actualizar");
			alta.addActionListener(new MenuReportesActualizar(id,horaIniTF,horaFinTF,respReTF,actividadesReTF,respProTF,actividadesProTF,turnoCB));
		}
	}
}
