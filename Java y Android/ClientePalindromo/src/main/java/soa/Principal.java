package soa;

import java.rmi.RemoteException;
import com.soa.palindromo.EsPalindromoStub;
import com.soa.palindromo.RequestDocument;
import com.soa.palindromo.ResponseDocument;

public class Principal {

	public static void main(String[] args) throws RemoteException {
		EsPalindromoStub esPalindromoStub = new EsPalindromoStub("http://localhost:8082/axis2/services/esPalindromo?wsdl");
		RequestDocument requestDocument = RequestDocument.Factory.newInstance();
		requestDocument.addNewRequest().setPalabra("ana");
		ResponseDocument responseDocument = esPalindromoStub.palindromo(requestDocument);
		System.out.println(responseDocument.getResponse().getEsPalindromo());
		
//		ValidarPalindromoStub validarPalindromoStub = new ValidarPalindromoStub("http://localhost:8082/axis2/services/esPalindromo?wsdl");
//		RequestDocument requestDocument = RequestDocument.Factory.newInstance();
//		requestDocument.addNewRequest().setPalabra("ana");
//		ResponseDocument responseDocument = validarPalindromoStub.validarPalindromoOperation(requestDocument);
//		System.out.println(responseDocument.getResponse().getEsPalindromo());
		
	}
}
