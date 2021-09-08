package m2i.tp21.gui;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /**
     * La borne min
     */
    public static final int BORNE_MIN = 0;
    /**
     * La borne max
     */
    public static final int BORNE_MAX = 100;
    public static void forceBrute(final int nombreRecherche) {
        for (int i = BORNE_MIN; i <= BORNE_MAX; i++) {
            if (nombreRecherche == i) {
                System.out.println("Le nombre recherch� est : " + i);
                System.out.println("Nombre trouv� en " + (i + 1) + " essais ");
            }
        }
    }
    public static void dichotomie(final int nombreRecherche) {
        int borneMin = BORNE_MIN;
        int borneMax = BORNE_MAX;
        // on calcule notre 1er nombre
        int nombreTeste = (borneMax + borneMin) / 2;
        int nbreEssai = 1;
        // tant qu'on n'a pas trouv�
        while (nombreRecherche != nombreTeste) {
            // on r�duit l'intervalle
            if (nombreTeste > nombreRecherche) {
                borneMax = nombreTeste;
            } else {
                borneMin = nombreTeste;
            }
            // on recalcule le nouveau nombre
            nombreTeste = (borneMax + borneMin) / 2;
            nbreEssai++;
        }
        System.out.println("Le nombre recherch� est : " + nombreTeste);
        System.out.println("Nombre trouv� en " + nbreEssai + " essais ");
    }  
    public static void dichotomieRecursif(final int nombreRecherche, final int min, final int max, final int nbreEssai) {
        // on calcule le nombre
        final int nbreTeste = (min + max) / 2;
        // on va demander de r�appliquer la fonction en changeant l'intervalle et le nombre d'essai
        if (nbreTeste < nombreRecherche) {
            dichotomieRecursif(nombreRecherche, nbreTeste, max, nbreEssai + 1);
        } else if (nbreTeste > nombreRecherche) {
            dichotomieRecursif(nombreRecherche, min, nbreTeste, nbreEssai + 1);
        } else {
            // on a trouv�
            System.out.println("Le nombre recherch� est : " + nbreTeste);
            System.out.println("Nombre trouv� en " + nbreEssai + " essais ");
        }
    }
    public static void main(final String[] args) {
        int nombreRandom = 42;
        forceBrute(nombreRandom);
        dichotomie(nombreRandom);
        dichotomieRecursif(nombreRandom, BORNE_MIN, BORNE_MAX, 1);
    }
}
