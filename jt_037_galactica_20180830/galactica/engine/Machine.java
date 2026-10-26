package engine;

public class Machine {
	
	public void machine_info() {
		System.out.println("class: Machine");
		System.out.println("package: engine");
		// System.out.println("NOT a program. NO main function.");
	}
	
	public String machine_stat() {
		boolean curr_stat = true;
		if (curr_stat == true) {
			return "RUNNING";
		} else {
			return "OFF";
		}
	}

}