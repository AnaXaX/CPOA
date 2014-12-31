
package festival.dao.oracle;

import festival.daoo.IProjection;
import festival.metier.Projection;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class OracleProjectionDAO implements IProjection {
    private static DataSource ds;
    public List<Projection> listeProjection = new ArrayList<Projection>();
    

    
    @Override
    public List<Projection> getObjetsProjection() {
        Connection connexionBD=null;
        ResultSet rset=null;
        Statement stmt=null;
        try {
            stmt=connexionBD.createStatement();
            rset=stmt.executeQuery("select * from projection");
            while(rset.next()) {
                Projection projection = new Projection(rset.getInt(1),rset.getDate(2),rset.getDate(3),rset.getDate(4));
                listeProjection.add(projection);
            } 
        }
        catch(Exception e) {
            System.err.println("Problème: "+e.getMessage());
        }
        return listeProjection;
    }
    
   /* @Override
    public void ajouterProjection() {
       Connection connexionBD=null;
       ResultSet rset=null;
       PreparedStatement pstmt=null;
       try {
          pstmt=connexionBD.prepareStatement("insert into projection values(?,?,?,?);");
       }
       catch() {
           
       }
    }*/
    
    
    
    
     @Override
    public void setDataSource(DataSource ds) {
        OracleProjectionDAO.ds=ds;
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