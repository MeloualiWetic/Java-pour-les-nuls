/**
 * 
 */
package manip2;

import java.util.Arrays;
import java.util.List;

/**
 * @author 
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        final Table table = new Table("ronde", 10, 3, 4);
        final Armoire armoire = new Armoire("normande", 120, 1, 2);
        final Commode commode = new Commode("Mais pas trop", 160, 4, 4);
        
        // construction de la liste
        final List<Meuble> listeMeuble = Arrays.asList(table, armoire, commode);
        
        for (final Meuble meuble : listeMeuble) {
            System.out.println(meuble);
            System.out.println("Nbre de personnes pour le transport : " + meuble.transporter());
        }
    }

}
