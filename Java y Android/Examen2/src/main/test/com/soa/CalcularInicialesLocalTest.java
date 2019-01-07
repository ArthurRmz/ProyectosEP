package com.soa;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import com.soa.CalcularInicialesStub.ReqArturo;
import com.soa.CalcularInicialesStub.ResArturo;

public class CalcularInicialesLocalTest {

	@Test
	public void test() throws RemoteException {
		CalcularInicialesStub stub = new CalcularInicialesStub();
		ReqArturo req = new ReqArturo();
		req.setNombres("Arturo x");
		req.setApellidoPaterno("Ramirez");
		req.setApellidoMaterno("Hernandez");
		ResArturo res = stub.iniciales(req);
		System.out.println(res.getIniciales());
		assertEquals("ARH", res.getIniciales());
	}

}
