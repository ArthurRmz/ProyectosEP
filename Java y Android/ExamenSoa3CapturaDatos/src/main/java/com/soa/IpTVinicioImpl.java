/**
 * IpTVinicioSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.soa.EntradaDatosIniDocument.EntradaDatosIni;
import com.soa.SalidaDatosIniDocument.SalidaDatosIni;
import edu.itq.soa.jms.JmsSender;

/**
 * IpTVinicioSkeleton java skeleton for the axisService
 */
public class IpTVinicioImpl extends IpTVinicioSkeleton {
	/**
	 * Auto generated method signature
	 *
	 * @param entradaDatosIni
	 * @return salidaDatosIni
	 */

	private JmsSender jmsSender;

	public SalidaDatosIniDocument procesarDatosIni(EntradaDatosIniDocument entradaDatosIni) {
		SalidaDatosIniDocument salDoc = SalidaDatosIniDocument.Factory.newInstance();
		SalidaDatosIni sal = salDoc.addNewSalidaDatosIni();
		boolean respuesta = false;
		EntradaDatosIni ent = entradaDatosIni.getEntradaDatosIni();
		int monto = (int)ent.getMonto();
		if (monto == 109 || monto == 149 || monto == 199) {
			String nombres = ent.getNombres();
			String apellidoPaterno = ent.getApePaterno();
			String apellidoMaterno = ent.getApeMaterno();
			String correo = ent.getCorreo();
			int numTarjeta = ent.getNoTarjeta();
			int codTarjeta = ent.getCodSegTarjeta();
			String fecha = ent.getFechaExpiracion();
			String mensajeFinal = nombres + "," + apellidoPaterno + "," + apellidoMaterno + "," + correo + ","
					+ numTarjeta + "," + codTarjeta + "," + fecha + "," + monto;
			jmsSender.sendMessage("queue/A", mensajeFinal);
			respuesta = true;
		}
		sal.setRespuesta(respuesta);
		return salDoc;
	}

	/**
	 * @param jmsSender the jmsSender to set
	 */
	public void setJmsSender(JmsSender jmsSender) {
		this.jmsSender = jmsSender;
	}
}
