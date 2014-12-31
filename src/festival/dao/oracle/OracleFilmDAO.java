/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package festival.dao.oracle;

import festival.daoo.IFilm;
import festival.metier.Film;
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
public class OracleFilmDAO implements IFilm {

    
    private static DataSource ds;
    public List<Film> listeFilm = new ArrayList<Film>();

    public OracleFilmDAO() {
    } 
    
    @Override
    public List<Film> getObjetsFilm() {
        Connection connexionBD=null;
        ResultSet rset=null;
        Statement stmt=null;
        try {
            connexionBD=ds.getConnection();
            stmt=connexionBD.createStatement();
            rset=stmt.executeQuery("select * from FILM");
            while(rset.next()) {
                Film film = new Film(rset.getInt(1),rset.getString(4),rset.getInt(5),rset.getInt(6));
                listeFilm.add(film);
            } 
        }
        catch(Exception e) {
            System.err.println("Problème: "+e.getMessage());
        }
        return listeFilm;
    }
    
      
     @Override
    public void setDataSource(DataSource ds) {
        OracleFilmDAO.ds=ds;
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
