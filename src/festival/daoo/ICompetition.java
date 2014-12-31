
package festival.daoo;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import festival.metier.Competition;

public interface ICompetition {
    public List<Competition> getObjetsCompetition();
    public void setDataSource(DataSource ds);
    public Connection getConnection() throws SQLException;
    public void closeConnection(Connection c) throws SQLException;
 
}

