/**
 * CalcularInicialesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa;

import com.soa.ReqArturoDocument.ReqArturo;
import com.soa.ResArturoDocument.ResArturo;

/**
 *  CalcularInicialesSkeleton java skeleton for the axisService
 */
public class CalcularInicialesImpl extends CalcularInicialesSkeleton{
    /**
     * Auto generated method signature
     *
     * @param reqArturo
     * @return resArturo
     */
    public com.soa.ResArturoDocument iniciales(com.soa.ReqArturoDocument reqArturo) {
        ResArturoDocument resDoc = ResArturoDocument.Factory.newInstance();
        ResArturo res = resDoc.addNewResArturo();
        ReqArturo req = reqArturo.getReqArturo();
        String[] nombres = req.getNombres().split(" ");
        String apellPaterno = req.getApellidoPaterno();
        String apellMaterno = req.getApellidoMaterno();
        String iniciales = "";
        for (int i = 0; i < nombres.length; i++) {
			iniciales += Character.toUpperCase(nombres[i].charAt(0));
		}
        iniciales+=Character.toUpperCase(apellPaterno.charAt(0));
        iniciales+=Character.toUpperCase(apellMaterno.charAt(0));
        res.setIniciales(iniciales);
        return resDoc;
    }
}
