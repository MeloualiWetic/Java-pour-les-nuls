package m2i.tp21.gui;

import java.util.Random;

public class Main {

/**
	 * @param args
	 */
	public static void main(final String[] args) {
		System.out.println("Max : " + CalculUtil.max(-2.0, 4));
		System.out.println("Min : " + CalculUtil.min(-2.0, 4));
		final double[] tab = { 2.0, 4.2, -3.9 };
		afficherTab(tab);
		CalculUtil.inverser(tab, 0, 1);
		afficherTab(tab);
		// ne doit rien faire (indice hors tableau)
		CalculUtil.inverser(tab, 10, 1);
		afficherTab(tab);
		System.out.println("Inversion du tableau");
		final double[] notes = { 1, 2, 3, 4 };
		afficherTab(notes);
		final int longueur = notes.length;
		// on inverse le tableau
		for (int i = 0; i < longueur / 2; i++) {
			CalculUtil.inverser(notes, i, longueur - 1 - i);
		}
		afficherTab(notes);

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
