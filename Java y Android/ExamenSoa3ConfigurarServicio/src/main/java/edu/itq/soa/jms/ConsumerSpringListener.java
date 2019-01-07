package edu.itq.soa.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import com.soa.dao.CuentaDao;

public class ConsumerSpringListener implements MessageListener{

	private JmsSender jmsSender;
	private CuentaDao cuentaDao;
	
	@Override
	public void onMessage(Message message) {
		String datos="";
		try {
			datos = ((TextMessage)message).getText();
		} catch (JMSException e) {}
		OperacionesConfigurar op = new OperacionesConfigurar();
		double monto = Double.parseDouble(op.cortaMensaje(datos)[1]);
		String calidad = "Sin calidad";
		String paquete = "Sin paquete";
		String mensaje = op.cortaMensaje(datos)[2];
		int noCuenta = Integer.parseInt(op.cortaMensaje(datos)[0]);
		if (noCuenta>0) {
			calidad = op.seleccionarCalidad(monto);
			paquete = op.seleccionarPaquete(monto);
			op.actualizarDatos(paquete, calidad, noCuenta, cuentaDao);
		}
		jmsSender.sendMessage("queue/C", calidad+"\r\n"+paquete+"\r\n"+mensaje);
	}
	
	/**
	 * @param jmsSender the jmsSender to set
	 */
	public void setJmsSender(JmsSender jmsSender) {
		this.jmsSender = jmsSender;
	}

	/**
	 * @param cuentaDao the cuentaDao to set
	 */
	public void setCuentaDao(CuentaDao cuentaDao) {
		this.cuentaDao = cuentaDao;
	}

}
