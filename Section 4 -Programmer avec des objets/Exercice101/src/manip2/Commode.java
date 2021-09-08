/**
 * 
 */
package manip2;

/**
 * @author 
 *
 */
public class Commode extends Meuble {

    private int nbreTiroir;

    /**
     * @param nom
     * @param poids
     * @param volume
     * @param nbreTiroir
     */
    public Commode(final String nom, final int poids, final int volume, final int nbreTiroir) {
        super(nom, poids, volume);
        this.nbreTiroir = nbreTiroir;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Commode [" + super.toString() + ", nbreTiroir=" + nbreTiroir + "]";
    }

    /**
     * @return the nbreTiroir
     */
    public int getNbreTiroir() {
        return nbreTiroir;
    }

    /**
     * @param nbreTiroir the nbreTiroir to set
     */
    public void setNbreTiroir(final int nbreTiroir) {
        this.nbreTiroir = nbreTiroir;
    }

}
