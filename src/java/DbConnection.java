
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DbConnection {
    public static final String USERNAME = "dbtest";
    public static final String PASSWORD= "root";
    public static final String CONN_STR = "jdbc:mysql://localhost/hplus";
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.driver");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(USERNAME,PASSWORD,CONN_STR);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (conn!=null){
                conn.close();
            }
        }
        
    }
    
}
