/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package festival.metier;

/**
 *
 * @author mikou
 */
public class Salle {
    
    private int numSalle;
    private String nomSalle;
    private int nbPlaces;
    private String competSalle;
    
    public Salle(int newNumSalle, String newNomSalle, int newNbPlaces, String newCompetSalle) {
        numSalle=newNumSalle;
        nomSalle=newNomSalle;
        nbPlaces=newNbPlaces;
        competSalle=newCompetSalle;
    }

    public int getNumSalle() {
        return numSalle;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public String getCompetSalle() {
        return competSalle;
    }

    public void setNumSalle(int numSalle) {
        this.numSalle = numSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public void setCompetSalle(String competSalle) {
        this.competSalle = competSalle;
    }
    
}
