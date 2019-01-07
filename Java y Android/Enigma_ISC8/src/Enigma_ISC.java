import java.util.Scanner;

public class Enigma_ISC{
	public static void main(String[] args) {
		char alfabeto[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		OperacionesEnigma eN = new OperacionesEnigma();
		eN.imprimirAlfabeto(alfabeto);
		String clav = eN.pideClave(),mens = eN.pideDatosCifrar();
		int tamCve = clav.length();
		int[] valores = eN.buscaCaracteres(alfabeto,clav,mens);
		int[] valoresCve = new int[tamCve];
		int j = 0,sub=0,x=0,pos=0;
		while(j<mens.length()) {
			for(int i=0;i<tamCve;i++) {
				valoresCve[i] = valores[i+j]; 
			}
			sub = eN.mult(valoresCve)+ eN.suma(valoresCve);
			x = (sub/alfabeto.length)*alfabeto.length;
			pos = sub - x;
			j++;
			valores[(tamCve-1)+j] = pos;
		}
		System.out.print("Mensaje encriptado: "+eN.imprimirMen(alfabeto, valores).substring(tamCve));
	}
}
class OperacionesEnigma{
	Scanner leer = new Scanner(System.in);
	void imprimirAlfabeto(char A[]) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	String pideClave() {
		System.out.print("Clave: ");
		String cve = leer.nextLine();
		return cve; 
	}
	String pideDatosCifrar() {
		System.out.print("Datos: ");
		String cve = leer.nextLine();
		return cve;
	}
	String concatenaCveDatos() {
		String palabra = pideClave()+pideDatosCifrar();
		System.out.println("Palabra = "+palabra);
		return palabra;
	}
	int[] buscaCaracteres(char A[],String clav, String mens) {
		String pal = clav+mens;
		int[] val = new int[pal.length()];
		for(int i=0;i<pal.length();i++) {
			for (int j = 0; j < A.length; j++) {
				if(pal.toUpperCase().charAt(i) == A[j] && i<val.length) {
					val[i] = j+1;
				}
			}
		}
		return val;
	}
	String imprimirMen(char A[],int[] vector) {
		String cadena="";
		for(int i=0;i<vector.length;i++) {
			//System.out.print(vector[i]+" ");
			for (int j = 0; j < A.length; j++) { 
				if(vector[i] == (j+1)) {
					cadena += A[j];
					break;
				}
				else if(vector[i] == 0){
					cadena += "Z";
					break;
				}
			}
		}
		return cadena;
	}
	
	int mult(int[] valores) {
		int mult = 1;
		for (int i = 0; i < valores.length; i++) {
			mult = mult*valores[i];			
		}
		return mult;
	}
	int suma(int[] valores) {
		int sum = 0;
		for (int i = 0; i < valores.length; i++) {
			sum+=valores[i];			
		}
		return sum;
	}
}