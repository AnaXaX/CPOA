
package festival.dao.oracle;

import festival.daoo.IPlanning;
import festival.metier.Planning;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;


public class OraclePlanningDAO implements IPlanning {
    
  private static DataSource ds;
    public List<Planning> listePlanning = new ArrayList<Planning>();

    public OraclePlanningDAO() {
    }
    
    public void supprimerPlanning(int numP) {
        Connection connexionBD=null;
        int resultat;
        int i=1;
        ResultSet rset=null;
        PreparedStatement pstmt=null;
        try {
            connexionBD=ds.getConnection();
            pstmt=(PreparedStatement) connexionBD.createStatement();
            resultat=pstmt.executeUpdate("delete from planning where numPlanning=?");
            pstmt.setInt(1,numP);
            /*while(i<=resultat) {
                Planning planning = new Planning(rset.getInt(1),rset.getString(2),rset.getInt(3),rset.getDate(4));
                listePlanning.add(planning);
            } */
        }
        catch(Exception e) {
            System.err.println("Problème: "+e.getMessage());
        }
    }  
    
    
    
  @Override
    public void afficheNomPlanning() {
        Connection connexionBD=null;
        //ResultSet rset=null;
        //Statement stmt=null;
        try {
            connexionBD=ds.getConnection();
            Statement stmt=connexionBD.createStatement();
            ResultSet rset=stmt.executeQuery("select * from Planning");
            while(rset.next()) {
                System.out.println(rset.getString(2));
            } 
        }
        catch(Exception e) {
            System.err.println("Problème: "+e.getMessage());
        }
    }
    
   
  @Override
    public List<Planning> getObjetsPlanning() {
        Connection connexionBD=null;
        ResultSet rset=null;
        Statement stmt=null;
        try {
            connexionBD=ds.getConnection();
            stmt=connexionBD.createStatement();
            rset=stmt.executeQuery("select * from Planning");
            while(rset.next()) {
                Planning planning = new Planning(rset.getInt(1),rset.getString(2),rset.getInt(3),rset.getDate(4));
                listePlanning.add(planning);
            } 
        }
        catch(Exception e) {
            System.err.println("Problème: "+e.getMessage());
        }
        return listePlanning;
    }
    
     @Override
    public void setDataSource(DataSource ds) {
        OraclePlanningDAO.ds=ds;
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

