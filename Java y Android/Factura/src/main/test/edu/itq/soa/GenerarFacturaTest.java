/**
 * 
 */
package edu.itq.soa;

import org.junit.Assert;
import org.junit.Test;
import edu.itq.factura.Cliente_type0;
import edu.itq.factura.Domicilio_type0;
import edu.itq.factura.Factura;
import edu.itq.factura.GenerarFacturaServiceSkeleton;
import edu.itq.factura.Rfc_type1;
import edu.itq.factura.Solicitud;

/**
 * @author arthur
 *
 */
public class GenerarFacturaTest {

	@Test
	public void test() {
		GenerarFacturaServiceSkeleton ws = new GenerarFacturaServiceSkeleton();
		Solicitud solicitud = new Solicitud();
		solicitud.setCantidad(10);
		solicitud.setConcepto("algo");
		Cliente_type0 cliente = new Cliente_type0();
		cliente.setNombre("asdf");
		Rfc_type1 rfc = new Rfc_type1();
		rfc.setRfc_type1("ABCD123456ABC");
		cliente.setRfc(rfc);
		Domicilio_type0 domicilio = new Domicilio_type0();
		domicilio.setCalle("calle1");
		domicilio.setNumero(1);
		cliente.setDomicilio(domicilio);
		Factura factura = ws.generarFactura(solicitud);
		Assert.assertEquals("ABCD123456ABC", factura.getRfc().getRfc_type1());
	}

}
