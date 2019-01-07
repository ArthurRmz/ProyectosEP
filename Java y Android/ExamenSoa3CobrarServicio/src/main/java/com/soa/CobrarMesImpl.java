/**
 * CobrarMesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.soa.ResponseServiceDocument.ResponseService;
import com.soa.ResquestServiceDocument.ResquestService;
import com.soa.dao.TarjetaDao;

/**
 *  CobrarMesSkeleton java skeleton for the axisService
 */
public class CobrarMesImpl extends CobrarMesSkeleton{
    /**
     * Auto generated method signature
     *
     * @param resquestService
     * @return responseService
     */
	private TarjetaDao tarjetaDao;
	
    public ResponseServiceDocument cobrarMensualidad(ResquestServiceDocument resquestService) {
    	ResponseServiceDocument doc = ResponseServiceDocument.Factory.newInstance();
    	ResponseService respo = doc.addNewResponseService();
    	ResquestService res = resquestService.getResquestService();
    	OperacionesCobrarMes op = new OperacionesCobrarMes();
    	boolean respuesta = op.cobrarServicio(res, tarjetaDao);
		respo.setRespuesta(respuesta);
    	return doc;
    }

	/**
	 * @param tarjetaDao the tarjetaDao to set
	 */
	public void setTarjetaDao(TarjetaDao tarjetaDao) {
		this.tarjetaDao = tarjetaDao;
	}
    
}
