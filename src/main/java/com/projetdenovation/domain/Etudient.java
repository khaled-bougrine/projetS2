package com.projetdenovation.domain;

public class Etudient {
	private String name;
	private String prename;
	private String password;
	
	
	public Etudient(String name, String prename, String password) {
		super();
		this.name = name;
		this.prename = prename;
		this.password = password;
		
	}
	
	public Etudient(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public Etudient() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrename() {
		return prename;
	}
	public void setPrename(String prename) {
		this.prename = prename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static boolean equalEtudient(Etudient etudient1,Etudient etudient2) {
		if((etudient1.getName().equals(etudient2.getName()))&etudient1.getPassword().equals(etudient2.getPassword())){
			return true;
		}else
			return false;
		
	}
}
	