/**
 * 
 */
package com.soa.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import com.soa.dto.ClienteDto;

/**
 * @author arthur
 *
 */
public class ClienteDao {
	/**
	 * Template para manejo de BD de Spring.
	 */
	protected JdbcTemplate jdbcTemplate;

	/**
	 * Establece el template.
	 * 
	 * @param jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * Agrega un usuario en la BD.
	 * 
	 * @param clienteDto Usuario a agregar.
	 */
	public int add(ClienteDto clienteDto) {
		jdbcTemplate
				.execute("INSERT INTO Cliente(numeroCuenta,nombres,apellidoPaterno,apellidoMaterno,noTarjeta) VALUES("
						+ clienteDto.getNumeroCuenta() + ", '" + clienteDto.getNombres() + "','"
						+ clienteDto.getApellidoPaterno() + "','" + clienteDto.getApellidoMaterno() + "',"
						+ clienteDto.getNoTarjeta() + ")");
		int i = jdbcTemplate.queryForInt("SELECT clienteId FROM Cliente WHERE nombres = '" + clienteDto.getNombres()
				+ "' AND apellidoPaterno = '" + clienteDto.getApellidoPaterno() + "' AND apellidoMaterno = '"
				+ clienteDto.getApellidoMaterno() + "' AND noTarjeta = " + clienteDto.getNoTarjeta()
				+ " AND numeroCuenta = " + clienteDto.getNumeroCuenta());
		return i;
	}

	/**
	 * Consulta en tabla de tarjetas filtrando por el parámetro recibido.
	 * 
	 * @param clienteDto Filtro para consulta.
	 * @return Lista de tarjetas consultadas.
	 */
	public List<ClienteDto> query(ClienteDto clienteDto) {
		List<ClienteDto> resultList = null;
		System.out.println(clienteDto.getNombres() + "," + clienteDto.getApellidoPaterno() + ","
				+ clienteDto.getApellidoMaterno() + "," + clienteDto.getNoTarjeta());
		List<Map<String, Object>> list = jdbcTemplate
				.queryForList("SELECT clienteId,numeroCuenta,nombres,apellidoPaterno,apellidoMaterno,noTarjeta"
						+ "FROM Cliente" + "WHERE nombres='" + clienteDto.getNombres() + "'" + "AND apellidoPaterno='"
						+ clienteDto.getApellidoPaterno() + "'" + "AND apellidoMaterno='"
						+ clienteDto.getApellidoMaterno() + "'" + "AND noTarjeta=" + clienteDto.getNoTarjeta());
		if (list != null && !list.isEmpty()) {
			resultList = new ArrayList<ClienteDto>();
			for (Map<String, Object> clienteMap : list) {
				ClienteDto dto = new ClienteDto();
				dto.setClienteId((int) clienteMap.get("clienteId"));
				dto.setNumeroCuenta((int) clienteMap.get("numeroCuenta"));
				dto.setNombres((String) clienteMap.get("nombres"));
				dto.setApellidoPaterno((String) clienteMap.get("apellidoPaterno"));
				dto.setApellidoMaterno((String) clienteMap.get("apellidoMaterno"));
				dto.setNoTarjeta((int) clienteMap.get("noTarjeta"));
				resultList.add(dto);
			}
		}
		return resultList;
	}
}
