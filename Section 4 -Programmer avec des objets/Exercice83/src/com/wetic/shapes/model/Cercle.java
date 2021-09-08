/**
 * 
 */
package com.wetic.shapes.model;

/**
 * @author  
 *
 */
public class Cercle implements Redimensionnable {
    private String nom;
    private int    rayon;

    /*
     * (non-Javadoc)
     * @see manipulation04.Redimensionnable#redimensionner(int)
     */
    @Override
    public void redimensionner(final int facteur) {
        rayon *= facteur;
    }

    /*
     * (non-Javadoc)
     * @see manipulation04.Redimensionnable#calculerAire()
     */
    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Cercle [nom=" + nom + ", rayon=" + rayon + "]";
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
     * @return the rayon
     */
    public int getRayon() {
        return rayon;
    }

    /**
     * @param rayon the rayon to set
     */
    public void setRayon(final int rayon) {
        this.rayon = rayon;
    }

}
