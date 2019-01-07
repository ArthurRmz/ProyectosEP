/**
 * 
 */
package admin;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author arthur
 *
 */
public class ExamenTec {

	private static Scanner teclado;

	public static void main(String[] args) {
		Operaciones oP = new Operaciones();
		teclado = new Scanner(System.in);
		String op;
		do {
			int n = oP.tamanioN();
			int m = oP.tamanioM();
			do {
				op="n";
				double porc = oP.porcentajeOro();
				int numElementos = oP.calcPorcentaje(n, m, porc);
				int Matrix[][] = new int[n][m];
				int Resul[][] = new int[n][m];
				oP.inicializarMatr(Matrix, n, m);
				oP.inicializarMatr(Resul, n, m);
				oP.llenaEstruc(Matrix, n, m, numElementos);
				oP.imprimeEstruc(Matrix, n, m);
				System.out.println("Norte - Sur");
				ArrayList<ArrayList<Posicion>> matrizRes = oP.buscarArribaAbajo(Matrix, Resul, n, m, 1);
				boolean norteSur = oP.listarZonas(matrizRes, n, m, 1);
				System.out.println("Oeste - Este");
				ArrayList<ArrayList<Posicion>> matrizRes1 = oP.buscarIzquierdaDerecha(Matrix, Resul, n, m, 1);
				boolean oesteEste = oP.listarZonas(matrizRes1, n, m, 2);
				if(!norteSur || !oesteEste) {
					System.out.println("Desea remojar nuevamente la placa S/N?");
					op = teclado.next();
				}
			} while (Character.toLowerCase(op.charAt(0))=='s');
			System.out.println("Desea repetir nuevamente el programa S/N?");
			op = teclado.next();
		} while (Character.toLowerCase(op.charAt(0))=='s');
	}
}
