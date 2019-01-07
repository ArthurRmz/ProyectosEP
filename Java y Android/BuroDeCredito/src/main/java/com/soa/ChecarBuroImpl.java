/**
 * ChecarBuroSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.soa.ConsultarBuroDocument.ConsultarBuro;

/**
 *  ChecarBuroSkeleton java skeleton for the axisService
 */
public class ChecarBuroImpl extends ChecarBuroSkeleton{
    /**
     * Auto generated method signature
     *
     * @param solicitarCredito
     * @return consultarBuro
     */
    public ConsultarBuroDocument ver(SolicitarCreditoDocument solicitarCredito) {
		ConsultarBuroDocument doc = ConsultarBuroDocument.Factory.newInstance();
		ConsultarBuro consultarBuro = doc.addNewConsultarBuro();
		Operaciones operaciones = new Operaciones();
		boolean respuesta = operaciones.generarRespuesta();
		consultarBuro.setRespuesta(respuesta);
		return doc;
    }
}
