/**
 * 
 */
package itq.admin.acciones;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPasswordField;

/**
 * @author arthur
 *
 */
public class LoginClavePF implements KeyListener {

	private JPasswordField clavePF;

	/**
	 * @param clavePF
	 */
	public LoginClavePF(JPasswordField clavePF) {
//		super();
		this.clavePF = clavePF;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.isAltDown() && e.getKeyCode() == KeyEvent.VK_S)
			clavePF.setEchoChar((char) 0);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		clavePF.setEchoChar((char) 8226);
	}

}
