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

	@RequestMapping(value = "/calcular/{valor1}/{operador}/{valor2}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Mensaje> holaMundo(@PathVariable("valor1") double valor1,
			@PathVariable("operador") String operador, @PathVariable("valor2") double valor2) {
		Mensaje mensaje = new Mensaje();
		double res = 0.0;
		switch (operador) {
		case "+":
			res = valor1+valor2;
			break;
		case "-":
			res = valor1-valor2;
			break;
		case "*":
			res = valor1*valor2;
			break;
		case "div":
			res = valor1/valor2;
			break;
		default:
			res = 0.0;
			break;
		}
		mensaje.setNombre("El resultado es: "+res);
		ResponseEntity<Mensaje> resp = new ResponseEntity<Mensaje>(mensaje, HttpStatus.OK);
		return resp;
	}

	@RequestMapping(value = "/calcular1", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Respuesta> registrar(@RequestBody final Datos datos) {
		Respuesta respuesta = new Respuesta();
		String operador = datos.getOperador();
		double valor1 = datos.getValor1();
		double valor2 = datos.getValor2();
		double res = 0.0;
		switch (operador) {
		case "+":
			res = valor1+valor2;
			break;
		case "-":
			res = valor1-valor2;
			break;
		case "*":
			res = valor1*valor2;
			break;
		case "div":
			res = valor1/valor2;
			break;
		default:
			res = 0.0;
			break;
		}
		respuesta.setNombre("El resultado es: "+res); 
		ResponseEntity<Respuesta> resp = new ResponseEntity<Respuesta>(respuesta, HttpStatus.OK);
		return resp;
	}

}
