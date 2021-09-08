/**
 * 
 */
package com.wetic.megameuble.model;

/**
 * @author  
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        // création de meuble
        final Meuble table = new Meuble();
        table.setNom("Table");
        table.setVolume(2);

        final Meuble armoire = new Meuble();
        armoire.setNom("Armoire");
        armoire.setVolume(10);

        // création de la pièce
        final Piece chambre = new Piece("Chambre", 11);

        // tests d'ajout / suppression
        System.out.println(table);
        System.out.println(chambre);

        System.out.println("Ajout d'une table");
        // on pourrait récupérer le retour de la fonction
        // pour afficher un message OK ou KO
        chambre.addMeuble(table);
        System.out.println(chambre);

        System.out.println("Ajout d'une armoire");
        chambre.addMeuble(armoire);
        System.out.println(chambre);

        System.out.println("Suppression d'une armoire");
        chambre.removeMeuble(armoire);
        System.out.println(chambre);

        System.out.println("Suppression d'une table");
        chambre.removeMeuble(table);
        System.out.println(chambre);

        System.out.println("Suppression d'une table");
        chambre.removeMeuble(table);
        System.out.println(chambre);
    }

}
