package com.projetdenovation.domain;

import javax.validation.constraints.NotBlank;

public class Remarque {
	@NotBlank
	private String prof;
	@NotBlank
	private String matier;
	private String remarque;

	private String cinetudient;

	

	
	public Remarque(@NotBlank String prof, @NotBlank String matier, String remarque, String cinetudient) {
		super();
		this.prof = prof;
		this.matier = matier;
		this.remarque = remarque;
		this.cinetudient = cinetudient;
	}

	public Remarque() {
		// TODO Auto-generated constructor stub
	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public String getMatier() {
		return matier;
	}

	public void setMatier(String matier) {
		this.matier = matier;
	}

	public String getRemarque() {
		return remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public String getCinetudient() {
		return cinetudient;
	}

	public void setCinetudient(String cinetudient) {
		this.cinetudient = cinetudient;
	}

}
