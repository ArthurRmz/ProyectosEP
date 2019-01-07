package com.soa;

import java.rmi.RemoteException;
import com.soa.SolicitarServicioDocument.SolicitarServicio;

public class OperacionesPaquete {
	public String seleccionarPaquete(double monto) {
		String paquete = "";
		switch ((int)monto) {
		case 109:
			paquete = "Basico";
			break;

		case 149:
			paquete = "Estandar";
			break;

		case 199:
			paquete = "Premium";
			break;
		default:
			paquete = "Sin paquete";
			break;
		}
		return paquete;
	}

	public boolean brindarServicio(double monto) {
		boolean estado = true;
		try {
			ProveedorStub proveedorStub = new ProveedorStub();
			SolicitarServicioDocument solicitarServicioDocument = SolicitarServicioDocument.Factory.newInstance();
			SolicitarServicio solicitarServicio = solicitarServicioDocument.addNewSolicitarServicio();
			solicitarServicio.setMonto(monto);
			DarServicioDocument darServicio = proveedorStub.brindarServicio(solicitarServicioDocument);
			estado = darServicio.getDarServicio().getRespuesta();
		} catch (RemoteException e) {}
		return estado;
	}

	public double estadoProveedor(double monto) {
		boolean estatus = brindarServicio(monto);
		double valor = 0.0;
		if (estatus) {
			valor = monto;
		}
		return valor;
	}
}
