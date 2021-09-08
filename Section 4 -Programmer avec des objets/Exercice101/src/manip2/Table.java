/**
 * 
 */
package manip2;

/**
 * @author 
 *
 */
public class Table extends Meuble {

    private int nbrePlace;

    /**
     * @param nom
     * @param poids
     * @param volume
     * @param nbrePlace
     */
    public Table(final String nom, final int poids, final int volume, final int nbrePlace) {
        super(nom, poids, volume);
        this.nbrePlace = nbrePlace;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Table [" + super.toString() + ", nbrePlace=" + nbrePlace + "]";
    }

    /**
     * @return the nbrePlace
     */
    public int getNbrePlace() {
        return nbrePlace;
    }

    /**
     * @param nbrePlace the nbrePlace to set
     */
    public void setNbrePlace(final int nbrePlace) {
        this.nbrePlace = nbrePlace;
    }

}
