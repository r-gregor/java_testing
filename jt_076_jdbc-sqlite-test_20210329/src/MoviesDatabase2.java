

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MoviesDatabase2 {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// create a database connection
			// ::resource:databaseFilename --> access database file from within a *.jar file
			connection = DriverManager.getConnection("jdbc:sqlite::resource:KRZMovies.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);  // set timeout to 30 sec.

			ResultSet rs = statement.executeQuery("select * from movies");
			
			while(rs.next()) {
				// read the result set
				System.out.printf("%-6d%s%n", rs.getInt("year"), rs.getString("title"));
			}

		} catch(SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} finally {
			try {
				if(connection != null)
					connection.close();
			} catch(SQLException e) {
				// connection close failed.
				System.err.println(e.getMessage());
			}
		} // end try-catch-finally block
	} // end main
} // end class
 
