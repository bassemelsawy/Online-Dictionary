import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    private static Connection conn;

    public static void main(String [] args){
        getConnection();
    }

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/entries", "root", "Rootroot2");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;

    }
}
