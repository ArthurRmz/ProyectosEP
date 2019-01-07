package edu.itq.soa.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class ConsumerSpringListener implements MessageListener{

	private JmsSender jmsSender;
	
	@Override
	public void onMessage(Message message) {
		try {
			System.out.println("Enviando correo al usuario...");
			jmsSender.sendMessage("queue/C", ((TextMessage)message).getText());
		} catch (JMSException e) {
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
