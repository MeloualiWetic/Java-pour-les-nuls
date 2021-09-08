/**
 * 
 */
package manip2;

/**
 * @author 
 *
 */
public abstract class Meuble implements Transportable {
    private String nom;
    private int    poids;
    private int    volume;

    /**
     * @param nom
     * @param poids
     * @param volume
     */
    public Meuble(final String nom, final int poids, final int volume) {
        super();
        this.nom = nom;
        this.poids = poids;
        this.volume = volume;
    }

    /*
     * (non-Javadoc)
     * @see manip2.Transoprtable#transporter()
     */
    @Override
    public int transporter() {
        return 1 + Math.max(volume / 2, poids / 50);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "nom=" + nom + ", poids=" + poids + ", volume=" + volume;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(final String nom) {
        this.nom = nom;
    }

    /**
     * @return the poids
     */
    public int getPoids() {
        return poids;
    }

    /**
     * @param poids the poids to set
     */
    public void setPoids(final int poids) {
        this.poids = poids;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(final int volume) {
        this.volume = volume;
    }

}
