package admin;

/**
 * @author arthur
 *
 */
public class Posicion {

	private int x, y, valor;

	/**
	 * @param x
	 * @param y
	 */
	public Posicion(int x, int y, int valor) {
//		super();
		this.x = x;
		this.y = y;
		this.valor = valor;
	}

	/**
	 * 
	 */
	public Posicion() {
//		super();
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
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

}
