import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private String url = "jdbs:postgresql://localhost:5432/java";
    private String user = "jasurbek";
    private String password = "1001";
    public void saveUser() {
        Connection connector = DriverManager.getConnection(url, user, password);
        Statement statement = connector.createStatement();
        String query = "insert into users (username, pssword) values ()";

        
    }
}
