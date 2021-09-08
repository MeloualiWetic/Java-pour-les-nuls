package m2i.tp21.gui;

import java.util.Random;

public class Main {

	public static void main(final String[] args) {
        final double[] tab = { -1.0, 2.9, -18, 26.3, -7.1 };
        final Tri tri = new Tri();
        tri.afficherTab(tab);
        tri.triTableau(tab);
        tri.afficherTab(tab);

        System.out.println("Tri n� 2 : ");

        final double[] tab2 = { -1.0, 2.9, -18, 26.3, -7.1 };
        tri.afficherTab(tab2);
        tri.triTableauMethodeBulle(tab2);
        tri.afficherTab(tab2);
    }
}
