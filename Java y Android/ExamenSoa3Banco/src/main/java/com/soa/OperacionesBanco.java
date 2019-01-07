package com.soa;

import java.util.List;

import com.soa.dao.TarjetaDao;
import com.soa.dto.TarjetaDto;

public class OperacionesBanco {

	public boolean checarCuenta(int numTarjeta, int codSeguridad, TarjetaDao tarjetaDao) {
		boolean estado = false;
		TarjetaDto tarjetaDto = new TarjetaDto();
		tarjetaDto.setNoTarjeta(numTarjeta);
		tarjetaDto.setCodSegTarjeta(codSeguridad);
		try {
			List<TarjetaDto> list = tarjetaDao.query(tarjetaDto);
			if (!list.isEmpty()) {
				estado = true;
			}
		} catch (Exception e) {
		}

		return estado;
	}

	public boolean saldoDisponible(int numTarjeta, int codSeguridad, double saldo, TarjetaDao tarjetaDao) {
		boolean estado = false;
		TarjetaDto tarjetaDto = new TarjetaDto();
		tarjetaDto.setNoTarjeta(numTarjeta);
		tarjetaDto.setCodSegTarjeta(codSeguridad);
		try {
			List<TarjetaDto> list = tarjetaDao.query(tarjetaDto);
			if (!list.isEmpty()) {
				if (list.get(0).getMonto() >= saldo) {
					estado = true;
				}
			}
		} catch (Exception e) {
		}
		return estado;
	}

	public boolean cuentaValida(int numTarjeta, int codSeguridad, double saldo, TarjetaDao tarjetaDao) {
		boolean estado = false;
		boolean estadoCuenta = checarCuenta(numTarjeta, codSeguridad, tarjetaDao);
		boolean saldoDisponible = saldoDisponible(numTarjeta, codSeguridad, saldo, tarjetaDao);
		if (estadoCuenta && saldoDisponible) {
			estado = true;
		}
		return estado;
	}
}
