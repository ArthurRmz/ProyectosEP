/**
 * 
 */
package com.soa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.soa.dto.Datos;
import com.soa.dto.Respuesta;

/**
 * @author tlopez
 *
 */
@RestController
@PropertySource("classpath:helloworld.properties")
public class HelloWorldRestService {

	@Autowired
	private Environment env;
	
	@RequestMapping(value = "/edadPersona", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Respuesta> registrar(@RequestBody final Datos datos) {
		Respuesta respuesta = new Respuesta();
		String nombre = datos.getNombre();
		String paterno = datos.getApePaterno();
		String materno = datos.getApeMaterno();
		int edad = 2018-datos.getAnio();
		respuesta.setNombreCompleto(nombre+paterno+materno); 
		respuesta.setEdad(edad);
		ResponseEntity<Respuesta> resp = new ResponseEntity<Respuesta>(respuesta, HttpStatus.OK);
		return resp;
	}

}
