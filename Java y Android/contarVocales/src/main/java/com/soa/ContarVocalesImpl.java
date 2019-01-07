/**
 * ContarVocalesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.soa.ContarVocalesDocument.ContarVocales;
import com.soa.FraseDocument.Frase;

/**
 *  ContarVocalesSkeleton java skeleton for the axisService
 */
public class ContarVocalesImpl extends ContarVocalesSkeleton{
    /**
     * Auto generated method signature
     *
     * @param frase
     * @return contarVocales
     */
    public ContarVocalesDocument contar(FraseDocument frase) {
        ContarVocalesDocument doc = ContarVocalesDocument.Factory.newInstance();
        ContarVocales cont = doc.addNewContarVocales();
        Frase fras = frase.getFrase();
        String palabra = fras.getPalabra();
        char[] vocales = {'a','e','i','o','u'};
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
			for (int j = 0; j < vocales.length; j++) {
				if(Character.toLowerCase(palabra.charAt(i))==vocales[j])
					contador++;
			}
		}
        cont.setNumVocales(contador);
        return doc;
    }
}
