package enigmaArchivo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.imageio.IIOException;

public class Archivos {
	Scanner leer = new Scanner(System.in);
	//String ipOrigen="",ipDestino="",protocolo="",datos="";
	String ipOrigen() {
		System.out.println("Ip origen: ");
		String ip = leer.next();
        Binario bin = new Binario();
        return bin.cifBinario(ip);
	}
	
	String ipDestino() {
		System.out.println("Ip destino: ");
		String ip = leer.next();
        Binario bin = new Binario();
        return bin.cifBinario(ip);
	}
	
	String protocolo() {
		System.out.println("Protocolo a usar: ");
		String proto = leer.next();
        Binario bin = new Binario();
        return bin.cifBinario(proto);
	}

	String datos() {
		OperacionesEnigma enigma = new OperacionesEnigma();
//		System.out.println("Enigma: ");
		String datosEncrip = enigma.cifrar();
		Binario bin = new Binario();
//		System.out.print(datosEncrip);
//		System.out.print(bin.cifBinario(datosEncrip));
		return bin.cifBinario(datosEncrip);
	}
	
	String aceptacion() {
        System.out.println("Aceptacion: ");
        String acep = leer.next();
        Binario bin = new Binario();
        return bin.cifBinario(acep);
	}
	
	void crearArchivo(String archivo) {
		FileWriter fw;
		BufferedWriter bw;
		PrintWriter pw;
		try {
			fw = new FileWriter(archivo);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.print(ipOrigen()+"|");
			pw.print(ipDestino()+"|");
			pw.print(protocolo()+"|");
			pw.print(datos()+"|");
			pw.print(aceptacion());
			bw.close();
		}catch(IOException ex) {}
	}
}
