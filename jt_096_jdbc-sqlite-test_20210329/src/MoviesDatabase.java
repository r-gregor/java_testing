import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;

public class MoviesDatabase {

	public static String getFilePath() throws Exception {

		File inputFile = new File(
				MoviesDatabase.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());

		// database file outside *.jar in same dir as *.class, or *.jar file
		String jarFilePath = inputFile.getParent();
		String classFilePath = inputFile.toString();

		String type = MoviesDatabase.class.getResource("MoviesDatabase.class").toString();
		String mypath = null;
		if (type.startsWith("file")) {
			mypath = classFilePath;
		} else if (type.startsWith("jar")) {
			mypath = jarFilePath;
		} else {
			System.out.println("No suitable file found!");
			System.exit(0);
		}
		return mypath;
	}

	public static void main(String[] args) throws Exception {
		Connection connection = null;
		try {
			// get db-file path
			String dbFileName = "KRZMovies.db";
			String dbPath = getFilePath();
			String dbFullPathName = dbPath + File.pathSeparator + dbFileName;
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:" + dbFullPathName);
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			ResultSet rs = statement.executeQuery("select * from movies");

			while (rs.next()) {
				// read the result set
				System.out.printf("%-6d%s%n", rs.getInt("year"), rs.getString("title"));
			}

		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// connection close failed.
				System.err.println(e.getMessage());
			}
		} // end try-catch-finally block
	} // end main
} // end class
