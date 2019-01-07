/**
 * ProveedorSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.soa.DarServicioDocument.DarServicio;

/**
 *  ProveedorSkeleton java skeleton for the axisService
 */
public class ProveedorImpl extends ProveedorSkeleton{
    /**
     * Auto generated method signature
     *
     * @param solicitarServicio
     * @return darServicio
     */
    public DarServicioDocument brindarServicio(SolicitarServicioDocument solicitarServicio) {
    	DarServicioDocument darServicioDocument = DarServicioDocument.Factory.newInstance();
    	DarServicio darServicio = darServicioDocument.addNewDarServicio();
    	Operaciones op = new Operaciones();
    	boolean respuesta = op.generarRespuesta();
    	darServicio.setRespuesta(respuesta);
    	return darServicioDocument;
    }
}
