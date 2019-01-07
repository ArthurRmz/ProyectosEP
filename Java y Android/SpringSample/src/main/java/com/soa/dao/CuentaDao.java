/**
 * 
 */
package com.soa.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import com.soa.dto.CuentaDto;

/**
 * @author arthur
 *
 */
public class CuentaDao {
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
	 * @param cuentaDto Usuario a agregar.
	 */
	public int add(CuentaDto cuentaDto) {
		jdbcTemplate.execute("INSERT INTO Cuenta(correo,calidad,paquete) VALUES('" + cuentaDto.getCorreo() + "','"
				+ cuentaDto.getCalidad() + "','" + cuentaDto.getPaquete() + "')");
		int i = jdbcTemplate.queryForInt("SELECT numeroCuenta FROM Cuenta WHERE correo = '" + cuentaDto.getCorreo()
				+ "' AND calidad = '" + cuentaDto.getCalidad() + "' AND paquete = '" + cuentaDto.getPaquete() + "'");
		return i;
	}

	/**
	 * Consulta en tabla de tarjetas filtrando por el parámetro recibido.
	 * 
	 * @param cuentaDto Filtro para consulta.
	 * @return Lista de tarjetas consultadas.
	 */
	public List<CuentaDto> query(CuentaDto cuentaDto) {
		List<CuentaDto> resultList = null;
		List<Map<String, Object>> list = jdbcTemplate
				.queryForList("SELECT numeroCuenta,correo,calidad,paquete FROM Cuenta WHERE numeroCuenta = "
						+ cuentaDto.getNumeroCuenta());
		if (list != null && !list.isEmpty()) {
			resultList = new ArrayList<CuentaDto>();
			for (Map<String, Object> cuentaMap : list) {
				CuentaDto dto = new CuentaDto();
				dto.setNumeroCuenta((int) cuentaMap.get("numeroCuenta"));
				dto.setCorreo((String) cuentaMap.get("correo"));
				dto.setCalidad((String) cuentaMap.get("calidad"));
				dto.setPaquete((String) cuentaMap.get("paquete"));
				resultList.add(dto);
			}
		}
		return resultList;
	}
}
