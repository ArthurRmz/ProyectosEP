package enigmaArchivo;

import java.util.Scanner;

public class Binario {
//	Scanner leer = new Scanner(System.in);
//	String pal;
//	String c01[] = new String[pal.length()];
    String alfabeto[] = {" ","00000000",
                        "0","00110000","1","00110001","2","00110010","3","00110011",
                        "4","00110100","5","00110101","6","00110110","7","00110111",
                        "8","00111000","9","00111001",
                        "A","01000001","a","01100001","B","01000010","b","01100010",
                        "C","01000011","c","01100011","D","01000100","d","01100100",
                        "E","01000101","e","01100101","F","01000110","f","01100110",
                        "G","01000111","g","01100111","H","01001000","h","01101000",
                        "I","01001001","i","01101001","J","01001010","j","01101010",
                        "K","01001011","k","01101011","L","01001100","l","01101100",
                        "M","01001101","m","01101101","N","01001110","n","01101110",
                        "O","01001111","o","01101111","P","01010000","p","01110000",
                        "Q","01010001","q","01110001","R","01010010","r","01110010",
                        "S","01010011","s","01110011","T","01010100","t","01110100",
                        "U","01010101","u","01110101","V","01010110","v","01110110",
                        "W","01010111","w","01110111","X","01011000","x","01111000",
                        "Y","01011001","y","01111001","Z","01011010","z","01111010"};
//	String cadena() {
//		System.out.println("Palabra a convertir en binario: ");
//		//String pal = leer.next();
//		return pal;
//	}
	
	String cifBinario(String mens) {
	    String pal = mens;
	    //String c01[] = new String[pal.length()];
	    String auxMens="";
		for (int i = 0;  i< pal.length(); i++) {
			for (int j = 0; j < alfabeto.length; j++) {
				String x = pal.charAt(i)+"";
				if(x.equals(alfabeto[j])){
					//c01[i] = alfabeto[j+1];
					auxMens+=alfabeto[j+1];
					//System.out.print(c01[i]+"|");
				}
			}
		}
        return auxMens;
	}
}