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
import com.soa.dto.Registro;
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

	@RequestMapping(value = "/soa/{nombre}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Mensaje> holaMundo(@PathVariable("nombre") String nombre) {
		Mensaje mensaje = new Mensaje();
		mensaje.setNombre("Hola mundo " + nombre);
		ResponseEntity<Mensaje> resp = new ResponseEntity<Mensaje>(mensaje, HttpStatus.OK);
		return resp;
	}

	@RequestMapping(value = "/registrar", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Respuesta> registrar(@RequestBody final Registro registro) {
		Respuesta respuesta = new Respuesta();
		respuesta.setNombre(registro.getNombre());
		respuesta.setCodigo(env.getProperty("com.sample.code.base") + System.currentTimeMillis());
		ResponseEntity<Respuesta> resp = new ResponseEntity<Respuesta>(respuesta, HttpStatus.OK);
		return resp;
	}

}
