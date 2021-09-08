package com.presentation;

import com.services.UnAnimal;
import com.services.impl.Chat;
import com.services.impl.Chien;
import com.services.impl.Souris;

public class MainApp {

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setNom("Tom");
		Chien chien = new Chien();
		chien.setNom("Butch");
		Souris souris = new Souris();
		souris.setNom("Jerry");
		UnAnimal[] tab = new UnAnimal[4];
		tab[0] = chat ; 
		tab[1] = chien;
		tab[2] = souris;
	
		for (int i=0; i<3; i++){
			System.out.println("le nom : " + tab[i].sonNom() + " le genre : " 
		+ tab[i].sonGenre() +  " son cri : " + tab[i].sonCri() );
		}


	}

}
