/**
 * 
 */
package m2i.tp21.gui;
public class Recherche {

	public int rechercherMinimum(final double[] tab) {
		if (tab == null) {
			// on ne veut pas de tableau null
			throw new IllegalArgumentException("Le tableau ne peut pas �tre null");
		}
		// on initialise le minimum avec la 1�re case du tableau
		int indiceTemp = 0;
		double minimumTemp = tab[indiceTemp];

		// pour chaque case du tableau, apr�s la 1�re
		for (int i = indiceTemp + 1; i < tab.length; i++) {
			final double nombreCourant = tab[i];
			if (nombreCourant < minimumTemp) {
				// on stocke le nouveau minimum
				minimumTemp = nombreCourant;
				// on stocke l'indice de ce minimum
				indiceTemp = i;
			}
		}
		return indiceTemp;
	}
	public int rechercherMaximum(final double[] tab) {
		if (tab == null) {
			// on ne veut pas de tableau null
			throw new IllegalArgumentException("Le tableau ne peut pas �tre null");
		}
		// on initialise le minimum avec la 1�re case du tableau
		int indiceTemp = 0;
		double maximumTemp = tab[indiceTemp];

		// pour chaque case du tableau
		for (int i = 0; i < tab.length; i++) {
			final double nombreCourant = tab[i];
			if (nombreCourant > maximumTemp) {
				// on stocke le nouveau minimum
				maximumTemp = nombreCourant;
				// on stocke l'indice de ce minimum
				indiceTemp = i;
			}
		}
		return indiceTemp;
	}
}

