/**
 * 
 */
package com.wetic.shapes.model;

/**
 * @author  
 *
 */
public class TriangleEquilateral implements Redimensionnable {

    private String nom;
    private int    cote;

    /*
     * (non-Javadoc)
     * @see manipulation04.Redimensionnable#redimensionner(int)
     */
    @Override
    public void redimensionner(final int facteur) {
        cote *= facteur;
    }

    /*
     * (non-Javadoc)
     * @see manipulation04.Redimensionnable#calculerAire()
     */
    @Override
    public double calculerAire() {
        double hauteur = cote * Math.sqrt(3) / 2;
        return cote * hauteur / 2;
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
     * @return the cote
     */
    public int getCote() {
        return cote;
    }

    /**
     * @param cote the cote to set
     */
    public void setCote(final int cote) {
        this.cote = cote;
    }

}
