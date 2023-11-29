package pkg_V2;

public class Part {
	public static int counter = 0;
	private String part_name = "";
	private int part_weigth = 0;
	private String part_material = "";
	private int part_ID = 0;




	public Part() {
		System.out.println(
		"\n" +
		"Usage: Part [name] = new Part([part_name], [part_weigth], [part_material])\n" +
		"Curent number of parts " + counter);
	}


	public Part(String _name, int _weigth, String _material) {
		counter += 1;
		part_ID = counter;
		part_name = _name;
		part_weigth = _weigth;
		part_material = _material;
	}


	public void printInfo() {
		String action;
		if (part_weigth > 70) {
			action = "A trolley needed -- weigth is over 70 kgs!";
		} else {
			action = "None";
		}

		System.out.printf(
			"%n" +
			"Part ID: %d%n" +
			"Part name: %s%n" +
			"Part weigth: %d kg%n" +
			"Part material: %s%n" +
			"Action: %s" +
			"%n-----------------------------------------",
			part_ID, part_name, part_weigth, part_material, action
		);
	}
}
