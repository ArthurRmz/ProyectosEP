package edu.itq.admin.operaciones;

//import java.awt.BasicStroke;
import java.awt.Graphics;
//import java.awt.Graphics2D;

public class Arista {

	private int x1, y1, x2, y2;
	private int peso;

	/**
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public Arista(int x1, int y1, int x2, int y2, int peso) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.peso = peso;
	}

	public void pintar(Graphics g) {

//		Graphics2D graphics2d = (Graphics2D)g;
//		graphics2d.setStroke(new BasicStroke(6));
		g.drawLine(x1, y1, x2, y2);
		if (x1 > x2 && y1 > y2) {
			g.drawString(peso+"", x1 - Math.abs((x1 - x2) / 2), y1 - Math.abs((y1 - y2) / 2));
		}
		if (x1 < x2 && y1 < y2) {
			g.drawString(peso+"", x2 - Math.abs((x1 - x2) / 2), y2 - Math.abs((y1 - y2) / 2));
		}
		if (x1 > x2 && y1 < y2) {
			g.drawString(peso+"", x1 - Math.abs((x1 - x2) / 2), y2 - Math.abs((y1 - y2) / 2));
		}
		if (x1 < x2 && y1 > y2) {
			g.drawString(peso+"", x2 - Math.abs((x1 - x2) / 2), y1 - Math.abs((y1 - y2) / 2));
		}
	}

	/**
	 * @return the x1
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * @param x1 the x1 to set
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}

	/**
	 * @return the y1
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * @param y1 the y1 to set
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}

	/**
	 * @return the x2
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * @param x2 the x2 to set
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}

	/**
	 * @return the y2
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * @param y2 the y2 to set
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

}
