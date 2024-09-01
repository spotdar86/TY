import java.sql.*;

public class s14q1 {
    public static void main(String[] args) {
        try {
            // Replace with your database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/your_database_name";
            String username = "your_username";
            String password = "your_password";

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Check if the connection is successful
            if (connection != null) {
                System.out.println("Connection established successfully!");
            } else {
                System.out.println("Failed to establish connection.");
            }

            // Close the connection when finished
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}