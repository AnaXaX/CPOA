/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package festival.dao.oracle;

import festival.daoo.ICompetition;
import festival.metier.Competition;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author mikou
 */
public class OracleCompetitionDAO implements ICompetition {

    private static DataSource ds;
    public List<Competition> listeCompet = new ArrayList<Competition>();
    
    public OracleCompetitionDAO() {
    }
    
    
     @Override
    public List<Competition> getObjetsCompetition() {
        Connection connexionBD=null;
        ResultSet rset=null;
        Statement stmt=null;
        try {
            connexionBD=ds.getConnection();
            stmt=connexionBD.createStatement();
            rset=stmt.executeQuery("select * from COMPETITION");
            while(rset.next()) {
                Competition compet = new Competition(rset.getInt(1),rset.getInt(2),rset.getString(3));
                listeCompet.add(compet);
            } 
        }
        catch(Exception e) {
            System.err.println("Problème: "+e.getMessage());
        }
        return listeCompet;
    }
    
     @Override
    public void setDataSource(DataSource ds) {
        OracleCompetitionDAO.ds=ds;
    }
    
     @Override
    public Connection getConnection() throws SQLException {
        return(ds.getConnection());
    }
    
     @Override
    public void closeConnection(Connection c) throws SQLException {
       if(c!=null) c.close();  
    }
}
