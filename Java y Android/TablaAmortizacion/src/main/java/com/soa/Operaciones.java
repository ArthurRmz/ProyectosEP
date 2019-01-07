package com.soa;

public class Operaciones {
	public double interesMensual(double interesAnual) {
		return (interesAnual*0.01)/12;
	}
	
	public double calcularMensualidad(double interesMensual, int numMeses, double monto) {
		double res;
		res = (monto*(interesMensual*Math.pow(1.0+interesMensual, numMeses)))/(Math.pow(1.0+interesMensual, numMeses)-1.0);
		return res; 
	}
	
	public double redondear(double entrada) {
		double res = (Math.round(entrada*100.0))/100.0;
		return res;
	}
}
