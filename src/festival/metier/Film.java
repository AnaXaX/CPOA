

package festival.metier;

import java.util.logging.Logger;


public class Film {
    private int numFilm;
    private String titre; 
    private int annee;
    private double duree;

    public Film(int numFilm, String titre, int annee, double duree) {
        this.numFilm = numFilm;
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
    }

    public int getNumFilm() {
        return numFilm;
    }

    public String getTitre() {
        return titre;
    }

    public int getAnnee() {
        return annee;
    }

    public double getDuree() {
        return duree;
    }



    public void setNumFilm(int numFilm) {
        this.numFilm = numFilm;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }


    
    
    
}
