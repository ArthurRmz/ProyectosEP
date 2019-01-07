/**
 * 
 */
package admin;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import jdk.nashorn.internal.runtime.arrays.NumericElements;

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

	double porcentajeOro() {
		System.out.print("%Oro = ");
		double m = teclado.nextDouble();
		return m;
	}

	int calcPorcentaje(int n, int m, double porcentaje) {
		double numColumnas = n * m;
//		System.out.println(numColumnas);
		double porcentajeAux = porcentaje * 0.01;
		return (int) Math.round(numColumnas * porcentajeAux);
	}

	/**
	 * 
	 * @param M
	 * @param n
	 * @param m
	 */
	void llenaEstruc(int M[][], int n, int m, int numElementos) {
		int numElementosAux = numElementos;
		while (numElementosAux != 0) {
			int x = ran.nextInt(n), y = ran.nextInt(m);
			if (M[x][y] == 0) {
				M[x][y] = 1;
				numElementosAux--;
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
	ArrayList<ArrayList<Posicion>> buscarArribaAbajo(int M[][], int R[][], int n, int m, int prof) {
		ArrayList<ArrayList<Posicion>> result = new ArrayList<>();
		ArrayList<Posicion> posiciones = new ArrayList<>();
		for (int j = 0; j < m; j++) {
			int x = 0, y = j;
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
				if (R[x][y] == 0 && M[x][y] > 0) {
					posRes.add(new Posicion(x, y, M[x][y]));
					R[x][y] = 1;
					recorrer(posiciones, M, R, x, y, prof);
					c++;
				}
				estado = true;
			} while (!posiciones.isEmpty());
			if (c >= 1 && buscarPuntoFinalNS(posRes, n)) {
				result.add(posRes);
				inicializarMatr(R, n, m);
			}
		}
		return result;
	}

	boolean buscarPuntoFinalNS(ArrayList<Posicion> posRes, int n) {
		boolean estado = false;
		for (int i = 0; i < posRes.size(); i++) {
			if(posRes.get(i).getX()==(n-1)){
				estado = true;
				break;
			}
		}
		return estado;
	}
	
	boolean buscarPuntoFinalID(ArrayList<Posicion> posRes, int n) {
		boolean estado = false;
		for (int i = 0; i < posRes.size(); i++) {
			if(posRes.get(i).getY()==(n-1)){
				estado = true;
				break;
			}
		}
		return estado;
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
	ArrayList<ArrayList<Posicion>> buscarIzquierdaDerecha(int M[][], int R[][], int n, int m, int prof) {
		ArrayList<ArrayList<Posicion>> result = new ArrayList<>();
		ArrayList<Posicion> posiciones = new ArrayList<>();
		for (int j = 0; j < n; j++) {
			int x = j, y = 0;
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
				if (R[x][y] == 0 && M[x][y] > 0) {
					posRes.add(new Posicion(x, y, M[x][y]));
					R[x][y] = 1;
					recorrer(posiciones, M, R, x, y, prof);
					c++;
				}
				estado = true;
			} while (!posiciones.isEmpty());
			if (c >= 1 && buscarPuntoFinalID(posRes, m)) {
				result.add(posRes);
				inicializarMatr(R, n, m);
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
		if (M[x][y] == movValido(M, x + profundidad, y + profundidad)
				&& movValido(R, x + profundidad, y + profundidad) == 0)
			posiciones.add(new Posicion(x + profundidad, y + profundidad, M[x + profundidad][y + profundidad]));
		// Aba
		if (M[x][y] == movValido(M, x + profundidad, y) && movValido(R, x + profundidad, y) == 0)
			posiciones.add(new Posicion(x + profundidad, y, M[x + profundidad][y]));
		// Izq Aba
		if (M[x][y] == movValido(M, x + profundidad, y - profundidad)
				&& movValido(R, x + profundidad, y - profundidad) == 0)
			posiciones.add(new Posicion(x + profundidad, y - profundidad, M[x + profundidad][y - profundidad]));
		// Izq
		if (M[x][y] == movValido(M, x, y - profundidad) && movValido(R, x, y - profundidad) == 0)
			posiciones.add(new Posicion(x, y - profundidad, M[x][y - profundidad]));
		// Izq Arr
		if (M[x][y] == movValido(M, x - profundidad, y - profundidad)
				&& movValido(R, x - profundidad, y - profundidad) == 0)
			posiciones.add(new Posicion(x - profundidad, y - profundidad, M[x - profundidad][y - profundidad]));
		// Arr
		if (M[x][y] == movValido(M, x - profundidad, y) && movValido(R, x - profundidad, y) == 0)
			posiciones.add(new Posicion(x - profundidad, y, M[x - profundidad][y]));
		// Der Arr
		if (M[x][y] == movValido(M, x - profundidad, y + profundidad)
				&& movValido(R, x - profundidad, y + profundidad) == 0)
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
	boolean listarZonas(ArrayList<ArrayList<Posicion>> array, int n, int m, int recorrido) {
		int x = 0, y = 0, aux = 0;
		boolean estado = false;
		switch (recorrido) {
//		Norte a sur
		case 1:
			for (int i = 0; i < array.size(); i++) {
				System.out.println("Posición de inicio : ["+array.get(i).get(0).getX()+","+array.get(i).get(0).getY()+"]");
				for (int j = 0; j < array.get(i).size(); j++) {
					x = array.get(i).get(j).getX();
					y = array.get(i).get(j).getY();
					if(x==(n-1)) {
						System.out.println("[" + x + "," + y + "]");
						aux++;
					}
				}
			}
			break;
//			Oeste a este
		case 2:
			for (int i = 0; i < array.size(); i++) {
				System.out.println("Posición de inicio : ["+array.get(i).get(0).getX()+","+array.get(i).get(0).getY()+"]");
				for (int j = 0; j < array.get(i).size(); j++) {
					x = array.get(i).get(j).getX();
					y = array.get(i).get(j).getY();
					if(y==(m-1)) {
						System.out.println("[" + x + "," + y + "]");
						aux++;
					}
				}
			}
			break;
		default:
			break;
		}
		if(aux>0)
			estado = true;
		return estado;
	}
}
