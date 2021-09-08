package com.services.impl;

import com.services.UnAnimal;

public class Chat  implements UnAnimal{
	
	String nom;
	static String genre = "un chat";
	
	

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
		Chat.genre = genre;
	}

	@Override
	public String sonCri() {
		return "maou";
		
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
