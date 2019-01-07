package edu.itq.soa.jms;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import com.soa.CreditoDocument;

public class ConsumerSpringListener implements MessageListener{

	private JmsSender jmsSender;
	private Operaciones operaciones;
	
	@Override
	public void onMessage(Message message) {
		try {
			final String msg = ((TextMessage) message).getText();
			CreditoDocument doc = CreditoDocument.Factory.parse(msg);
			String mensaje = operaciones.prepararMensaje(doc);
			jmsSender.sendMessage("queue/B", mensaje);
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param jmsSender the jmsSender to set
	 */
	public void setJmsSender(JmsSender jmsSender) {
		this.jmsSender = jmsSender;
	}

	/**
	 * @param operaciones the operaciones to set
	 */
	public void setOperaciones(Operaciones operaciones) {
		this.operaciones = operaciones;
	}

}
