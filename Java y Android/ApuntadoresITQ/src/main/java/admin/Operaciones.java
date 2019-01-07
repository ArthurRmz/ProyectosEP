package admin;

import java.util.Scanner;

/**
 * @author arthur
 *
 */
public class Operaciones {

	Nodo raiz, ultimo;
	Scanner leer = new Scanner(System.in);

	boolean vacia() {
		if (raiz == null)
			return true;
		else
			return false;
	}

	char inicial() {
		System.out.println("Dame tu inicial: ");
		char in = leer.next().charAt(0);
		return in;
	}

	double edad() {
		System.out.println("Dame tu edad: ");
		double in = leer.nextDouble();
		return in;
	}

	void inserta() {
		Nodo nuevo = new Nodo();
		nuevo.inicial = inicial();
		nuevo.edad = edad();
		nuevo.brazo = null;
		if (vacia()) {
			raiz = nuevo;
			ultimo = nuevo;
		} else {
			ultimo.brazo = nuevo;
			ultimo = nuevo;
		}
	}

	void imprime() {
		Nodo temp = raiz;
		System.out.println("Listad de nodos");
		while (temp != null) {
			System.out.println("Inicial = " + temp.inicial + " Edad = " + temp.edad);
			temp = temp.brazo;
		}
		System.out.println();
	}

	void repite() {
		char opc = ' ';
		do {
			inserta();
			System.out.println("¿Quieres otro nodo S/N?");
			opc = leer.next().charAt(0);
		} while (opc == 's' || opc == 'S');
	}

}
