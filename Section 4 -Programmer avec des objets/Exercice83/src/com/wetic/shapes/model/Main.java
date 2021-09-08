/**
 * 
 */
package com.wetic.shapes.model;

/**
 * @author  
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        // création des instances
        final Carre carre = new Carre();
        carre.setNom("Carre");
        carre.setCote(3);
        final Cercle cercle = new Cercle();
        cercle.setNom("Cercle");
        cercle.setRayon(5);

        // utilisation des méthodes
        carre.afficher();
        System.out.println(cercle);
        System.out.println(carre);
        System.out.println("Aire : " + carre.calculerAire());

        // ajout de code pour le triangle
        final TriangleEquilateral triangle = new TriangleEquilateral();
        triangle.setNom("Triangle");
        triangle.setCote(1);

        // Généralisation des traitements
        final Redimensionnable[] tableau = { carre, cercle, triangle };
        for (final Redimensionnable redimensionnable : tableau) {
            // KO : la méthode afficher() existe uniquement pour le type "Carre"
            // redimensionnable.afficher();
            redimensionnable.redimensionner(2);

            // Ici, on référence le toString de Objet
            // mais on utilise la redéfinition de chaque objet
            // comme toString n'est pas redéfinit pour triangle...
            System.out.println(redimensionnable);
            System.out.println("Aire : " + redimensionnable.calculerAire());
        }

    }

}
