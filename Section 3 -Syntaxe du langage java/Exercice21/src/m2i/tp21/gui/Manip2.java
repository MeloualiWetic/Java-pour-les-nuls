package m2i.tp21.gui;

import java.util.Scanner;

public class Manip2 {

	public static void main(String[] args) {
		// Ouvrir un flux in. Lire à partir du clavier
		Scanner sc = new Scanner(System.in);
		//Afficher le message Saisir le nombre à l'utilisateur
		System.out.println("Saisir le nombre: ");
		//Lire la valeur saise et la convertir en un Int
		int nombre = sc.nextInt();
		
		// Afficher si le nombre et pair ou impair
		//Solution V1
		String isPair = "";
//		if (nombre % 2 == 0) {
//			isPair = " pair";
//		}else {
//			isPair = " impair";
//		}
		isPair = (nombre % 2 == 0) ? " pair" : " impair";
		System.out.println("Le nombre est: " + isPair);
		
		// Afficher si le nombre est positif ou pas
		String isPositif = (nombre > 0) ? " positif" : " négatif";
		System.out.println("Le nombre est: " + isPositif);
		
		// Afficher si le nombre est un multiple de 5
		String estMultipleDe5 = (nombre % 5 == 0) 
					? "est un multiple de 5" : "n'est pas un multiple de 5";
		System.out.println("Le nombre " + estMultipleDe5);
		
	}

}
