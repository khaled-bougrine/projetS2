package com.projetdenovation.repository;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.projetdenovation.domain.Etudient;


public class EtudientMapper implements RowMapper<Etudient> {
	public Etudient mapRow(ResultSet Rs,int prownumber) throws SQLException {
		return new Etudient(Rs.getString("nom"),Rs.getString("prenom"),Rs.getString("password"));
	}


	
	

}

