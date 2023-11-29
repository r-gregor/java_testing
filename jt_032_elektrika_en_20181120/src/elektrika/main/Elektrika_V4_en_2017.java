package main;

import java.util.*;
import java.io.*;

public class Elektrika_V4_en_2017 {

	// func --------------------------------------------------------------------------------------------------
	public static void display(String value) {
		System.out.println(value);
	}

	// func --------------------------------------------------------------------------------------------------
	// function to get the value for each month key in E2017 map
	public static void getMonthValue(Map<String, Double> map, int month) {
		String part_1 = "E2017-";
		String prefix = null;
		String part_2;
		if (month < 10) {
			prefix = "0";
			part_2 = prefix + String.valueOf(month);
		} else {
			part_2 = String.valueOf(month);
		} // END if

		String key_value = part_1 + part_2;
		System.out.printf("\tExpenses for %s are: %s EUR %n", key_value, map.get(key_value).toString());
	} // END getMonthValue

	// func --------------------------------------------------------------------------------------------------
	// function to sum all the values for all months in E2017 map
	public static void getSum(Map<String, Double> map) {
		double sum = 0;
		for (Map.Entry<String, Double> entry : map.entrySet()) {
			sum += entry.getValue();
		}

		System.out.printf("\n\tThe sum of all Elektrika (2017) expenses so far is: %.2f EUR%n", sum);
	} // END getSum

	// func --------------------------------------------------------------------------------------------------
	// function: print contents acording to supplied arguments
	public static void printOut(String[] arguments, Map<String, Double> map) {
		// if arguments --> month numbers else all 12 month numbers
		ArrayList<Integer> myargs = new ArrayList<Integer>();
		if (arguments.length != 0) {
			for (int i=0; i < arguments.length; i++) {
				int n = Integer.parseInt(arguments[i]);
				if (n > 0 && n < 13) {
					myargs.add(n);
				}
			}
		} else {
			System.out.println("Usage: java Elektrika_2017 [args = month num]\n");
			System.out.println("Displaying expenses for all months so far:\n");
			for (int i=0; i < 12; i++) {
				myargs.add(i+1);
			}
		}

		// for each argument get the value using the getMonthValue function
		for (int i=0; i < myargs.size(); i++) {

			// only if argument less than number of months
			if (myargs.get(i) < map.size() + 1) {
				//test
				// System.out.println(myargs.get(i));
				
				// do
				getMonthValue(map, myargs.get(i));
			}
		} // END for
	} // END printOut
	
	// MAIN --------------------------------------------------------------------------------------------------
	public static void main (String[] args) throws IOException {
		
		// get info from external file (../sources/2017/E2017.properties)
		Properties props = new Properties();
		InputStream input = null;
		input = new FileInputStream("sources/2017/E2017.properties");
		
		// props.load(ClassName.class.getResourceAsStream("E2017.properties"));
		props.load(input);
		
		Map<String, Double> E2017 = new HashMap<String, Double>();
		
		/*
		// first method
		for (String key : props.stringPropertyNames()) {
			String value = props.getProperty(key);
			E2017.put(key, Double.valueOf(value));
		}
		*/
				
		// second method
		for (Map.Entry<Object, Object> entry : props.entrySet()) {
			String key = (String) entry.getKey();
			Double value = Double.valueOf(props.getProperty(key));
			E2017.put(key, value);
		}

		
		// run functions
		printOut(args, E2017);
		getSum(E2017);
		
	} // END main

} // END class
