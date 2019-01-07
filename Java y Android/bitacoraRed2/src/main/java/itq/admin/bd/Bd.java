package itq.admin.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class Bd {
	private Connection conexion = null;
	private PreparedStatement statement = null;
	private String driver = "oracle.jdbc.OracleDriver";
	private String ip = "localhost";
	private String puerto = "1521";
	private String sid = "xe";
	private String usuario = "bitacora1";
	private String clave = "oracle";

	public Bd() {
		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection("jdbc:oracle:thin:@" + ip + ":" + puerto + ":" + sid, usuario,
					clave);
		} catch (Exception e) {
		}

	}

	/**
	 * 
	 * @param query es una sentencia SQL ya sea insert, update, drop, create ya que
	 *              no regresan ningun valor
	 */
	public void insertUpdate(String query) {
		try {
			statement.executeUpdate(query);
		} catch (SQLException ex) {
		}
	}

	/**
	 * 
	 * @param consulta es una consulta de SQL "SELECT" sin parametros
	 * @return un objeto ResultSet para desplegar los datos
	 */
	public ResultSet query(String consulta) {
		ResultSet resultado = null;
		try {
			statement = conexion.prepareStatement(consulta);
			resultado = statement.executeQuery();
			return resultado;
		} catch (SQLException ex) {
		}
		return resultado;
	}

	/**
	 * 
	 * @param consulta
	 * @param parametros
	 * @return
	 */
	public ResultSet query(String consulta, ArrayList<Object> parametros) {
		ResultSet resultado = null;
		try {
			statement = conexion.prepareStatement(consulta);
			int i = 0;
			for (Object object : parametros) {
				if (object instanceof String)
					statement.setString(i + 1, (String) object);
				else if (object instanceof Integer)
					statement.setInt(i + 1, (Integer) object);
				else if (object instanceof Double)
					statement.setDouble(i + 1, (Double) object);
				i++;
			}
			resultado = statement.executeQuery();
			return resultado;
		} catch (Exception ex) {
		}
		return resultado;
	}

	/**
	 * 
	 */
	public void cerrarConexion() {
		try {
			statement.close();
			conexion.close();
		} catch (SQLException ex) {
			System.out.println("Error");
		}
	}
}
