/**
 * 
 */
package m2i.tp21.gui;
public class Tri {

	public void afficherTab(final double[] tab) {
        for (final double d : tab) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
    public void triTableauMethodeBulle(final double[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = i; j < tab.length; j++) {
                if (tab[j] < tab[i]) {
                    CalculUtil.inverser(tab, i, j);
                }
            }
        }
    }

    public void triTableau(final double[] tab) {
        for (int i = 0; i < tab.length; i++) {
            // on recherche le minimum � partir d'un indice du tableau
            final int indiceMin = rechercherMinimum(tab, i);
            // on r�utilise
            CalculUtil.inverser(tab, i, indiceMin);
        }
    }

    private int rechercherMinimum(final double[] tab, final int indiceDebut) {
        if (tab == null) {
            // on ne veut pas de tableau null
            throw new IllegalArgumentException("Le tableau ne peut pas �tre null");
        }
        // on initialise le minimum avec la "indiceDebut"�me case du tableau
        int indiceTemp = indiceDebut;
        double minimumTemp = tab[indiceTemp];

        // pour chaque case du tableau
        for (int i = indiceDebut + 1; i < tab.length; i++) {
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
}

