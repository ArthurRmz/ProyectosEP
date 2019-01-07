package com.springsample;

import static org.junit.Assert.*;

import java.awt.FontFormatException;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.soa.dao.ClienteDao;
import com.soa.dto.ClienteDto;
import com.springsample.dao.UsuarioDao;
import com.springsample.dto.UsuarioDto;

public class SpringTest {
	@Test
	public void test() {
		ApplicationContext context = null; // Context for creating beans.
		DataSourceTransactionManager txManagerJDBC = null;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;
		context = new ClassPathXmlApplicationContext("context.xml");
		txManagerJDBC = (DataSourceTransactionManager) context.getBean("transactionManager");
		try {
			def = new DefaultTransactionDefinition();
			def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
			status = txManagerJDBC.getTransaction(def);
		} catch (Exception e) {
			System.out.println("Error en definición de transacción: " + e.getMessage());
			return;
		}

		UsuarioDao usuarioDao = (UsuarioDao) context.getBean("usuarioDao");
		UsuarioDto usuarioDto = new UsuarioDto();
		usuarioDto.setId(1);
		usuarioDto.setLogin("arthur");
		usuarioDto.setPassword("pwd1");

		try {
			
			for (int i = 0; i < 10; i++)
				usuarioDao.add(usuarioDto);
//			usuarioDao.edit(usuarioDto);
//			UsuarioDto usuarioDto1 =  usuarioDao.getData(usuarioDto.getId());
//			usuarioDto1.show();
//			usuarioDto1.setLogin(usuarioDto1.getLogin()+"1");
//			usuarioDao.add(usuarioDto1);
//			usuarioDto1.setId(2);
//			usuarioDto1.show();
//			usuarioDao.quit(usuarioDto.getId());
//			usuarioDto1.show();		
//			usuarioDao.quit(2);
//			usuarioDao.quit(3);
		} catch (Exception e) {
			System.out.println("Error en transacción: " + e.getMessage());
			txManagerJDBC.rollback(status);
			return;
		}
		txManagerJDBC.commit(status);
	}
	@Test
	public void test1() {
		ApplicationContext context = null; // Context for creating beans.
		DataSourceTransactionManager txManagerJDBC = null;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;
		context = new ClassPathXmlApplicationContext("context.xml");
		txManagerJDBC = (DataSourceTransactionManager) context.getBean("transactionManager");
		try {
			def = new DefaultTransactionDefinition();
			def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
			status = txManagerJDBC.getTransaction(def);
		} catch (Exception e) {
			System.out.println("Error en definición de transacción: " + e.getMessage());
			return;
		}

		ClienteDao clienteDao = (ClienteDao) context.getBean("clienteDao");
		ClienteDto cliente = new ClienteDto();
		cliente.setNombres("arturo");
		cliente.setApellidoMaterno("hernandez");
		cliente.setApellidoPaterno("ramirez");
		cliente.setNoTarjeta(1006);
//		cliente.setNumeroCuenta(1);

		try {
			List<ClienteDto> array = clienteDao.query(cliente);
			for (ClienteDto clienteDto : array) {
				System.out.println(clienteDto.getNombres());
			}
		} catch (Exception e) {
			System.out.println("Error en transacción: " + e.getMessage());
			txManagerJDBC.rollback(status);
			return;
		}
		txManagerJDBC.commit(status);
	}
	
}
