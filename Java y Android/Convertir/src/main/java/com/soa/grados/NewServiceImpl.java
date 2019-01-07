/**
 * NewServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa.grados;

import com.soa.grados.TemperaturaCentigradosDocument.TemperaturaCentigrados;
import com.soa.grados.TemperaturaFarenheitDocument.TemperaturaFarenheit;

/**
 *  NewServiceSkeleton java skeleton for the axisService
 */
public class NewServiceImpl extends NewServiceSkeleton{
    /**
     * Auto generated method signature
     *
     * @param temperaturaCentigrados
     * @return temperaturaFarenheit
     */
    public TemperaturaFarenheitDocument convertir(TemperaturaCentigradosDocument temperaturaCentigrados) {
    	TemperaturaFarenheitDocument doc = TemperaturaFarenheitDocument.Factory.newInstance();
    	TemperaturaFarenheit response = doc.addNewTemperaturaFarenheit();
    	TemperaturaCentigrados req = temperaturaCentigrados.getTemperaturaCentigrados();
    	double grados = req.getGrados();
    	response.setGrados(calcularFarenheit(grados));
    	return doc;
    	
    }
    public double calcularFarenheit(double grados) {
    	double resp = grados * 1.8 + 32;
    	return resp;
    }
}
