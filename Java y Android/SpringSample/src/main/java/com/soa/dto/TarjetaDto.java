package com.soa.dto;


/**
 * 
 * @author arthur
 *
 */

public class TarjetaDto {
	private int noTarjeta,codSegTarjeta;
	private String fechaExpiracion;
	private double monto;
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
	 * @return the codSegTarjeta
	 */
	public int getCodSegTarjeta() {
		return codSegTarjeta;
	}
	/**
	 * @param codSegTarjeta the codSegTarjeta to set
	 */
	public void setCodSegTarjeta(int codSegTarjeta) {
		this.codSegTarjeta = codSegTarjeta;
	}
	/**
	 * @return the fechaExpiracion
	 */
	public String getFechaExpiracion() {
		return fechaExpiracion;
	}
	/**
	 * @param fechaExpiracion the fechaExpiracion to set
	 */
	public void setFechaExpiracion(String fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	/**
	 * @return the monto
	 */
	public double getMonto() {
		return monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	
}
