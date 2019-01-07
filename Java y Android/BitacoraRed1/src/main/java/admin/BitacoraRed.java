package admin;
import admin.eventos.EncriptarDatos;;
public class BitacoraRed {
//	private static final Logger logger = LogManager.getLogger(BitacoraRed.class);
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		Diseño l = new Diseño();
		EncriptarDatos enD = new EncriptarDatos();
		String mensaje = "H";
		byte[] mensajeCif;
		String mensajeDes="";
		try {
			mensajeCif = enD.cifra(mensaje);
			mensajeDes = enD.descifra(mensajeCif);
			System.out.println("Mensaje cifrado: "+mensajeCif+"\nMensaje descifrado: "+mensajeDes);
		} catch (Exception e) {}
		
	}
}