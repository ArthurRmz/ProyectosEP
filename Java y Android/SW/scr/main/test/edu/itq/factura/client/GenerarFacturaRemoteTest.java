package edu.itq.factura.client;

import java.rmi.RemoteException;
import org.junit.Assert;
import org.junit.Test;
import edu.itq.factura.client.GenerarFacturaServiceStub.Cliente_type0;
import edu.itq.factura.client.GenerarFacturaServiceStub.Domicilio_type0;
import edu.itq.factura.client.GenerarFacturaServiceStub.Factura;
import edu.itq.factura.client.GenerarFacturaServiceStub.Rfc_type1;
import edu.itq.factura.client.GenerarFacturaServiceStub.Solicitud;



public class GenerarFacturaRemoteTest {

	@Test
	public void test() throws RemoteException {
		GenerarFacturaServiceStub stub = new 
				GenerarFacturaServiceStub(
						"http://localhost:8080/axis2/services/generarFacturaService");
		Solicitud solicitud = new Solicitud();
		solicitud.setCantidad(10);
		solicitud.setConcepto("algo");
		Cliente_type0 cliente = new Cliente_type0();
		cliente.setNombre("asdf");
		Rfc_type1 rfc = new Rfc_type1();
		rfc.setRfc_type1("ABCD123456123");
		cliente.setRfc(rfc );
		Domicilio_type0 domicilio = new Domicilio_type0();
		domicilio.setCalle("calle1");
		domicilio.setCp("43223");
		domicilio.setNumero(3214);
		cliente.setDomicilio(domicilio );
		solicitud.setCliente(cliente);
		Factura factura = stub.generarFactura(solicitud );
		Assert.assertNotNull(factura);		
	}

}
