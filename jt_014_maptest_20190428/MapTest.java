import java.util.*;

public class MapTest {
	public static void main(String[] args) {

		// change 20190428:
		// int curry = 2018;
		int curry = Calendar.getInstance().get(Calendar.YEAR);

		Map<String, Integer> my_map = new HashMap<String, Integer>();
		my_map.put("Gregor", 1968);
		my_map.put("Tadeja", 1970);
		my_map.put("Zala", 1996);
		my_map.put("Mark", 1999);
		my_map.put("Spela", 2008);
		my_map.put("E.T.", 1011);

		/*
		for (int i=0; i < my_map.size(); i++) {
			System.out.printf("Name: {}; BY: {}; Age: {}", my_map)
		}
		*/

		System.out.printf("Current year: %d%n", curry);
		for (Map.Entry<String,Integer> entry : my_map.entrySet()) {
  			String key = entry.getKey();
  			Integer value = entry.getValue();
  			// do stuff:
			// System.out.printf("Name: %s;\tBY: %d;\tAge: %d\n", key, value, curry - value.intValue());
			System.out.printf("Name: %-8s BD: %-6d Age: %d%n", key, value, curry - value);
		} // END for
	} // END main
} // END class
