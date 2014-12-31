

package festival.dao.oracle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import oracle.jdbc.pool.OracleDataSource;

public class OracleDataSourceDAO extends OracleDataSource {
    
    private static OracleDataSourceDAO ods;
    
    private OracleDataSourceDAO() throws SQLException { }
    
    public static OracleDataSourceDAO getOracleDataSource() throws FileNotFoundException, IOException, SQLException {
        FileInputStream fichier=null;
        try{
            Properties props=new Properties();
            fichier=new FileInputStream(".\\src\\festival\\dao\\oracle\\connexion.properties");
            props.load(fichier);
            ods=new OracleDataSourceDAO();
            ods.setDriverType(props.getProperty("pilote"));
            ods.setPortNumber(new Integer(props.getProperty("port")).intValue());
            ods.setServiceName(props.getProperty("service"));
            ods.setUser(props.getProperty("user"));
            ods.setPassword(props.getProperty("pwd"));
            ods.setServerName(props.getProperty("serveur"));
        }
        catch(Exception e) {
           System.err.println("Problème: "+e.getMessage());
        }
        finally {
            fichier.close();
        }
        return ods;
    } 
    
}
