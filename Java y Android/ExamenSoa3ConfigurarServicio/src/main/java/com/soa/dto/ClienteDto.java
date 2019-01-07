package com.soa.dto;


/**
 * 
 * @author arthur
 *
 */

public class ClienteDto {
	private int clienteId,numeroCuenta,noTarjeta;
	private String nombres,apellidoPaterno,apellidoMaterno;
	/**
	 * @return the clienteId
	 */
	public int getClienteId() {
		return clienteId;
	}
	/**
	 * @param clienteId the clienteId to set
	 */
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
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
	 * @return the noTarjeta
	 */
	public int getNoTarjeta() {
		return noTarjeta;
	}
	/**
	 * @param noTarjeta the noTarjeta to set
	 */
	public void setNoTarjeta(int noTarjeta) {
		this.noTarjeta = noTarjeta;
	}
	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	/**
	 * @param apellidoPaterno the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	/**
	 * @return the apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	/**
	 * @param apellidoMaterno the apellidoMaterno to set
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	
}
