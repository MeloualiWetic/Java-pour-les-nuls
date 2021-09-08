/**
 * 
 */
package com.wetic.shapes.model;

/**
 * @author  
 *
 */
public interface Redimensionnable {
    /**
     * Permet de redimensionner selon le facteur donn�
     * 
     * @param facteur : le facteur de redimensionnement
     */
    void redimensionner(final int facteur);

    /**
     * Permet de calculer l'aire
     * 
     * @return l'aire calcul�e
     */
    double calculerAire();
}
