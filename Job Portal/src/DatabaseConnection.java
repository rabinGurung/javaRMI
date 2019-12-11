import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    String dbURL = "jdbc:mysql://localhost:3306/jobportal";
    String username = "leon";
    String password = "password";

    public  void getConnection(){
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Connected");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
