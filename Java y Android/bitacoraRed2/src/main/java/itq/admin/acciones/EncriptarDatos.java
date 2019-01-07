/**
 * 
 */
package itq.admin.acciones;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

/**
 * /**
 * 
 * @author arthur
 *
 */
public class EncriptarDatos {
	byte[] iv = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}; 
	public String encriptar(String clave, String value) {
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			SecretKeySpec sks = new SecretKeySpec(clave.getBytes("UTF-8"), "AES");
			cipher.init(Cipher.ENCRYPT_MODE, sks, new IvParameterSpec(iv));

			byte[] encriptado = cipher.doFinal(value.getBytes());
			return DatatypeConverter.printBase64Binary(encriptado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String desecriptar(String clave, String encriptado) {
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			SecretKeySpec sks = new SecretKeySpec(clave.getBytes("UTF-8"), "AES");
			cipher.init(Cipher.DECRYPT_MODE, sks, new IvParameterSpec(iv));

			byte[] dec = cipher.doFinal(DatatypeConverter.parseBase64Binary(encriptado));
			return new String(dec);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
