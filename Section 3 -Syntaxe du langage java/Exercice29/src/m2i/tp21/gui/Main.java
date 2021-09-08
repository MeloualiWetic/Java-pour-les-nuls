package m2i.tp21.gui;

import java.util.Random;
import java.util.Scanner;

public class Main {


	public static Integer convertStringToInteger(final String mot) {
		Integer nombre = null;
		try {
			nombre = Integer.parseInt(mot);
		} catch (final NumberFormatException numberFormatException) {
			numberFormatException.printStackTrace();
		}
		return nombre;
	}
	public static String compare(final int nombreRandom, final double nombreSaisi) {
		if (nombreSaisi > nombreRandom) {
			return "Trop Grand";
		}
		if (nombreSaisi < nombreRandom) {
			return "Trop Petit";
		}
		return "Exact";

	}

	public static void main(final String[] args) {
		final int nombreRandom = (int) (Math.random() * 101);

		final Scanner sc = new Scanner(System.in);
		String resultat = "";
		int nbreEssai = 0;
		// tant que le r�sultat n'est pas "Exact"
		while (!resultat.equals("Exact")) {
			nbreEssai++;
			System.out.println("Essai n� : " + nbreEssai);
			System.out.print("Entrer votre nombre (0/100) : ");
			// saisie utilisateur
			final String saisie = sc.nextLine();
			final Integer nombreSaisi = convertStringToInteger(saisie);

			// traitement de la saisie
			if (nombreSaisi == null) {
				System.out.println("Ce n'est pas un nombre");
			} else {
				resultat = compare(nombreRandom, nombreSaisi);
				System.out.println("Votre nombre est : " + resultat);
			}
		}
		System.out.println("Vous avez gagn� en : " + nbreEssai + " coups");
		sc.close();
	}
}
