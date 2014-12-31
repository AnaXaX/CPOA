package festival.daoo;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import festival.metier.Planning;

public interface IPlanning{
    public List<Planning> getObjetsPlanning();
    public void setDataSource(DataSource ds);
    public Connection getConnection() throws SQLException;
    public void closeConnection(Connection c) throws SQLException;
    public void afficheNomPlanning();
    public void supprimerPlanning(int numP);
}
