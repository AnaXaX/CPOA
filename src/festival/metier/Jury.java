

package festival.metier;

public class Jury {
    private int numJury;
    private String typeJury;
    private int nbMembres;
    private int maxFilms;

    public Jury(int numJury, String typeJury, int nbMembres, int maxFilms) {
        this.numJury = numJury;
        this.typeJury = typeJury;
        this.nbMembres = nbMembres;
        this.maxFilms = maxFilms;
    }

    public int getNumJury() {
        return numJury;
    }

    public String getTypeJury() {
        return typeJury;
    }

    public int getNbMembres() {
        return nbMembres;
    }

    public int getMaxFilms() {
        return maxFilms;
    }

    public void setNumJury(int numJury) {
        this.numJury = numJury;
    }

    public void setTypeJury(String typeJury) {
        this.typeJury = typeJury;
    }

    public void setNbMembres(int nbMembres) {
        this.nbMembres = nbMembres;
    }

    public void setMaxFilms(int maxFilms) {
        this.maxFilms = maxFilms;
    }
    
    
}
