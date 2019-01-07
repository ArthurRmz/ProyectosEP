package edu.itq.soa.jms;

import java.rmi.RemoteException;
import java.text.DecimalFormat;
import org.apache.axis2.AxisFault;
import com.soa.ChecarBuroStub;
import com.soa.ChecarBuroStub.ConsultarBuro;
import com.soa.ChecarBuroStub.SolicitarCredito;
import com.soa.CreditoDocument;
import com.soa.DatosDocument;
import com.soa.DatosDocument.Datos;
import com.soa.GenerarTablaDocument;
import com.soa.GenerarTablaDocument.GenerarTabla;
import com.soa.GenerarTablaStub;
import com.soa.Pago;

public class Operaciones {
	private ChecarBuroStub checarBuroStub;
	private GenerarTablaStub generarTablaStub;
	
	private boolean checarBuro(CreditoDocument doc) {
		String curp=doc.getCredito().getCurp(), domicilio=doc.getCredito().getDomicilio(); 
		double salario=doc.getCredito().getSalario(), monto=doc.getCredito().getMonto();
		boolean res = false;
		try {
//			checarBuroStub = new ChecarBuroStub("http://localhost:8082/axis2/services/checarBuro");
			SolicitarCredito solicitarCredito = new SolicitarCredito();
			solicitarCredito.setCurp(curp);
			solicitarCredito.setDomicilio(domicilio);
			solicitarCredito.setMonto(monto);
			solicitarCredito.setSalario(salario);
			ConsultarBuro consultarBuro = checarBuroStub.ver(solicitarCredito);
			res = consultarBuro.getRespuesta();  
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	private String generarTabla(CreditoDocument doc) {
		String buffer = "";
		double monto = doc.getCredito().getMonto();
		double tasaInt = doc.getCredito().getTasaInteres();
		int meses = doc.getCredito().getPlazo();
		try {
//			generarTablaStub = new GenerarTablaStub("http://localhost:8082/axis2/services/generarTabla");
			DatosDocument datosDocument = DatosDocument.Factory.newInstance();
			Datos datos = datosDocument.addNewDatos();
			datos.setMonto(monto);
			datos.setTasaInteres(tasaInt);
			datos.setPlazo(meses);
			GenerarTablaDocument generarTablaDocument = generarTablaStub.generar(datosDocument);
			GenerarTabla generarTabla1 = generarTablaDocument.getGenerarTabla();
			Pago[] pago = generarTabla1.getPagoArray();
			String aux = ((int)pago[0].getPagoMensual())+"";
			String formato = obtenerFormato(aux);
			DecimalFormat decimales = new DecimalFormat(formato);
			buffer += "Tabla de amortización\r\n";
			for (int i = 0; i < meses; i++) {
				String pagoMensual = decimales.format(pago[i].getPagoMensual());
				String interes = decimales.format(pago[i].getInteres());
				String principal = decimales.format(pago[i].getPrincipal());
				buffer += pagoMensual+"  "+interes+"  "+principal+"\r\n";
			}
		} catch (AxisFault e) {
//			 TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buffer;
		
	}
	
	private String obtenerFormato(String aux) {
		String formato="";
		int iteraciones = aux.length()/3;
		int residuo = aux.length()-(iteraciones*3);
		formato+="$";
		for (int i = 0; i < residuo; i++) {
			formato+="0";
		}
		formato+=",";
		for (int i = 0; i < iteraciones; i++) {
			formato+="000";
			if(i==(iteraciones-1))
				formato+=".";
			else
				formato+=",";
		}
		formato+="00";
		return formato;
	}
	
	public String prepararMensaje(CreditoDocument doc) {
		boolean estado = checarBuro(doc);
		String nombre = doc.getCredito().getNombre();
		String apellidos = doc.getCredito().getApellidos();
		String mens = "";
		String tabla="";
		System.out.println("Enviando y procesando información");
		if(estado) {
			mens = "Estimado usuario "+nombre+" "+apellidos+" se ha aceptado el credito que solicitaste"+"\r\n";	
			tabla = generarTabla(doc);
		}
		else {
			mens = "Estimado usuario "+nombre+" "+apellidos+" lamentablemente no se ha aceptado el credito que solicitaste"+"\r\n";
		}
		return mens+tabla;
	}

	/**
	 * @param checarBuroStub the checarBuroStub to set
	 */
	public void setChecarBuroStub(ChecarBuroStub checarBuroStub) {
		this.checarBuroStub = checarBuroStub;
	}

	/**
	 * @param generarTablaStub the generarTablaStub to set
	 */
	public void setGenerarTablaStub(GenerarTablaStub generarTablaStub) {
		this.generarTablaStub = generarTablaStub;
	}
}
