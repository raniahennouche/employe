package ma.ensias.employe2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Vuln {



        public static void main(String[] args) {
            if (args.length == 0) return;

            // Treat command-line argument as untrusted input
            String userInput = args[0];

            try {
                Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");

                // THE VULNERABILITY:
                String query = "SELECT * FROM users WHERE username = '" + userInput + "'";

                Statement statement = connection.createStatement();
                statement.execute(query);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
