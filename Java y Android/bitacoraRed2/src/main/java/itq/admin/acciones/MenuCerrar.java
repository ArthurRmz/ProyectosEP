/**
 * 
 */
package itq.admin.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import itq.admin.vistas.Login;

/**
 * @author arthur
 *
 */
public class MenuCerrar implements ActionListener{
	private JFrame menu;

	
	/**
	 * @param menu
	 */
	public MenuCerrar(JFrame menu) {
//		super();
		this.menu = menu;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Login login = new Login();
		login.setVisible(true);
		menu.dispose();
	}

}
