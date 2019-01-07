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
import com.soa.dto.Registro;
import com.soa.dto.Respuesta;
import com.soa.service.Mensaje;

public class HelloWorldRestTest {

	private static final String BASE_URL = 
			"http://localhost:8080/SpringRest-1.0.0/";

	@Test
	public void test() {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		List<MediaType> mediaTypes = new ArrayList<MediaType>();
		mediaTypes.add(MediaType.APPLICATION_JSON);
		headers.setAccept(mediaTypes);
		
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<Mensaje> resp = restTemplate.exchange(BASE_URL + "/testName", 
				HttpMethod.GET, request , Mensaje.class);
		System.out.println(resp.getBody().getNombre());
		System.out.println(resp.getStatusCodeValue());
		System.out.println(resp.getHeaders());
		Assert.assertNotNull(resp);
	}

	@Test
	public void test2() {
		Registro registro = new Registro();
		registro.setNombre("arturo");
		registro.setDomicilio("Agata");
		registro.setCp("1234");
		Gson gson = new Gson();
		String json = gson.toJson(registro);
		System.out.println(json);
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		List<MediaType> mediaTypes = new ArrayList<MediaType>();
		mediaTypes.add(MediaType.APPLICATION_JSON);
		headers.setAccept(mediaTypes);
		
		HttpEntity<Registro> request = new HttpEntity<Registro>(registro, headers);
		ResponseEntity<Respuesta> resp = restTemplate.exchange(BASE_URL + "registrar", 
				HttpMethod.POST, request , Respuesta.class);
		System.out.println(resp.getBody().getNombre());
		System.out.println(resp.getStatusCodeValue());
		System.out.println(resp.getHeaders());
		Assert.assertNotNull(resp);
	}
}
