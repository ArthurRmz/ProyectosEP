/**
 * CalcularMayorSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.soa.DatosDocument.Datos;
import com.soa.RespuestaDocument.Respuesta;

/**
 *  CalcularMayorSkeleton java skeleton for the axisService
 */
public class CalcularMayorImpl extends CalcularMayorSkeleton{
    /**
     * Auto generated method signature
     *
     * @param datos
     * @return respuesta
     */
    public RespuestaDocument calcular(DatosDocument datos) {
        RespuestaDocument resDoc = RespuestaDocument.Factory.newInstance();
        Respuesta res = resDoc.addNewRespuesta();
        Datos d = datos.getDatos();
        double num1 = d.getNumero1();
        double num2 = d.getNumero2();
        String mensaje = "El número "+num2+ " es mayor";
        if(num1>=num2)
        	mensaje = "El número "+num1+" es mayor";
        res.setMensaje(mensaje);
        return resDoc;
    }
}
