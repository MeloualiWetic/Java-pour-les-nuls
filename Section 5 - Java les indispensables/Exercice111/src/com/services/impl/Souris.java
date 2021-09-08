package com.services.impl;

import com.services.UnAnimal;

public class Souris implements UnAnimal {

	String nom;
	static String genre = "un chien";
	
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String sonNom() {
		return this.nom;
	}

	@Override
	public String sonCri() {
		return "couic";
	}

	@Override
	public String sonGenre() {
		return this.genre;
	}
}
