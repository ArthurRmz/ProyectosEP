package djikstra;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        ArrayList<Nodo> nodos = new ArrayList<Nodo>();
        operaciones.iniciarNodos(nodos);
        Grafo grafo = new Grafo(nodos);
        String nodoInicio="", nodoFinal="";
        operaciones.imprimirNodos(nodos);
        System.out.println("Ingresa el nodo de inicio: ");
        nodoInicio = teclado.next();
        nodoInicio = nodoInicio.toUpperCase();
        System.out.println("Ingresa el nodo de final: ");
        nodoFinal = teclado.next();
        nodoFinal = nodoFinal.toUpperCase();
        Tabla tabla = operaciones.djkistra(grafo, nodoInicio);
        System.out.println("Tabla de ruteo: ");
        operaciones.imprimeTabla(tabla.getEntradas());
        String rutaOptima = operaciones.caminoMasCorto(grafo, tabla, nodoInicio, nodoFinal);
        System.out.println("La ruta optima es: "+rutaOptima);
    }
    
}
