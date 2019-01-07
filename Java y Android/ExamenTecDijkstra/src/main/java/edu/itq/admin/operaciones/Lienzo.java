/**
 * 
 */
package edu.itq.admin.operaciones;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JPanel;

/**
 * @author arthur
 *
 */
public class Lienzo extends JPanel implements MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Vector<Nodo> vectorNodos;

	public Lienzo(Vector<Nodo> vectorNodos) {
		this.vectorNodos = vectorNodos;
		this.addMouseListener(this);
		this.setBackground(Color.blue);
	}

	@Override
	public void paint(Graphics g) {
		for (Nodo vectorNodo : vectorNodos) {
			vectorNodo.pintar(g);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1 && (vectorNodos.size()<3)) {
			this.vectorNodos.add(new Nodo(e.getX(),e.getY()));
			repaint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
