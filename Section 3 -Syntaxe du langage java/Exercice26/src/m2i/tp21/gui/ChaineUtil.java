/**
 * 
 */
package m2i.tp21.gui;

/**
 * @author x
 *
 */
public class ChaineUtil {

	public static boolean isVide(final String mot) {
		if (mot == null || mot.length() == 0) {
			return true;
		}
		return false;
	}
	public static boolean isPalindrome(final String mot) {
		if (isVide(mot)) {
			// on consid�re qu'on mot vide est un palindrome
			return true;
		}
		final int length = mot.length();
		// on n'a besoin de parcourir que la moiti� du mot
		for (int i = 0; i < length / 2; i++) {
			// ne pas confondre la taille et l'indice Maximal
			if (mot.charAt(i) != mot.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	private static boolean isVoyelle(final char lettre) {
		final char[] voyelles = { 'a', 'e', 'i', 'o', 'u', 'y' };
		for (final char voyelle : voyelles) {
			if (lettre == voyelle) {
				return true;
			}
		}
		return false;

	}
	public static int nbreVoyelle(final String mot) {
		if (isVide(mot)) {
			return 0;
		}
		int compteurVoyelle = 0;
		// pour chaque lettre du mot
		for (final char lettre : mot.toCharArray()) {
			if (isVoyelle(lettre)) {
				// on incr�mente le compteur
				compteurVoyelle++;
			}
		}
		return compteurVoyelle;
	}

}

