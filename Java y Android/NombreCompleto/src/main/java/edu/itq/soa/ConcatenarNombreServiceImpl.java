package edu.itq.soa;

import edu.itq.soa.RequestDocument.Request;
import edu.itq.soa.ResponseDocument.Response;

/**
 *  ConcatenarNombreServiceSkeleton java skeleton for the axisService
 */
public class ConcatenarNombreServiceImpl{
    /**
     * Auto generated method signature
     *
     * @param request
     * @return response
     */
    public ResponseDocument concatenarNombre(RequestDocument request) {
    	ResponseDocument doc = ResponseDocument.Factory.newInstance();
    	Response response = doc.addNewResponse();
    	Request req = request.getRequest();
    	response.setNombreCompleto(req.getNombre()+" "+req.getApellidoPaterno()+" "+req.getApellidoMaterno());
    	return doc;
    }
}
