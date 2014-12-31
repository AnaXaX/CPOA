

package festival.metier;

import java.util.Date;
import java.util.logging.Logger;

public class Planning {
    
    private int numPlanning; 
    private String nomPlanning; 
    private int nbJour;
    private Date dateDebut;
    
    public Planning(int newNumPlanning, String newNomPlanning, int newNbJour, Date newDateDebut) {
        numPlanning=newNumPlanning;
        nomPlanning=newNomPlanning;
        nbJour=newNbJour;
        dateDebut=newDateDebut;
    }

    public int getNumPlanning() {
        return numPlanning;
    }

    public String getNomPlanning() {
        return nomPlanning;
    }

    public int getNbJour() {
        return nbJour;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setNumPlanning(int numPlanning) {
        this.numPlanning = numPlanning;
    }

    public void setNomPlanning(String nomPlanning) {
        this.nomPlanning = nomPlanning;
    }

    public void setNbJour(int nbJour) {
        this.nbJour = nbJour;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    
}
