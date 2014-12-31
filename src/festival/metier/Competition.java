
package festival.metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.sql.DataSource;
import festival.daoo.ICompetition;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Competition {
    
    private int numCompetition;
    private int numPlanning;//clé etrangère dans table
    private String nomCompetition;
    
    
    public Competition(int newNumCompet, int newNumPlanning ,String newNomCompet) {
        this.numCompetition=newNumCompet;
        this.numPlanning=newNumPlanning;
        this.nomCompetition=newNomCompet;
    }

 
    public int getNumCompetition() {
        return numCompetition;
    }

    public int getNumPlanning() {
        return numPlanning;
    }

    public String getNomCompetition() {
        return nomCompetition;
    }
    
    public void setNumCompetition(int numCompetition) {
        this.numCompetition = numCompetition;
    }

    public void setNumPlanning(int numPlanning) {
        this.numPlanning = numPlanning;
    }

    public void setNomCompetition(String nomCompetition) {
        this.nomCompetition = nomCompetition;
    }


    
}
