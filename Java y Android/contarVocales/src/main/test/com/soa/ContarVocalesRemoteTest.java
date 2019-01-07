package com.soa;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import org.junit.Test;
import com.soa.ContarVocalesStub.ContarVocales;
import com.soa.ContarVocalesStub.Frase;

public class ContarVocalesRemoteTest {

	@Test
	public void test() throws RemoteException {
		ContarVocalesStub stub = new ContarVocalesStub();
		Frase fr = new Frase();
		fr.setPalabra("perro");
		ContarVocales cont = stub.contar(fr);
		System.out.println(cont.getNumVocales());
		assertEquals(2, cont.getNumVocales());
		
	}

}
