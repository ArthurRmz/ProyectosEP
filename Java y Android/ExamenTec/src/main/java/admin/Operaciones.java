/**
 * 
 */
package admin;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author arthur
 *
 */
class Operaciones {
	Scanner teclado = new Scanner(System.in);
	Random ran = new Random();

	/**
	 * 
	 * @return
	 */
	int tamanioN() {
		System.out.print("N = ");
		int n = teclado.nextInt();
		return n;
	}

	/**
	 * 
	 * @return
	 */
	int tamanioM() {
		System.out.print("M = ");
		int m = teclado.nextInt();
		return m;
	}

	/**
	 * 
	 * @param M
	 * @param n
	 * @param m
	 */
	void llenaEstruc(int M[][], int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				M[i][j] = ran.nextInt(3) + 1;
			}
		}
	}

	/**
	 * 
	 * @param M
	 * @param n
	 * @param m
	 */
	void imprimeEstruc(int M[][], int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.println("");
		}
	}

	/**
	 * 
	 * @param M
	 * @param n
	 * @param m
	 */
	void inicializarMatr(int[][] M, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				M[i][j] = 0;
			}
		}
	}

	/**
	 * 
	 * @param M
	 * @param R
	 * @param n
	 * @param m
	 * @param prof
	 * @return
	 */
	ArrayList<ArrayList<Posicion>> zonaBusca(int M[][], int R[][], int n, int m, int prof) {
		ArrayList<ArrayList<Posicion>> result = new ArrayList<>();
		ArrayList<Posicion> posiciones = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int x = i, y = j;
				boolean estado = false;
				int c = 0;
				ArrayList<Posicion> posRes = new ArrayList<>();
				do {
					if (estado) {
						Posicion temp = new Posicion();
						temp = posiciones.remove(0);
						x = temp.getX();
						y = temp.getY();
					}
					if (R[x][y] == 0) {
						posRes.add(new Posicion(x, y, M[x][y]));
						R[x][y] = 1;
						recorrer(posiciones, M, R, x, y, prof);
						c++;
					}
					estado = true;
				} while (!posiciones.isEmpty());
				if (c >= 1)
					result.add(posRes);
			}
		}
		return result;
	}

	/**
	 * 
	 * @param posiciones
	 * @param M
	 * @param R
	 * @param x
	 * @param y
	 * @param profundidad
	 */
	void recorrer(ArrayList<Posicion> posiciones, int M[][], int R[][], int x, int y, int profundidad) {
		// Der
		if (M[x][y] == movValido(M, x, y + profundidad) && movValido(R, x, y + profundidad) == 0)
			posiciones.add(new Posicion(x, y + profundidad, M[x][y + profundidad]));
		// Der Aba
		if (M[x][y] == movValido(M, x + profundidad, y + profundidad) && movValido(R, x + profundidad, y + profundidad) == 0)
			posiciones.add(new Posicion(x + profundidad, y + profundidad, M[x + profundidad][y + profundidad]));
		// Aba
		if (M[x][y] == movValido(M, x + profundidad, y) && movValido(R, x + profundidad, y) == 0)
			posiciones.add(new Posicion(x + profundidad, y, M[x + profundidad][y]));
		// Izq Aba
		if (M[x][y] == movValido(M, x + profundidad, y - profundidad) && movValido(R, x + profundidad, y - profundidad) == 0)
			posiciones.add(new Posicion(x + profundidad, y - profundidad, M[x + profundidad][y - profundidad]));
		// Izq
		if (M[x][y] == movValido(M, x, y - profundidad) && movValido(R, x, y - profundidad) == 0)
			posiciones.add(new Posicion(x, y - profundidad, M[x][y - profundidad]));
		// Izq Arr
		if (M[x][y] == movValido(M, x - profundidad, y - profundidad) && movValido(R, x - profundidad, y - profundidad) == 0)
			posiciones.add(new Posicion(x - profundidad, y - profundidad, M[x - profundidad][y - profundidad]));
		// Arr
		if (M[x][y] == movValido(M, x - profundidad, y) && movValido(R, x - profundidad, y) == 0)
			posiciones.add(new Posicion(x - profundidad, y, M[x - profundidad][y]));
		// Der Arr
		if (M[x][y] == movValido(M, x - profundidad, y + profundidad) && movValido(R, x - profundidad, y + profundidad) == 0)
			posiciones.add(new Posicion(x - profundidad, y + profundidad, M[x - profundidad][y + profundidad]));
	}

	/**
	 * 
	 * @param M
	 * @param x
	 * @param y
	 * @return
	 */
	int movValido(int[][] M, int x, int y) {
		int n = -1;
		try {
			n = M[x][y];
			return n;
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		return n;
	}

	/**
	 * 
	 * @param array
	 */
	void listarZonas(ArrayList<ArrayList<Posicion>> array) {
		int val = 0, x = 0, y = 0;
		for (int i = 0; i < array.size(); i++) {
			val = array.get(i).get(0).getValor();
			System.out.println("Zona #" + (i + 1) + " {" + val + "}");
			for (int j = 0; j < array.get(i).size(); j++) {
				x = array.get(i).get(j).getX();
				y = array.get(i).get(j).getY();
				System.out.println("[" + x + "," + y + "]");
			}
		}
	}
}
