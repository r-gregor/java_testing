import java.sql.*;

public class MoviesDatabase3 {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// create a database connection
			// ::resource:databaseFilename --> access database file from within a *.jar file
			connection = DriverManager.getConnection("jdbc:sqlite::resource:KRZMovies.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);  // set timeout to 30 sec.

			// String qString1 = "select * from movies";
			String qString2 = "SELECT * FROM movies ORDER BY year DESC, title ASC";
			ResultSet rs = statement.executeQuery(qString2);
			
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
 
