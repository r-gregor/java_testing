// 20181014:	V1;
// 2018

import java.util.*;

public class TEST_V2 {

	//MAIN -----------------------------------
	public static void main(String[] args) {

	
		// array day in a week (SLO)
		String[] teden = {"PO", "TO", "SR", "CE", "PE", "SO", "NE"};
	
	
		// map of month and days in a month (SLO)
		Map<String, Integer> dni_v_mescu = new HashMap<String, Integer>();
		dni_v_mescu.put("januar", 31);
		dni_v_mescu.put("februar", 28);
		dni_v_mescu.put("marec", 31);
		dni_v_mescu.put("april", 30);
		dni_v_mescu.put("maj", 31);
		dni_v_mescu.put("junij", 30);
		dni_v_mescu.put("julij", 31);
		dni_v_mescu.put("avgust", 31);
		dni_v_mescu.put("september", 30);
		dni_v_mescu.put("oktober", 31);
		dni_v_mescu.put("november", 30);
		dni_v_mescu.put("december", 31);
		
		
		//ArrayList of months in a year from previous map
		ArrayList<String> mesci = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : dni_v_mescu.entrySet()) {
				String key = (String) entry.getKey();
				mesci.add(key);
		}
		
		for (int i=0; i < mesci.size(); i++) {
			System.out.println(mesci.get(i));
		}
		
		System.out.println("Everything seems to be Okay!");
	} //END MAIN

} //END CLASS
