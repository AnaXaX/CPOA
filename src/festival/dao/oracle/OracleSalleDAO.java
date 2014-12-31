
package festival.dao.oracle;

import festival.daoo.ISalle;
import festival.metier.Salle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;


public class OracleSalleDAO implements ISalle {
    
private static DataSource ds;
    public List<Salle> listeSalle = new ArrayList<Salle>();
    
    public OracleSalleDAO() {
    }
    
    
    
    @Override
    public List<Salle> getObjetsSalle() {
        Connection connexionBD=null;
        ResultSet rset=null;
        Statement stmt=null;
        try {
            connexionBD=ds.getConnection();
            stmt=connexionBD.createStatement();
            rset=stmt.executeQuery("select * from SALLE");
            while(rset.next()) {
                Salle salle = new Salle(rset.getInt(1),rset.getString(2),rset.getInt(3),rset.getString(4));
                listeSalle.add(salle);
            } 
        }
        catch(Exception e) {
            System.err.println("Problème: "+e.getMessage());
        }
        return listeSalle;
    }
    
      @Override
    public void setDataSource(DataSource ds) {
        OracleSalleDAO.ds=ds;
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
