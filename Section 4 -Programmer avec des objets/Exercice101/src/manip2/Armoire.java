/**
 * 
 */
package manip2;

/**
 * @author 
 *
 */
public class Armoire extends Meuble {

    private int nbrePorte;

    /**
     * @param nom
     * @param poids
     * @param volume
     * @param nbrePorte
     */
    public Armoire(final String nom, final int poids, final int volume, final int nbrePorte) {
        // exemple de constructeur avec paramètres pour utiliser le super constructeur
        super(nom, poids, volume);
        this.nbrePorte = nbrePorte;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        // on appelle le toString de la super classe
        return "Armoire [" + super.toString() + ", nbrePorte=" + nbrePorte + "]";
    }

    /**
     * @return the nbrePorte
     */
    public int getNbrePorte() {
        return nbrePorte;
    }

    /**
     * @param nbrePorte the nbrePorte to set
     */
    public void setNbrePorte(final int nbrePorte) {
        this.nbrePorte = nbrePorte;
    }

}
