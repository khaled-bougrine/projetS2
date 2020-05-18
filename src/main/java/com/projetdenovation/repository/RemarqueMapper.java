package com.projetdenovation.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.projetdenovation.domain.Remarque;

public class RemarqueMapper implements RowMapper<Remarque> {

	@Override
	public Remarque mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Remarque(rs.getString("prof"),rs.getString("matier"),rs.getString("remarque"),rs.getString("cinetudient"));
		
	}
	

}
