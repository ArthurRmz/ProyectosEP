package com.soa;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.google.gson.Gson;
import com.soa.dto.Datos;
import com.soa.dto.Respuesta;

public class HelloWorldRestTest {

	private static final String BASE_URL = 
			"http://localhost:8080/Edad-1.0.0/";
	
	@Test
	public void test3() {
		Datos datos = new Datos();
		datos.setNombre("arturo");
		datos.setApePaterno("Ramirez");
		datos.setApeMaterno("Hernandez");
		datos.setDia(23);
		datos.setMes(5);
		datos.setAnio(1996);
		Gson gson = new Gson();
		String json = gson.toJson(datos);
		System.out.println(json);
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		List<MediaType> mediaTypes = new ArrayList<MediaType>();
		mediaTypes.add(MediaType.APPLICATION_JSON);
		headers.setAccept(mediaTypes);
		
		HttpEntity<Datos> request = new HttpEntity<Datos>(datos, headers);
		ResponseEntity<Respuesta> resp = restTemplate.exchange(BASE_URL + "edadPersona", 
				HttpMethod.POST, request , Respuesta.class);
		System.out.println(resp.getBody().getNombreCompleto());
		System.out.println(resp.getBody().getEdad());
//		System.out.println(resp.getStatusCodeValue());
//		System.out.println(resp.getHeaders());
		Assert.assertNotNull(resp);
	}
}
