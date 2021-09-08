/**
 * 
 */
package m2i.tp21.gui;

/**
 * @author x
 *
 */
public class CalculUtil {
    /**
     * M�thode qui retourne le min entre 2 nombres
     * 
     * @param a
     * @param b
     * @return le minimum entre a et b
     */
    public static double min(final double a, final double b) {
        // en utilisant la classe Math
        return Math.min(a, b);
    }

    /**
     * M�thode qui retourne le max entre 2 nombres de type double
     * 
     * @param a double, param n�1
     * @param b double, param n�2
     * @return double, le max des 2 nombres
     */
    public static double max(final double a, final double b) {
        // sans utiliser la classe Math
        if (a > b) {
            return a;
        }
        return b;
    }

    /**
     * Permet d'inverser les cases i et j du tableau tab
     * 
     * @param tab le tableau
     * @param i un indice du tableau
     * @param j un indice du tableau
     */
    public static void inverser(final double[] tab, final int i, final int j) {
        // pour v�rifier que les indices sont dans le tableau
        if (isInRange(0, tab.length, i) && isInRange(0, tab.length, j)) {
            final double temp = tab[i];
            tab[i] = tab[j];
            tab[j] = temp;
        }
    }

    /**
     * Permet de v�rifier qu'un indice est dans un intervalle
     * 
     * @param rangeMin
     * @param rangeMax
     * @param indice
     * @return true si l'indice est compris entre rangeMin inclu <br>
     *         et rangeMax exclu
     */
    private static boolean isInRange(final int rangeMin, final int rangeMax, final int indice) {
        return indice >= rangeMin && indice < rangeMax;
    }

}
