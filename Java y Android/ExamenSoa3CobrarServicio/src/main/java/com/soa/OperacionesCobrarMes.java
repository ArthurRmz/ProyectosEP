package com.soa;

import java.rmi.RemoteException;
import java.util.List;

import org.apache.axis2.AxisFault;
import com.soa.ResquestServiceDocument.ResquestService;
import com.soa.dao.TarjetaDao;
import com.soa.dto.TarjetaDto;

public class OperacionesCobrarMes {
	public boolean checarSaldo(ResquestService res) {
		double monto = res.getMonto();
		int codSegTarjeta = res.getCodSegTarjeta();
		int numTarjeta = res.getNoTarjeta();
		String fecha = res.getFechaExpiracion();
		boolean estado = false;
		try {
			BancoStub banco = new BancoStub();
			ResquestServiceDocument res1 = ResquestServiceDocument.Factory.newInstance();
			ResquestService resq = res1.addNewResquestService();
			resq.setNoTarjeta(numTarjeta);
			resq.setCodSegTarjeta(codSegTarjeta);
			resq.setFechaExpiracion(fecha);
			resq.setMonto(monto);
			ResponseServiceDocument response = banco.checarSaldo(res1);
			estado = response.getResponseService().getRespuesta();
		} catch (AxisFault e) {
		} catch (RemoteException e) {
		}
		return estado;
	}
	
	public boolean cobrarServicio(ResquestService res, TarjetaDao tarjetaDao) {
		boolean estado = false;
		boolean auxChecarSaldo = checarSaldo(res);
		if(auxChecarSaldo) {
			double monto = res.getMonto();
			int codSegTarjeta = res.getCodSegTarjeta();
			int numTarjeta = res.getNoTarjeta();
			TarjetaDto tarjeta = new TarjetaDto();
			tarjeta.setNoTarjeta(numTarjeta);
			tarjeta.setCodSegTarjeta(codSegTarjeta);
			List<TarjetaDto> list = tarjetaDao.query(tarjeta);
			double montoAux = list.get(0).getMonto();
			list.get(0).setMonto(montoAux-monto);
			tarjetaDao.update(list.get(0));
			estado = true;
		}
		return estado;
	}
}
