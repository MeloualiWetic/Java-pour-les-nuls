package com.services.impl;

import com.services.UnAnimal;

public class Chien implements UnAnimal {
	
	String nom;
	static String genre = "un chien";
	
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static String getGenre() {
		return genre;
	}

	public static void setGenre(String genre) {
		Chien.genre = genre;
	}

	@Override
	public String sonCri() {
		return "wouf";
		
	}

	@Override
	public String sonNom() {
		return this.nom;
	}

	@Override
	public String sonGenre() {
		return this.genre;
	}
	

}
