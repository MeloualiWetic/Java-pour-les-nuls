/**
 * 
 */
package m2i.tp21.gui;

/**
 * @author x
 *
 */
public class CalculUtil {

    public static double min(final double a, final double b) {
        // en utilisant la classe Math
        return Math.min(a, b);
    }

    public static double max(final double a, final double b) {
        // sans utiliser la classe Math
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void inverser(final double[] tab, final int i, final int j) {
        // pour v�rifier que les indices sont dans le tableau
        if (isInRange(0, tab.length, i) && isInRange(0, tab.length, j)) {
            final double temp = tab[i];
            tab[i] = tab[j];
            tab[j] = temp;
        }
    }

    private static boolean isInRange(final int rangeMin, final int rangeMax, final int indice) {
        return indice >= rangeMin && indice < rangeMax;
    }

}
