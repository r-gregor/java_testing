package living;

public class Living {
	
	public int living_best_lvl = 10;
	
	public void living_info() {
		System.out.println("class: Living");
		System.out.println("package: living");
		// System.out.println("NOT a program. NO main function.");
	}

	public boolean living_qlt_level(int living_qlt_lvl) {
		if ((living_best_lvl - living_qlt_lvl) <= 3) {
			return true;
		} else {
			return false;
		}
	}

}