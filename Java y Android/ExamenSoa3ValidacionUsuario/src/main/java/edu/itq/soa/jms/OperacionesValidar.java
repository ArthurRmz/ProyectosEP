package edu.itq.soa.jms;

import java.rmi.RemoteException;
import java.util.List;
import org.apache.axis2.AxisFault;
import com.soa.CobrarMesStub;
import com.soa.ResponseServiceDocument;
import com.soa.ResquestServiceDocument;
import com.soa.ResquestServiceDocument.ResquestService;
import com.soa.dao.ClienteDao;
import com.soa.dao.CuentaDao;
import com.soa.dao.TarjetaDao;
import com.soa.dto.ClienteDto;
import com.soa.dto.CuentaDto;
import com.soa.dto.TarjetaDto;

public class OperacionesValidar {

	public boolean checarCuenta(String datos, TarjetaDao tarjetaDao) {
		String[] array = cortaMensaje(datos);
		int numTarjeta = Integer.parseInt(array[4]);
		int codSeguridad = Integer.parseInt(array[5]);
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

	public String[] cortaMensaje(String datos) {
		String[] array = datos.split(",");
		return array;
	}

	public int checarCliente(String datos, ClienteDao clienteDao) {
		int idCuenta = -1;
		String[] array = cortaMensaje(datos);
		String nombres = array[0];
		String apePaterno = array[1];
		String apeMaterno = array[2];
		int noTarjeta = Integer.parseInt(array[4]);
//		System.out.println(nombres+","+apeMaterno+","+apePaterno+","+noTarjeta);
		ClienteDto cliente = new ClienteDto();
		cliente.setNombres(nombres);
		cliente.setApellidoPaterno(apePaterno);
		cliente.setApellidoMaterno(apeMaterno);
		cliente.setNoTarjeta(noTarjeta);
		try {
			List<ClienteDto> list = clienteDao.query(cliente);
			if (!list.isEmpty()) {
				idCuenta = list.get(0).getNumeroCuenta();
//				System.out.println(idCuenta+" 1");
			}
		} catch (Exception e) {}//System.out.println("error");
		return idCuenta;
	}

	public boolean cobrarServicio(String datos) {
		String[] array = cortaMensaje(datos);
		int numTarjeta = Integer.parseInt(array[4]);
		int codTarjeta = Integer.parseInt(array[5]);
		String fechaExp = array[6];
		double monto = Double.parseDouble(array[7]);
		boolean estado = false;
		try {
			CobrarMesStub cobrarMesStub = new CobrarMesStub();
			ResquestServiceDocument resDoc = ResquestServiceDocument.Factory.newInstance();
			ResquestService resq = resDoc.addNewResquestService();
			resq.setNoTarjeta(numTarjeta);
			resq.setCodSegTarjeta(codTarjeta);
			resq.setFechaExpiracion(fechaExp);
			resq.setMonto(monto);
			ResponseServiceDocument respDoc = cobrarMesStub.cobrarMensualidad(resDoc);
			estado = respDoc.getResponseService().getRespuesta();
		} catch (AxisFault e) {
		} catch (RemoteException e) {
		}
		return estado;
	}
	
	public int agregarCuenta(String datos,CuentaDao cuentaDao) {
		String[] array = cortaMensaje(datos);
		String correo = array[3];
		int idCuenta = 0;
		String paquete = "Sin paquete";
		String calidad = "Sin calidad";
		CuentaDto cuentaDto = new CuentaDto();
		cuentaDto.setCorreo(correo);
		cuentaDto.setCalidad(calidad);
		cuentaDto.setPaquete(paquete);
		idCuenta = cuentaDao.add(cuentaDto);
		return idCuenta;
	}
	
	public void agregarCliente(String datos,int idCuenta,ClienteDao clienteDao) {
		String[] array = cortaMensaje(datos);
		String nombres = array[0];
		String apePaterno = array[1];
		String apeMaterno = array[2];
		int noTarjeta = Integer.parseInt(array[4]);
		ClienteDto cliente = new ClienteDto();
		cliente.setNombres(nombres);
		cliente.setApellidoMaterno(apeMaterno);
		cliente.setApellidoPaterno(apePaterno);
		cliente.setNoTarjeta(noTarjeta);
		cliente.setNumeroCuenta(idCuenta);
		clienteDao.add(cliente);
	}
}
