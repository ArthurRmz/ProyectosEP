package edu.itq.soa.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import com.soa.dao.ClienteDao;
import com.soa.dao.CuentaDao;
import com.soa.dao.TarjetaDao;

public class ConsumerSpringListener implements MessageListener{

	private JmsSender jmsSender;
	private TarjetaDao tarjetaDao;
	private ClienteDao clienteDao;
	private CuentaDao cuentaDao;
	
	@Override
	public void onMessage(Message message) {
		
		String datos="";
		try {
			datos = ((TextMessage)message).getText();
		} catch (JMSException e) {}
		
		OperacionesValidar op = new OperacionesValidar();
		boolean tarjetaValida = op.checarCuenta(datos, tarjetaDao);
		int idCuenta = op.checarCliente(datos, clienteDao);
		double monto = Double.parseDouble(op.cortaMensaje(datos)[7]);
		String mensaje = "";
		if (tarjetaValida) {
//			System.out.println(idCuenta+" 12");
			if(idCuenta>0) {
				if(op.cobrarServicio(datos)) {
					mensaje = "Servicio pagado";
				}
				else{
					idCuenta = -1;
					mensaje = "Saldo insuficiente";
				}
			}else{
				idCuenta = op.agregarCuenta(datos, cuentaDao);
				op.agregarCliente(datos, idCuenta, clienteDao);
//				System.out.println("idCuenta: "+idCuenta);
				if(op.cobrarServicio(datos)) {
					mensaje = "Servicio pagado";
				}
				else{
					idCuenta = -1;
					mensaje = "Saldo insuficiente";
				}
			}
		}else{
			idCuenta = -1;
			mensaje = "Tarjeta no valida";
		}
		jmsSender.sendMessage("queue/B", idCuenta+","+monto+","+mensaje);
	}
	
	/**
	 * @param jmsSender the jmsSender to set
	 */
	public void setJmsSender(JmsSender jmsSender) {
		this.jmsSender = jmsSender;
	}

	/**
	 * @param tarjetaDao the tarjetaDao to set
	 */
	public void setTarjetaDao(TarjetaDao tarjetaDao) {
		this.tarjetaDao = tarjetaDao;
	}

	/**
	 * @param cuentaDao the cuentaDao to set
	 */
	public void setCuentaDao(CuentaDao cuentaDao) {
		this.cuentaDao = cuentaDao;
	}

	/**
	 * @param clienteDao the clienteDao to set
	 */
	public void setClienteDao(ClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}

}
