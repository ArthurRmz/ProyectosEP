/**
 * 
 */
package edu.itq.admin.operaciones;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author arthur
 *
 */
public class Nodo {

	private int x,y;
	private String nombre;
	public static final int d = 40;
	
	
	/**
	 * @param x
	 * @param y
	 */
	public Nodo(int x, int y, String nombre) {
//		super();
		this.nombre = nombre;
		this.x = x;
		this.y = y;
	}


	public void pintar(Graphics g) {
		Color color = g.getColor();
		g.fillOval(this.x - d/2, this.y - d/2, d, d);
		g.setColor(Color.WHITE);
		g.drawString(nombre, x, y);
		g.setColor(color);
//		g.drawOval(this.x - d/2, this.y - d/2, d/2, d/2);
	}


	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}


	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
