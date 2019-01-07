/**
 * BancoSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.soa.ResponseServiceDocument.ResponseService;
import com.soa.ResquestServiceDocument.ResquestService;
import com.soa.dao.TarjetaDao;

/**
 *  BancoSkeleton java skeleton for the axisService
 */
public class BancoImpl extends BancoSkeleton{
    /**
     * Auto generated method signature
     *
     * @param resquestService
     * @return responseService
     */
	private TarjetaDao tarjetaDao;
	

	public ResponseServiceDocument checarSaldo(ResquestServiceDocument resquestService) {
		ResponseServiceDocument responseServiceDocument = ResponseServiceDocument.Factory.newInstance();
		ResponseService resp = responseServiceDocument.addNewResponseService();
		ResquestService res = resquestService.getResquestService();
		int noTarjeta = res.getNoTarjeta();
		int codSeg = res.getCodSegTarjeta();
		double monto = res.getMonto();
		OperacionesBanco op = new OperacionesBanco();
		boolean respuesta = false;
		respuesta = op.cuentaValida(noTarjeta, codSeg, monto, tarjetaDao);
		resp.setRespuesta(respuesta);
		return responseServiceDocument;
    }
	
	/**
	 * @param tarjetaDao the tarjetaDao to set
	 */
	public void setTarjetaDao(TarjetaDao tarjetaDao) {
		this.tarjetaDao = tarjetaDao;
	}
}
