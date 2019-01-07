package edu.itq.soa.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.springsample.dao.UsuarioDao;
import com.springsample.dto.UsuarioDto;

public class ConsumerSpringListener implements MessageListener {

	private JmsSender jmsSender;
	private UsuarioDao usuarioDao;

	@Override
	public void onMessage(Message arg0) {
		String  mensaje="",resultado = "";
		UsuarioDto usuarioDto = null;
		try {
			mensaje = ((TextMessage) arg0).getText();
		} catch (JMSException e) {
			e.printStackTrace();
		}
		
		usuarioDto = new UsuarioDto();
		usuarioDto.setLogin(mensaje);

		try {
			resultado = usuarioDao.listaUsuarios(usuarioDto);
		} catch (Exception e) {
			System.out.println("Error en transacción: " + e.getMessage());
		}

		jmsSender.sendMessage("queue/B", resultado);

	}

	/**
	 * @param jmsSender the jmsSender to set
	 */
	public void setJmsSender(JmsSender jmsSender) {
		this.jmsSender = jmsSender;
	}

	/**
	 * @param usuarioDao the usuarioDao to set
	 */
	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

}
