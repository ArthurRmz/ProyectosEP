/**
 * 
 */
package admin.eventos;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * /**
 * 
 * @author arthur
 *
 */
public class EncriptarDatos {
	public byte[] cifra(String sinCifrar) {
		byte[] bytes;
		byte[] cifrado = null;
		try {
			bytes = sinCifrar.getBytes("UTF-8");
			Cipher aes = obtieneCipher(true);
			cifrado = aes.doFinal(bytes);
		} catch (Exception e) {} 
		return cifrado;
	}

	public String descifra(byte[] cifrado){
		Cipher aes;
		String sinCifrar = null;
		try {
			aes = obtieneCipher(false);
			byte[] bytes = aes.doFinal(cifrado);
			sinCifrar = new String(bytes, "UTF-8");
		} catch (Exception e) {}
		return sinCifrar;
	}

	private Cipher obtieneCipher(boolean paraCifrar){
		String frase = "1234567890QA";
		MessageDigest digest;
		Cipher aes = null;
		try {
			digest = MessageDigest.getInstance("SHA");
			digest.update(frase.getBytes("UTF-8"));
			SecretKeySpec key = new SecretKeySpec(digest.digest(), 0, 16, "AES");
			aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
			if (paraCifrar) {
				aes.init(Cipher.ENCRYPT_MODE, key);
			} else {
				aes.init(Cipher.DECRYPT_MODE, key);
			}
		} catch (Exception e) {}
		return aes;
	}
}
