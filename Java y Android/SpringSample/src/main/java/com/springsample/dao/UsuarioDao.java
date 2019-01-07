/**
 * 
 */
package com.springsample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

import com.springsample.dto.UsuarioDto;

/**
 * @author arthur
 *
 */
public class UsuarioDao {
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
	 * Muestra la informacion de un usuario de la BD.
	 * 
	 * @return
	 */
	public UsuarioDto getData(int id) {
		UsuarioDto tmpDto = null;
		Object[] params = { id };
		try {
			tmpDto = jdbcTemplate.queryForObject("SELECT id, login, password FROM usuario WHERE id = ?", params,
					new RowMapper<UsuarioDto>() {
						public UsuarioDto mapRow(ResultSet rs, int rowNum) throws SQLException {
							UsuarioDto dto = new UsuarioDto();
							dto.setId(rs.getInt("id"));
							dto.setLogin(rs.getString("login"));
							dto.setPassword(rs.getString("password"));
							return dto;
						}
					});
		} catch (Exception e) {
			return tmpDto;
		}
		return tmpDto;
	}

	/**
	 * Elimina un usuario de la BD.
	 * 
	 * @param id
	 */
	public void quit(int id) {
		jdbcTemplate.execute("DELETE from Usuario " + "where id = " + id);
	}

	/**
	 * Modifica los datos de un usuario de la BD.
	 * 
	 * @param usuarioDto
	 */
	public void edit(UsuarioDto usuarioDto) {
		jdbcTemplate.execute("UPDATE Usuario set login='" + usuarioDto.getLogin() + "', " + "password = '"
				+ usuarioDto.getPassword() + "' " + "where id = " + usuarioDto.getId());
	}

}
