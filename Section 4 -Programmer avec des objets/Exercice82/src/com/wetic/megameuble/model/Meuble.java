/**
 * 
 */
package com.wetic.megameuble.model;

/**
 * @author  
 *
 */
public class Meuble {
    private String nom;
    private int    volume;

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Meuble [nom=" + nom + ", volume=" + volume + "]";
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
