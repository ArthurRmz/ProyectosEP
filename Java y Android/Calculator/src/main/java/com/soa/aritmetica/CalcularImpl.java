/**
 * CalcularSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa.aritmetica;

import com.soa.aritmetica.CalculatorDocument.Calculator;
import com.soa.aritmetica.CalculatorResponseDocument.CalculatorResponse;

/**
 *  CalcularSkeleton java skeleton for the axisService
 */
public class CalcularImpl extends CalcularSkeleton{
    /**
     * Auto generated method signature
     *
     * @param calculator
     * @return calculatorResponse
     */
    public CalculatorResponseDocument calcular(CalculatorDocument calculator) {
    	CalculatorResponseDocument doc = CalculatorResponseDocument.Factory.newInstance();
    	CalculatorResponse response = doc.addNewCalculatorResponse();
    	Calculator req = calculator.getCalculator();
    	double numero1 =  req.getNumber1();
    	double numero2 = req.getNumber2();
    	double respuesta = 0;
    	String operador = req.getOperator();
    	switch (operador) {
		case "+":
			respuesta = numero1 + numero2;
			break;
		case "-":
			respuesta = numero1 - numero2;
			break;
		case "*":
			respuesta = numero1 * numero2;
			break;
		case "/":
			respuesta = numero1 / numero2;
			break;
		default:
			respuesta = 0;
			break;
		}
    	response.setResultado(respuesta);
    	return doc;
    }
}
