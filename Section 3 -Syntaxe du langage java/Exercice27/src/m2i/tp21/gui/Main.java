package m2i.tp21.gui;

import java.util.Random;

public class Main {

	public static void main(final String[] args) {
		final double[] tab = { -1.0, 2.9, -18, 26.3, 7.1 };
		afficherTab(tab);
		final Recherche recherche = new Recherche();
		System.out.println("Min : " + recherche.rechercherMinimum(tab));
		System.out.println("Max : " + recherche.rechercherMaximum(tab));
	}

	/**
	 * Permet d'afficher un tableau
	 * 
	 * @param tab
	 */
	private static void afficherTab(final double[] tab) {
		for (final double d : tab) {
			System.out.print(d + " ");
		}
		System.out.println();
	}
}
