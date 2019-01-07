package edu.itq.admin.vistas;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Point;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import edu.itq.admin.operaciones.Arista;
import edu.itq.admin.operaciones.DrawCanvas;
import edu.itq.admin.operaciones.Nodo;
import javax.swing.border.LineBorder;

import java.awt.Color;

public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Vector<Nodo> vectorNodos = new Vector<>();
	private Vector<Arista> vectorAristas = new Vector<>();
	private Point p1,p2;
	private int i=0;

	
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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 352);
		getContentPane().setLayout(null);
		
		DrawCanvas panel = new DrawCanvas(vectorNodos,vectorAristas);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 746, 267);
		panel.addMouseListener(new MouseListener() {
			
			

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==MouseEvent.BUTTON1 && (vectorNodos.size()<10)) {
					String nombre="";
					nombre += (char)('A'+i);
					vectorNodos.add(new Nodo(e.getX(),e.getY(),nombre));
					imprimirVector(vectorNodos);
					repaint();
					i++;
				}
				if(e.getButton()==MouseEvent.BUTTON3) {
					for (Nodo nodo : vectorNodos) {
						if(new Rectangle(nodo.getX()-Nodo.d/2, nodo.getY()-Nodo.d/2, Nodo.d, Nodo.d).contains(e.getPoint())) {
							if(p1 == null) {
								p1 =  new Point(nodo.getX(), nodo.getY());
							}
							else {
								p2 =  new Point(nodo.getX(), nodo.getY());
								String mensaje = JOptionPane.showInputDialog(null, "Ingrese el peso", "Ingresar", 1);
								int peso = Integer.parseInt(mensaje);
								vectorAristas.add(new Arista(p1.x, p1.y, p2.x, p2.y,peso));
								imprimirVector1(vectorAristas);
								repaint();
								p1 = null;
								p2 = null;
							}
								
						}
					}
				}
			}
		});
		getContentPane().add(panel);
		
		JButton calcularB = new JButton("Calcular");
		calcularB.setBounds(10, 289, 89, 23);
		getContentPane().add(calcularB);
		
	}
	public void imprimirVector(Vector<Nodo> vectorNodos) {
		for (Nodo nodo : vectorNodos) {
			System.out.println("Nombre: "+nodo.getNombre()+" X: "+nodo.getX()+" Y: "+nodo.getY());
		}
	}
	public void imprimirVector1(Vector<Arista> vectorAristas) {
		for (Arista arista : vectorAristas) {
			System.out.println("Peso: "+arista.getPeso()+" X1: "+arista.getX1()+" Y1: "+arista.getY1()+" X2: "+arista.getX2()+" Y2: "+arista.getY2());
		}
	}

}
