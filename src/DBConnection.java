import java.sql.*;

public class DBConnection {
    static final String URL = "jdbc:mysql://localhost:3306/ecommerce";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}