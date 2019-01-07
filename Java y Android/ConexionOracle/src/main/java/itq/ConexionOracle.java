/**
 * 
 */
package itq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author arthur
 *
 */
public class ConexionOracle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bitacora1", "oracle");            
            PreparedStatement st = connection.prepareStatement("SELECT CLAVE FROM USUARIOS WHERE NOMBRE = ?");
            st.setString(1, "arthur");
            ResultSet rs = st.executeQuery();
            rs.next();
            System.out.println(rs.getString(1));
            st.close();
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
	}

}
