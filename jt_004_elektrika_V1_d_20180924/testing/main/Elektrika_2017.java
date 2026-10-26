import java.util.*;
import java.io.*;

public class Elektrika_2017 {

	public static void display(String value) {
		System.out.println(value);
	} // END display

	// function to get the value for each month key in E2017 map
	public static void getMonthValue(Map<String, Double> map, int month) {
		String part_1 = "E2017-";
		String prefix = null;
		String part_2;
		if (month < 10) {
			prefix = "0";
			part_2 = prefix + new Integer(month).toString();
		} else {
			part_2 = new Integer(month).toString();
		} // END if

		String key_value = part_1 + part_2;
		System.out.printf("\tThe value for %s is: %s EUR %n", key_value, map.get(key_value).toString());
	} // END getMonthValue

	// function to sum all the values for all months in E2017 map
	public static void getSum(Map<String, Double> map) {
		double sum = 0;
		for (Map.Entry<String, Double> entry : map.entrySet()) {
			sum += entry.getValue();
		}

		System.out.printf("\n\tThe sum of all Elektrika expenses so far is: %.2f EUR%n", new Float(sum));
	} // END getSum

	public static void main (String[] args) {

		// if arguments --> month numbers else all 12 month numbers
		ArrayList<Integer> myargs = new ArrayList<Integer>();
		if (args.length != 0) {
			for (int i=0; i < args.length; i++) {
				int n = Integer.parseInt(args[i]);
				if (n > 0 && n < 13) {
					myargs.add(n);
				}
			}
		} else {
			System.out.println("Usage: java Elektrika_2017 [args = month num]\n");
			System.out.println("Displaying values for all months so far:\n");
			for (int i=0; i < 12; i++) {
				myargs.add(new Integer(i+1));
			}
		}

		// populate E2017 map with values for each month
		// todo: get from external file (sources/E2017.properties)
		Map<String, Double> E2017 = new HashMap<String, Double>();
		E2017.put("E2017-01", new Double(74.15));
		E2017.put("E2017-02", new Double(44.15));
		E2017.put("E2017-03", new Double(57.15));
		E2017.put("E2017-04", new Double(73.15));
		E2017.put("E2017-05", new Double(62.15));
		E2017.put("E2017-06", new Double(48.15));
		E2017.put("E2017-07", new Double(76.15));
		/* TEST if not yet FULL!!
		E2017.put("E2017-08", new Double(23.15));
		E2017.put("E2017-09", new Double(74.15));
		E2017.put("E2017-10", new Double(72.15));
		E2017.put("E2017-11", new Double(70.15));
		E2017.put("E2017-12", new Double(81.15));
		*/

		// for each argument get the value using the getMonthValue function
		for (int i=0; i < myargs.size(); i++) {

			// only if argument less than number of months
			if (myargs.get(i) < E2017.size()) {
				// System.out.println(myargs.get(i));
				getMonthValue(E2017, myargs.get(i));
			}
		}
		getSum(E2017);
	} // END main

} // END class
