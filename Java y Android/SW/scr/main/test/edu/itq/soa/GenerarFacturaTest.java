package edu.itq.soa;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import edu.itq.factura.Cliente_type0;
import edu.itq.factura.Domicilio_type0;
import edu.itq.factura.Factura;
import edu.itq.factura.GenerarFacturaServiceSkeleton;
import edu.itq.factura.Rfc_type1;
import edu.itq.factura.Solicitud;

public class GenerarFacturaTest {

	@Test
	public void test() {
		GenerarFacturaServiceSkeleton ws = 
				new GenerarFacturaServiceSkeleton();
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
		Factura factura = ws.generarFactura(solicitud );
		org.junit.Assert.assertNotNull(factura);
	}

	@Test
	public void testRfc() {
		GenerarFacturaServiceSkeleton ws = 
				new GenerarFacturaServiceSkeleton();
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
		Factura factura = ws.generarFactura(solicitud );
		Assert.assertEquals("ABCD123456ABC", factura.getRfc().getRfc_type1());
	}

	@Test
	public void testRfc2() {
		GenerarFacturaServiceSkeleton ws = 
				new GenerarFacturaServiceSkeleton();
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
		Factura factura = ws.generarFactura(solicitud );
		Assert.assertNotEquals("fdsasadf", factura.getRfc().getRfc_type1());
	}

	@Test
	public void testFolio() {
		GenerarFacturaServiceSkeleton ws = 
				new GenerarFacturaServiceSkeleton();
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
		Factura factura = ws.generarFactura(solicitud );
		Assert.assertEquals("hola", factura.getFolio().substring(0, 4));
	}
}



