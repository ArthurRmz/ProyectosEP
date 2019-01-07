/**
 * CalidadSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.soa.EntradaDocument.Entrada;
import com.soa.SalidaDocument.Salida;

/**
 *  CalidadSkeleton java skeleton for the axisService
 */
public class CalidadImpl extends CalidadSkeleton{
    /**
     * Auto generated method signature
     *
     * @param entrada
     * @return salida
     */
    public SalidaDocument asignar1(EntradaDocument entrada) {
    	SalidaDocument salidaDocument = SalidaDocument.Factory.newInstance();
        Salida salida = salidaDocument.addNewSalida();
        Entrada ent = entrada.getEntrada();
        double monto = ent.getMonto();
        OperacionesCalidad op = new OperacionesCalidad();
        double auxMonto = op.estadoProveedor(monto);
        String resultado = op.seleccionarPaquete(auxMonto);
        salida.setCalidad(resultado);
        return salidaDocument;
    }
}
