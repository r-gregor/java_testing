
import java.util.*;

/**
 * TEST 20210319 header and line string format to printf function, and automatic
 * calculation of separator line lenght
 */
public class HeaderAndLineFormat {

	/**
	 * func to draw separator line w - the number of dashes from calculation of
	 * format String
	 * 
	 * @param w
	 */
	public static void divLine(int w) {
		for (int i = 0; i < w; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Map<String, Integer> movies = new HashMap<>();
		movies.put("Conan The Barbarian", 1984);
		movies.put("STAR WARS", 1970);
		movies.put("STAR WARS III", 1986);
		movies.put("EQUILIBRIUM", 1999);
		movies.put("Lucy", 2008);
		movies.put("IO", 2011);
		movies.put("D  U  N  E", 2021);
		movies.put("KIN", 2019);

		/**
		 * lenghts of columns
		 */
		int titlew = 40;
		int yearw = 4;

		/**
		 * lenght of separator line
		 */
		int linew = titlew + yearw;

		/**
		 * format strings for headerw<String, String> and each line columnsw<String,
		 * Integer> from map
		 */
		String headw = "%-" + titlew + "s%-" + yearw + "s%n"; // %-40s%-4d%n
		String columnsw = "%-" + titlew + "s%-" + yearw + "d%n"; // %-40s%-4s%n

		// printout
		System.out.printf(headw, "The movie Title", "Year");
		divLine(linew);
		for (Map.Entry<String, Integer> line : movies.entrySet()) {
			System.out.printf(columnsw, line.getKey(), line.getValue());
		}

	}
}