package edu.itq.soa.jms;

import java.rmi.RemoteException;
import org.apache.axis2.AxisFault;
import com.soa.CalidadStub;
import com.soa.EntradaDocument;
import com.soa.EntradaDocument.Entrada;
import com.soa.EntradaPaqueteDocument;
import com.soa.EntradaPaqueteDocument.EntradaPaquete;
import com.soa.SalidaPaqueteDocument.SalidaPaquete;
import com.soa.PaqueteStub;
import com.soa.SalidaDocument;
import com.soa.SalidaPaqueteDocument;
import com.soa.dao.CuentaDao;
import com.soa.dto.CuentaDto;

public class OperacionesConfigurar {

	public String[] cortaMensaje(String datos) {
		String[] array = datos.split(",");
		return array;
	}

	public String seleccionarCalidad(double monto) {
		String res = "";
		try {
			CalidadStub calidadStub = new CalidadStub();
			EntradaDocument entradaDoc = EntradaDocument.Factory.newInstance();
			Entrada en = entradaDoc.addNewEntrada();
			en.setMonto(monto);
			SalidaDocument salidaDoc = calidadStub.asignar1(entradaDoc);
			res = salidaDoc.getSalida().getCalidad();
		} catch (AxisFault e) {
		} catch (RemoteException e) {
		}
		return res;
	}
	
	public String seleccionarPaquete(double monto) {
		String res = "";
		try {
			PaqueteStub paqueteStub = new PaqueteStub();
			EntradaPaqueteDocument entPaquete = EntradaPaqueteDocument.Factory.newInstance();
			EntradaPaquete en = entPaquete.addNewEntradaPaquete();
			en.setMonto(monto);
			SalidaPaqueteDocument sal = paqueteStub.asignar(entPaquete);
			res = sal.getSalidaPaquete().getPaquete();
		} catch (AxisFault e) {
		} catch (RemoteException e) {
		}
		return res;
	}
	
	public void actualizarDatos(String paquete, String calidad, int numCuenta, CuentaDao cuentaDao) {
		CuentaDto cuenta = new CuentaDto();
		cuenta.setNumeroCuenta(numCuenta);
		cuenta.setPaquete(paquete);
		cuenta.setCalidad(calidad);
		cuentaDao.update(cuenta);
	}
}
