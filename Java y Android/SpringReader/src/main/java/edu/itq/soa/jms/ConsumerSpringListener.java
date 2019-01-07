package edu.itq.soa.jms;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import com.servicios.qro.ServicioDocument;

public class ConsumerSpringListener implements MessageListener{

	private JmsSender jmsSender;
	
	@Override
	public void onMessage(Message message) {
		try {
			final String msg = ((TextMessage) message).getText();
			ServicioDocument doc = ServicioDocument.Factory.parse(msg);
			jmsSender.sendMessage("queue/A", doc.getServicio().getCliente());
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

}
