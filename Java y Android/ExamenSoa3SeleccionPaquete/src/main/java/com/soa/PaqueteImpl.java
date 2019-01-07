/**
 * PaqueteSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.soa.EntradaPaqueteDocument.EntradaPaquete;
import com.soa.SalidaPaqueteDocument.SalidaPaquete;

/**
 *  PaqueteSkeleton java skeleton for the axisService
 */
public class PaqueteImpl extends PaqueteSkeleton{
    /**
     * Auto generated method signature
     *
     * @param entrada
     * @return salida
     */
    public SalidaPaqueteDocument asignar(EntradaPaqueteDocument entrada) {
        SalidaPaqueteDocument salidaDocument = SalidaPaqueteDocument.Factory.newInstance();
        SalidaPaquete salida = salidaDocument.addNewSalidaPaquete();
        EntradaPaquete ent = entrada.getEntradaPaquete();
        double monto = ent.getMonto();
        OperacionesPaquete op = new OperacionesPaquete();
        double auxMonto = op.estadoProveedor(monto);
        String resultado = op.seleccionarPaquete(auxMonto);
        salida.setPaquete(resultado);
        return salidaDocument;
    }
}
