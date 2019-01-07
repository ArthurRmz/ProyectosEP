/**
 * 
 */
package escanerPuertos;

import java.io.IOException;
import java.net.InetAddress;

/**
 * @author arthur
 *
 */
public class JPing {

    /**
     * @param args
     */
    public static void main(String[] args) {
        InetAddress inAdd;
        String ip = "172.217.4.36";
        try {
            ping = InetAddress.getByName(ip);
            if(inAdd.isReachable(5000)) {
                System.out.println("IP: "+ inAdd.getLocalHost());
                System.out.println("HOST: "+inAdd.getHostName());
            }
            else{
                System.out.println(ip+" no responde!");                
            }
        }catch(IOException ex) {
            System.out.println(ex);
        }

    }

}
