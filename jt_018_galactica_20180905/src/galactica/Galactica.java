import engine.*;
import food.*;
import living.*;

public class Galactica {
	
	public static void nl() {
		System.out.println("\n");
	}

	public static void crtc() {
		System.out.println("-------------------------------------------------");
	}
	
	// function that clears the screen!!
	public static void cls() {
		System.out.print("\033[H\033[2J");
	}
	
	public static void main(String[] args) {
		cls();
		double users;
		
		if (args.length != 0) {
			 users = Double.parseDouble(args[0]);
		} else {
			 users = 1500;
		}
		
		double gdistance = 61.0;
		double curr_speed = 0.1; // days/LY
		System.out.println("###############################");
		System.out.println("## STAR BATTLESHIP GALACTICA ##");
		System.out.println("###############################");
		System.out.println("");
		
		System.out.println("Current GALACTICA base info:");
		System.out.println("Distance traveled: " + gdistance + " [LY].");
		System.out.println("Current active USERS: " + users);
		System.out.println("Current speed: " + curr_speed + " [days/LY].");
		
		crtc(); // -------------------------------------------------------------
		
		// Machine
		Machine mchn = new Machine();
		mchn.machine_info();
		
		String mchn_stt = mchn.machine_stat();
		System.out.println("\nEngine is: " + mchn_stt);
		
		crtc(); // -------------------------------------------------------------
		
		// Fuel
		Fuel fl = new Fuel();
		fl.fuel_info();
		double fuel_lvl = fl.fuel_stat(gdistance);
		double consum = fl.fuel_consumption_per_LY;
		double final_dist = fuel_lvl / consum;
		
		System.out.println("Current distance traveled: " + gdistance + " Light Years [LY].");
		System.out.println("Fuel level in [%]: " + fuel_lvl);
		System.out.println("Current consumption: " + consum + " [% / LY].");
		System.out.println("At current consumption we can reach as much as: " + final_dist + " Light Years [LY].");
		
		crtc(); // -------------------------------------------------------------
		
		// Strom
		Strom str = new Strom();
		str.strom_info();
		
		String strom_stt = str.strom_state(1);
		System.out.println("Electric systems status:");
		System.out.println(strom_stt);
		
		crtc(); // -------------------------------------------------------------
		
		// Food
		Food fd = new Food();
		fd.food_info();
		
		double food_days_left = fd.food_stat(users);
		double days_per_reach = final_dist / curr_speed;
		
		System.out.println("There is food for " + food_days_left + " days left.");
		System.out.println("We need " + days_per_reach + " days to reach furtherest destination.");
		
		if (food_days_left > days_per_reach) {
			System.out.println("We can safely reach the furtherest destination.");
			
		} else {
			System.out.println("ALERT: There is not enough food to reach the furtherest destination!");
			System.out.println("We NEED to find closer destination.");
		}
		
		crtc(); // -------------------------------------------------------------

		
		// Living
		Living lvn = new Living();
		lvn.living_info();
		
		int curr_lvl = 8;
		int max_lvl = lvn.living_best_lvl;
		boolean living_lvl = lvn.living_qlt_level(curr_lvl);
		
		if (living_lvl == true) {
			System.out.println("Living quality level: " + curr_lvl + "/" + max_lvl + ".");
			System.out.println("Living quality at ACCEPTABLE level.");
		} else {
			System.out.println("Living quality level: " + curr_lvl + "/" + max_lvl + ".");
			System.out.println("ALERT: Living quality UNDER acceptable level!");
		}
		
		crtc(); // -------------------------------------------------------------

		
	}
}
