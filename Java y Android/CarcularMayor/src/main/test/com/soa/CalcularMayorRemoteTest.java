package com.soa;

import static org.junit.Assert.*;
import java.rmi.RemoteException;
import org.junit.Test;
import com.soa.CalcularMayorStub.Datos;
import com.soa.CalcularMayorStub.Respuesta;

public class CalcularMayorRemoteTest {

	@Test
	public void test() throws RemoteException {
		CalcularMayorStub stub = new CalcularMayorStub("http://localhost:8080/axis2/services/calcularMayor");
		Datos datos = new Datos();
		datos.setNumero1(2);
		datos.setNumero2(1);
		Respuesta res = stub.calcular(datos);
		System.out.println(res.getMensaje());
		assertEquals("El número 2.0 es mayor", res.getMensaje());
	}

}
