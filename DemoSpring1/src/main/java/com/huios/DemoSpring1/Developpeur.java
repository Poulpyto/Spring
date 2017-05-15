package com.huios.DemoSpring1;

public class Developpeur {
	
	private String	nom;
	private String	anExp;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAnExp() {
		return anExp;
	}
	public void setAnExp(String anExp) {
		this.anExp = anExp;
	}
	@Override
	public String toString() {
		return "Developpeur [nom = " + nom + ", annes Experience = " + anExp + "]";
	}

}
