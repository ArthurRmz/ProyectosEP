/**
 * 
 */
package com.soa.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import com.soa.dto.TarjetaDto;

/**
 * @author arthur
 *
 */
public class TarjetaDao {
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
	 * @param tarjetaDto Usuario a agregar.
	 */
	public void add(TarjetaDto tarjetaDto) {
		jdbcTemplate.execute("INSERT INTO Tarjeta(noTarjeta,codSegTarjeta,fechaExpiracion,monto) VALUES("
				+ tarjetaDto.getNoTarjeta() + ", " + tarjetaDto.getCodSegTarjeta() + ",'"
				+ tarjetaDto.getFechaExpiracion() + "'," + tarjetaDto.getMonto() + ")");
	}

	/**
	 * Borra una tarjeta de la BD.
	 * 
	 * @param tarjetaDto tarjeta a borrar.
	 */
	public void del(TarjetaDto tarjetaDto) {
		jdbcTemplate.execute("DELETE FROM Tarjeta WHERE noTarjeta = " + tarjetaDto.getNoTarjeta());
	}

	/**
	 * Agrega un tarjeta en la BD.
	 * 
	 * @param tarjetaDto tarjeta a agregar.
	 */
	public void update(TarjetaDto tarjetaDto) {
		jdbcTemplate.execute("UPDATE Tarjeta SET monto = " + tarjetaDto.getMonto() + " WHERE noTarjeta = "
				+ tarjetaDto.getNoTarjeta());
	}

	/**
	 * Consulta en tabla de tarjetas filtrando por el parámetro recibido.
	 * 
	 * @param tarjetaDto Filtro para consulta.
	 * @return Lista de tarjetas consultadas.
	 */
	public List<TarjetaDto> query(TarjetaDto tarjetaDto) {
		List<TarjetaDto> resultList = null;
		List<Map<String, Object>> list = jdbcTemplate
				.queryForList("SELECT noTarjeta,codSegTarjeta,fechaExpiracion,monto FROM Tarjeta WHERE noTarjeta = "
						+ tarjetaDto.getNoTarjeta()+" AND codSegTarjeta = " +tarjetaDto.getCodSegTarjeta());
		if (list != null && !list.isEmpty()) {
			resultList = new ArrayList<TarjetaDto>();
			for (Map<String, Object> tarjetaMap : list) {
				TarjetaDto dto = new TarjetaDto();
				dto.setNoTarjeta((int) tarjetaMap.get("noTarjeta"));
				dto.setCodSegTarjeta((int) tarjetaMap.get("codSegTarjeta"));
				dto.setFechaExpiracion((String) tarjetaMap.get("fechaExpiracion"));
				dto.setMonto((double) tarjetaMap.get("monto"));
				resultList.add(dto);
			}
		}
		return resultList;
	}
}
