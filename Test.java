import java.sql.Connection;
import java.sql.DriverManager;
public class Test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mybase";
        String user = "root";
        String password = "Pandu_dbms27";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully.");
        }
        catch (Exception e) {
            System.out.println("Error while connecting to MySQL Database :");
			e.printStackTrace();
        } 
    }
}