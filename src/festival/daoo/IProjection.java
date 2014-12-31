package festival.daoo;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import festival.metier.Projection;

public interface IProjection {
    public List<Projection> getObjetsProjection();
    public void setDataSource(DataSource ds);
    public Connection getConnection() throws SQLException;
    public void closeConnection(Connection c) throws SQLException;
   /* public void ajouterProjection();
    public void modifierProjection(int numProjection);
    public void supprimerProjection(int numProjection);*/
 
}
