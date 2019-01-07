package com.soa.palindromo;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import org.junit.Test;
import com.soa.palindromo.EsPalindromoStub.Request;
import com.soa.palindromo.EsPalindromoStub.Response;

public class EsPalindromoRemoteTest {

	@Test
	public void test() throws RemoteException {
		EsPalindromoStub stub = new EsPalindromoStub();
		Request request = new Request();
		request.setPalabra("ana");
		Response res = stub.palindromo(request);
		System.out.println(res.getEsPalindromo());
		assertEquals(true, res.getEsPalindromo());
	}

}
