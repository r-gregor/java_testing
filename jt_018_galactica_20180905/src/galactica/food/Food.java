package food;

public class Food {
	
	public double daily_mels = 75425.0;
	
	public void food_info() {
		System.out.println("class: Food");
		System.out.println("package: food");
		// System.out.println("NOT a program. NO main function.");
	}


	public double food_stat(double users) {
		double food_curr_state = daily_mels / users;
		return food_curr_state;
	}

}