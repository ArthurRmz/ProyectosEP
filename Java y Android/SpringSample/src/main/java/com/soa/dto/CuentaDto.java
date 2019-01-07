package com.soa.dto;


/**
 * 
 * @author arthur
 *
 */

public class CuentaDto {
	private int numeroCuenta;
	private String correo,calidad,paquete;
	/**
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * @return the calidad
	 */
	public String getCalidad() {
		return calidad;
	}
	/**
	 * @param calidad the calidad to set
	 */
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}
	/**
	 * @return the paquete
	 */
	public String getPaquete() {
		return paquete;
	}
	/**
	 * @param paquete the paquete to set
	 */
	public void setPaquete(String paquete) {
		this.paquete = paquete;
	}
	
	
}
