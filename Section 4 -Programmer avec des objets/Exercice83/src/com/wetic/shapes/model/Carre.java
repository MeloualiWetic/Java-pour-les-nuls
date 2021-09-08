/**
 * 
 */
package com.wetic.shapes.model;

/**
 * @author  
 *
 */
public class Carre implements Redimensionnable {
    private String nom;
    private int    cote;

    /**
     * Méthode d'affichage, pour tester la visibilité
     */
    public void afficher() {
        System.out.println("Carre [nom=" + nom + ", cote=" + cote + "]");
    }

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
        return cote * cote;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Carre [nom=" + nom + ", cote=" + cote + "]";
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
