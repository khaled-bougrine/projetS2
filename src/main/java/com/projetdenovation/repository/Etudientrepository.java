package com.projetdenovation.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.projetdenovation.domain.Etudient;
import com.projetdenovation.domain.Remarque;



public class Etudientrepository {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	

	
	public List<Etudient> getEtudientlist(){
		EtudientMapper etudientmapper =new EtudientMapper();
		//String khaled =new String("khaled");
		List<Etudient> list= jdbctemplate.query("select* from etudient;", etudientmapper);
		
		return list;
	}
	public void insertRemarque(Remarque remarque) {
/*
		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("prof", remarque.getProf());
		vParams.addValue("matier", remarque.getMatier());
		vParams.addValue("remarque", remarque.getRemarque());
		vParams.addValue("cinetudient", remarque.getCinetudient());
		*/

		String requetinsert = "INSERT INTO remarques(prof,matier,remarque,cinetudient) VALUES(?,?,?,?);";
		jdbctemplate.update(requetinsert, remarque.getProf(), remarque.getMatier(), remarque.getRemarque(),
				remarque.getCinetudient());

	}
	
	public List<Remarque>getRemarquelist(Etudient etudient){
		String requetselect="SELECT * FROM remarques WHERE cinetudient=?;";
		RemarqueMapper remarquemapper =new RemarqueMapper();
		List<Remarque> list=jdbctemplate.query(requetselect, remarquemapper,etudient.getPassword());
		return list;

	}
	

}
