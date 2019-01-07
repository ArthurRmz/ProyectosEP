/**
 * GenerarFacturaServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package edu.itq.factura;

/**
 *  GenerarFacturaServiceSkeleton java skeleton for the axisService
 */
public class GenerarFacturaServiceSkeleton {
    /**
     * Auto generated method signature
     *
     * @param solicitud
     * @return factura
     */
    public Factura generarFactura(Solicitud solicitud) {
    	Factura factura = new Factura();
    	factura.setFolio("Hola: "+System.currentTimeMillis());
    	Rfc_type1 rfc = new Rfc_type1();
    	rfc.setRfc_type1("ABCD123456ABC");
    	factura.setRfc(rfc);
    	return factura;
    }
}
