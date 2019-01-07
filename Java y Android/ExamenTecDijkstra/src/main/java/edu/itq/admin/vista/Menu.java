package edu.itq.admin.vista;

import java.awt.EventQueue;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.itq.admin.operaciones.Lienzo;
import edu.itq.admin.operaciones.Nodo;
import java.awt.Color;
public class Menu extends JFrame {
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		
//		boolean agregarAristas = false;
		Vector<Nodo> vectorNodos = new Vector<>();
		setTitle("Dijikstra");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 418);
		getContentPane().setLayout(null);
		
//		JButton dibujarB = new JButton("Dibujar nodos");
//		dibujarB.setBounds(369, 35, 105, 23);
//		getContentPane().add(dibujarB);
//		
//		JButton unirNodosB = new JButton("Unir nodos");
//		unirNodosB.setBounds(369, 69, 105, 23);
//		getContentPane().add(unirNodosB);
//		
//		JButton calcularB = new JButton("Calcular");
//		calcularB.setBounds(369, 104, 105, 23);
//		getContentPane().add(calcularB);
		
		JPanel panel = new Lienzo(vectorNodos);
		panel.setBounds(0, 0, 464, 309);
		panel.setBackground(Color.black);
		
		getContentPane().add(panel);
	}
}
