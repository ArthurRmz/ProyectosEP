package edu.itq.admin.operaciones;

import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;

public class DrawCanvas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Vector<Nodo> vectorNodos;
	private Vector<Arista> vectorAristas;

	public DrawCanvas(Vector<Nodo> vectorNodos, Vector<Arista> vectorAristas) {
		this.vectorNodos = vectorNodos;
		this.vectorAristas = vectorAristas;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (!vectorNodos.isEmpty()) {
			for (Nodo nodo : vectorNodos) {
				nodo.pintar(g);
			}
		}
		if (!vectorAristas.isEmpty()) {
			for (Arista arista : vectorAristas) {
				arista.pintar(g);
			}
		}
	}
}
