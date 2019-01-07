/**
 * 
 */
package com.soa.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tlopez
 *
 */
@RestController
public class HelloWorldRestService {

	@RequestMapping(value = "/saludar/{nombre}/{apellido}", 
			method = RequestMethod.GET, 
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Mensaje> holaMundo(
			@PathVariable("nombre") String nombre,
			@PathVariable("apellido") String apellido) {
		Mensaje mensaje = new Mensaje();
		mensaje.setNombre("Hola mundo " + nombre + " " + apellido);
		ResponseEntity<Mensaje> resp = 
				new ResponseEntity<Mensaje>(mensaje, HttpStatus.OK);
		return resp;
	}
}
