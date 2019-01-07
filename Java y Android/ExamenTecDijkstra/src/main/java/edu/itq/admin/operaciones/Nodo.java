/**
 * 
 */
package edu.itq.admin.operaciones;

import java.awt.Graphics;

/**
 * @author arthur
 *
 */
public class Nodo {

	private int x,y;
	public static final int d = 60;
	
	
	/**
	 * @param x
	 * @param y
	 */
	public Nodo(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
	}


	public void pintar(Graphics g) {
		g.drawOval(this.x - d/2, this.y - d/2, d/2, d/2);
	}
	
}
