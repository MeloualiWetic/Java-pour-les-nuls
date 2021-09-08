/**
 * 
 */
package manipulation01;

/**
 * @author  
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        // on remplit les 3 instances d'élève
        final Eleve eleve01 = new Eleve();
        eleve01.setId(0);
        eleve01.setNom("Loinvoyant");
        eleve01.setPrenom("FitzChevalerie");
        eleve01.setAge(10);

        final Eleve eleve02 = new Eleve();
        eleve02.setId(1);
        eleve02.setNom("Brin-D'if");
        eleve02.setPrenom("Molly");
        eleve02.setAge(13);

        final Eleve eleve03 = new Eleve();
        eleve03.setId(2);
        eleve03.setNom("Tombétoile");
        eleve03.setPrenom("Umbre");
        eleve03.setAge(70);

        // affichage sans le toString
        eleve01.afficher();
        eleve02.afficher();
        eleve03.afficher();

        // affichage grâce au to String
        System.out.println(eleve01);
        // équivalent à la ligne précédente
        // System.out.println(eleve01.toString());
        System.out.println(eleve02);
        System.out.println(eleve03);
    }

}
