package com.soa;

public class Operaciones {
	public boolean generarRespuesta() {
		int rand = (int)(Math.random()*10);
		if(rand<=8) {
			return true;
		}
		return false;
	} 
}
