// filename: DirWalkRsort.java


import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DirWalkRsort {
	private File mydir;
	private ArrayList<String> djtsList = new ArrayList<String>();
	private Map<String, ArrayList<String>> djtsAndFjls = new HashMap<String, ArrayList<String>>();
	
	// default constructor
	public DirWalkRsort() {
		System.out.println("Class DirWalkRsort must be parameterized with <String dir>!");
		System.exit(1);
	}
	
	// parameterized constructor
	public DirWalkRsort(String dir) {
		this.mydir = new File(dir);
		mapDirContent(this.mydir);
	}
	
	// METHODS // METHODS // METHODS // METHODS // METHODS // METHODS // METHODS //
	
	/** map words_of_fname_yyyymmdd.txt to map[yyyymmdd] = words_of_fname_yyyymmdd.txt
	 * @param dir
	 */
	private void mapDirContent(File dir) {
		int count = 0;
		String regex = "(.*)(\\d{8})(.*)";
		Pattern re = Pattern.compile(regex);

		File[] files = dir.listFiles();
		for (File file : files) {
			String fname = file.getName();

			Matcher m = re.matcher(fname);
			if (m.matches()) {
				count += 1;
				String dateKey = m.group(2);
				// System.out.printf("%s --> %s%n", m.group(2), fname);
				if (!djtsAndFjls.containsKey(dateKey)) {
					djtsList.add(dateKey);
					djtsAndFjls.put(dateKey, new ArrayList<String>());
					djtsAndFjls.get(dateKey).add(fname);
				} else {
					djtsAndFjls.get(dateKey).add(fname);
				}
			}
		} // end for

		if (djtsList.size() != 0) {
			Collections.sort(djtsList, Collections.reverseOrder());
		}

		if (count == 0) {
			System.out.println("NO files with datestring found!");
		}

	} // end func

	/** Display contents of map in format: "yyyy-mm-dd words_of_fname_yyyymmdd.txt"
	 *
	 */
	public void printDjtsAndFjls() {
		File curdir = this.mydir;

		for (int i = 0; i < djtsList.size(); i++) {
			String djtString = djtsList.get(i);
			String djtStringSeparated = String.format("%s-%s-%s",
										djtString.substring(0,4),
										djtString.substring(4,6),
										djtString.substring(6,8));


			for (int j = 0; j < djtsAndFjls.get(djtString).size(); j++) {
				System.out.printf("%-10s %s%n", djtStringSeparated, djtsAndFjls.get(djtString).get(j));
			} // end for
		} // end for
	} // end func
	
	// METHODS // METHODS // METHODS // METHODS // METHODS // METHODS // METHODS //
	
} // end class

