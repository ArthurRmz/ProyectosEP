package com.springsample.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.springsample.dto.UsuarioDto;

/**
 * @author tlopez
 */
public class UsuarioDao {
	/** Campo Id. */
	private static final Object ID = "id";
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
	 * @param usuarioDto Usuario a agregar.
	 */
	public void add(UsuarioDto usuarioDto) {
		jdbcTemplate.execute("INSERT INTO Usuario(login, password) VALUES('" + usuarioDto.getLogin() + "', '"
				+ usuarioDto.getPassword() + "')");
	}

	/**
	 * Agrega un usuario en la BD.
	 * 
	 * @param usuarioDto Usuario a agregar.
	 */
	public void del(UsuarioDto usuarioDto) {
		jdbcTemplate.execute("DELETE FROM Usuario WHERE login ='" + usuarioDto.getLogin() + "'");
	}

	/**
	 * Agrega un usuario en la BD.
	 * 
	 * @param usuarioDto Usuario a agregar.
	 */
	public void update(UsuarioDto usuarioDto) {
		jdbcTemplate.execute("UPDATE Usuario SET password = '" + usuarioDto.getPassword() + " WHERE login ='"
				+ usuarioDto.getLogin() + "'");
	}

	/**
	 * Consulta en tabla de usuarios filtrando por el parámetro recibido.
	 * 
	 * @param usuarioDto Filtro para consulta.
	 * @return Lista de usuarios consultados.
	 */
	public List<UsuarioDto> query(UsuarioDto usuarioDto) {
		List<UsuarioDto> resultList = null;
		List<Map<String, Object>> list = jdbcTemplate
				.queryForList("SELECT id, login, password FROM Usuario WHERE login = '" + usuarioDto.getLogin() + "'");
		if (list != null && !list.isEmpty()) {
			resultList = new ArrayList<UsuarioDto>();
			for (Map<String, Object> userMap : list) {
				UsuarioDto dto = new UsuarioDto();
				dto.setId((Integer) userMap.get(ID));
				dto.setLogin((String) userMap.get("login"));
				dto.setPassword((String) userMap.get("password"));
				resultList.add(dto);
			}
		}
		return resultList;
	}

//	public List<UsuarioDto> queryRowMapper(UsuarioDto usuarioDto) {
//		List<UsuarioDto> resultList = jdbcTemplate.query(
//				"SELECT id, login, password FROM Usuario WHERE login = '"
//						+ usuarioDto.getLogin() + "'", 
//						new BeanPropertyRowMapper(UsuarioDto.class));
//		return resultList;
//	}
	
	public String listaUsuarios(UsuarioDto usuarioDto) {
		List<UsuarioDto> resultList = query(usuarioDto);
		String buffer = "";
		for (int i = 0; i < resultList.size(); i++) {
			buffer += (i+1)+".- "+resultList.get(i).getLogin()+"\t\n";
		}
		return buffer;
	}
}
