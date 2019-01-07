/**
 * IpTVSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.soa.ResponseServiceDocument.ResponseService;
import com.soa.ResquestServiceDocument.ResquestService;

import edu.itq.soa.jms.JmsSender;

/**
 * IpTVSkeleton java skeleton for the axisService
 */
public class IpTVImpl extends IpTVSkeleton {
	/**
	 * Auto generated method signature
	 *
	 * @param resquestService
	 * @return responseService
	 */
	private JmsSender jmsSender;

	public ResponseServiceDocument entrada(ResquestServiceDocument resquestService) {

		ResponseServiceDocument responseServiceDocument = ResponseServiceDocument.Factory.newInstance();
		ResponseService response = responseServiceDocument.addNewResponseService();
		ResquestService req = resquestService.getResquestService();
		String nombres = req.getNombres();
//		String mensaje = req.getNombres() + "," + req.getApePaterno() + "," + req.getApeMaterno() + ","
//				+ req.getCorreo() + "," + req.getNoTarjeta() + "," + req.getCodSegTarjeta() + ","
//				+ req.getFechaExpiracion() + "," + req.getMonto();
		jmsSender.sendMessage("queue/A", nombres);
		response.setRespuesta(true);
		return responseServiceDocument;
	}

	/**
	 * @param jmsSender the jmsSender to set
	 */
	public void setJmsSender(JmsSender jmsSender) {
		this.jmsSender = jmsSender;
	}

}
