package com.projetdenovation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.projetdenovation.domain.Etudient;
import com.projetdenovation.domain.Remarque;
import com.projetdenovation.repository.Etudientrepository;


public class Servicee {
	private Etudientrepository etudientrepository;
	

	public Servicee(Etudientrepository etudientrepository) {
		super();
		this.etudientrepository = etudientrepository;
	}

	public void setEtudientrepository(Etudientrepository etudientrepository) {
		this.etudientrepository = etudientrepository;
	}

	public Etudient etudientVerificationcin(String cinetudient) {
		for (Etudient etudient1 : etudientrepository.getEtudientlist()) {
			if (etudient1.getPassword().equals(cinetudient)) {
				return etudient1;
			}
		}
		return null;
	}

	public void addRemarque(Remarque remarque) {
		etudientrepository.insertRemarque(remarque);
	}

	public List<Remarque> getlistRemarque(Etudient etudient) {
		return etudientrepository.getRemarquelist(etudient);

	}

}