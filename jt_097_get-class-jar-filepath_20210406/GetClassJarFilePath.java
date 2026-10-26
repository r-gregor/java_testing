import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;

public class GetClassJarFilePath {

	public static String getFilePath() throws Exception {

		File inputFile = new File(
				GetClassJarFilePath.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());

		// database file outside *.jar in same dir as *.class, or *.jar file
		String jarFilePath = inputFile.getParent();
		String classFilePath = inputFile.toString();

		String type = GetClassJarFilePath.class.getResource("GetClassJarFilePath.class").toString();
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
		String dbPath = getFilePath();
		System.out.println(dbPath);

	} // end main
} // end class
