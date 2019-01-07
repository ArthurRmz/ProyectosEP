package itq.admin.acciones;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DatosLocales {
	public String obtenerMAC() {
		NetworkInterface a;
		String linea = "Sin MAC";
		try {
			a = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
			byte[] mac = a.getHardwareAddress();

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mac.length; i++) {
				sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
			}
			linea = sb.toString();
			return linea;
		} catch (Exception e) {
		}
		return linea;
	}

	public String obtenerIP(){
		String buffer = "127.0.0.1";
		InetAddress inAdd;
		try {
			inAdd = InetAddress.getLocalHost();
			buffer = inAdd.getHostAddress();
		} catch (UnknownHostException e) {}
		
		return buffer;
	}
	
	public String obtenerFecha() {
		String fecha="";
		String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		Calendar c = new GregorianCalendar();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = meses[c.get(Calendar.MONTH)];
		String annio = Integer.toString(c.get(Calendar.YEAR));
		String hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
		String minuto = Integer.toString(c.get(Calendar.MINUTE));;
		fecha+=dia+"-"+mes+"-"+annio+" "+hora+":"+minuto;
		return fecha;
	}
}
