package engine;

public class Fuel {
	
	public double fuel_consumption_per_LY = 1.25;
	public double fuel_start_lvl = 98.75;
	
	public void fuel_info() {
		System.out.println("class: Fuel");
		System.out.println("package: engine");
		// System.out.println("NOT a program. NO main function.");
	}


	public double fuel_stat(double distance) {
		// double fuel_start_lvl = 89.75;
		// double fuel_consumption_per_LY = 1.25;
		double fuel_curr_state = fuel_start_lvl - (fuel_consumption_per_LY * distance);
		return fuel_curr_state;
	}

}