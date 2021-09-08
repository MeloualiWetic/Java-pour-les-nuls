/**
 * 
 */
package com.wetic.megameuble.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  
 *
 */
public class Piece {
    private String       nom;
    private int          volumeGlobal;
    private int          volumeRestant;
    // On stocke dans une liste
    private List<Meuble> listeMeuble;

    /**
     * Constructeur de la pièce
     * 
     * @param nom : le nom
     * @param volumeGlobal : le volume global
     */
    public Piece(final String nom, final int volumeGlobal) {
        // éviter le constructeur avec paramètre si possible
        this.nom = nom;
        this.volumeGlobal = volumeGlobal;
        this.volumeRestant = volumeGlobal;
        listeMeuble = new ArrayList<>();
    }

    /**
     * Permet d'ajouter un meuble à la pièce
     * 
     * @param meuble : le meuble à ajouter
     * @return true si on peut, false sinon
     */
    public boolean addMeuble(final Meuble meuble) {
        // on vérifie qu'on peut
        if (volumeRestant < meuble.getVolume()) {
            return false;
        }
        // on ajoute le meuble
        listeMeuble.add(meuble);
        volumeRestant -= meuble.getVolume();
        return true;
    }

    /**
     * Permet de retirer un meuble de la pièce
     * 
     * @param meuble : le meuble à enlever
     * @return true si on peut, false sinon
     */
    public boolean removeMeuble(final Meuble meuble) {
        if (listeMeuble.contains(meuble)) {
            listeMeuble.remove(meuble);
            volumeRestant += meuble.getVolume();
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Piece [nom=" + nom + ", volumeGlobal=" + volumeGlobal + ", volumeRestant=" + volumeRestant + ", listeMeuble=" + listeMeuble + "]";
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
     * @return the volumeGlobal
     */
    public int getVolumeGlobal() {
        return volumeGlobal;
    }

    /**
     * @param volumeGlobal the volumeGlobal to set
     */
    public void setVolumeGlobal(final int volumeGlobal) {
        this.volumeGlobal = volumeGlobal;
    }

    /**
     * @return the volumeRestant
     */
    public int getVolumeRestant() {
        return volumeRestant;
    }

    /**
     * @param volumeRestant the volumeRestant to set
     */
    public void setVolumeRestant(final int volumeRestant) {
        this.volumeRestant = volumeRestant;
    }

    /**
     * @return the listeMeuble
     */
    public List<Meuble> getListeMeuble() {
        return listeMeuble;
    }

    /**
     * @param listeMeuble the listeMeuble to set
     */
    public void setListeMeuble(final List<Meuble> listeMeuble) {
        this.listeMeuble = listeMeuble;
    }

}
