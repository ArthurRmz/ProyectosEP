/**
 * EsPalindromoSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa.palindromo;

import com.soa.palindromo.RequestDocument.Request;
import com.soa.palindromo.ResponseDocument.Response;

/**
 *  EsPalindromoSkeleton java skeleton for the axisService
 */
public class EsPalindromoImpl extends EsPalindromoSkeleton{
    /**
     * Auto generated method signature
     *
     * @param request
     * @return response
     */
    public ResponseDocument palindromo(RequestDocument request) {
		ResponseDocument doc = ResponseDocument.Factory.newInstance();
		Response response = doc.addNewResponse();
		Request req = request.getRequest();
		String palabra = req.getPalabra().trim(),inv="";
		boolean estado = false;
		for (int i = palabra.length()-1; i >= 0; i--) {
			inv+=palabra.charAt(i);
		}
		
		if (inv.equals(palabra)) 
			estado = true;
		response.setEsPalindromo(estado);
		return doc;
    	
    }
}
