/**
 * GenerarTablaSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.soa.DatosDocument.Datos;
import com.soa.GenerarTablaDocument.GenerarTabla;

/**
 *  GenerarTablaSkeleton java skeleton for the axisService
 */
public class GenerarTablaImpl extends GenerarTablaSkeleton{

	/**
     * Auto generated method signature
     *
     * @param datos
     * @return generarTabla
     */
    public com.soa.GenerarTablaDocument generar(com.soa.DatosDocument datos) {
        GenerarTablaDocument doc = GenerarTablaDocument.Factory.newInstance();
        GenerarTabla generar = doc.addNewGenerarTabla();
        Pago pago = generar.addNewPago();
        Datos dato = datos.getDatos();
        Operaciones operaciones = new Operaciones();
        double monto = dato.getMonto();
        double interesMensual = operaciones.interesMensual(dato.getTasaInteres());
        int numMeses = dato.getPlazo();
        double mensualidad = operaciones.calcularMensualidad(interesMensual, numMeses, monto);
        double balance = monto;
        double interesPagado,principal;
        for (int i = 0; i < numMeses; i++) {
        	interesPagado = balance*interesMensual;
        	principal = mensualidad - interesPagado;
        	pago.setPagoMensual(operaciones.redondear(mensualidad));
        	pago.setInteres(operaciones.redondear(interesPagado));
        	pago.setPrincipal(operaciones.redondear(principal));
        	balance = balance - principal;
        	pago = generar.addNewPago();
		}
        return doc;
    }
}
