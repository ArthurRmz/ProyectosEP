/**
 * IpTVSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.springsample.dao.UsuarioDao;
import com.springsample.dto.UsuarioDto;
import com.soa.ResponseServiceDocument;
import com.soa.ResponseServiceDocument.ResponseService;
import com.soa.ResquestServiceDocument;
import com.soa.ResquestServiceDocument.ResquestService;

/**
 *  IpTVSkeleton java skeleton for the axisService
 */
public class IpTVImpl extends IpTVSkeleton{
    /**
     * Auto generated method signature
     *
     * @param resquestService
     * @return responseService
     */
	private UsuarioDao usuarioDao;
	
    public ResponseServiceDocument entrada(ResquestServiceDocument resquestService) {
    	
    	ResponseServiceDocument responseServiceDocument = ResponseServiceDocument.Factory.newInstance();
    	ResponseService responseService = responseServiceDocument.addNewResponseService();
    	ResquestService req = resquestService.getResquestService();
    	UsuarioDto usuarioDto = new UsuarioDto();
    	usuarioDto.setLogin(req.getNombres());
    	usuarioDto.setPassword(req.getNombres()+req.getCodSegTarjeta());
    	usuarioDao.add(usuarioDto);
    	responseService.setRespuesta(true);
		return responseServiceDocument;
    }

	/**
	 * @param usuarioDao the usuarioDao to set
	 */
	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
}
