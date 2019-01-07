/**
 * 
 */
package admin;

import java.util.ArrayList;

/**
 * @author arthur
 *
 */
public class ExamenTec {

	public static void main(String[] args) {
		Operaciones oP = new Operaciones();
		int n = oP.tamanioN();
		int m = oP.tamanioM();
		System.out.println();
		int Matrix[][] = new int[n][m];
		int Resul[][] = new int[n][m];
		oP.inicializarMatr(Matrix, n, m);
		oP.inicializarMatr(Resul, n, m);
		oP.llenaEstruc(Matrix, n, m);
		oP.imprimeEstruc(Matrix, n, m);
		ArrayList<ArrayList<Posicion>> result = oP.zonaBusca(Matrix, Resul, n, m, 1);
		System.out.println();
		oP.listarZonas(result);
	}
}
