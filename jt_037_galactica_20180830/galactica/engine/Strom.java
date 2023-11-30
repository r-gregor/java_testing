package engine;

public class Strom {

	public void strom_info() {
		System.out.println("class: Strom");
		System.out.println("package: engine");
		// System.out.println("NOT a program. NO main function.");
	}
	
	public String strom_state(int state) {
		boolean curr_strom_stat;
		
		if (state == 1) {
			curr_strom_stat = true;
		} else {
			curr_strom_stat = false;
		}
		
		if (curr_strom_stat == true) {
			return "ALL ELECTRICAL SYSTEMS OPERATIONAL.";
		} else {
			return "!!! ELECTRICAL SYSTEM FAILURE DETECTED !!!";
		}
	}	

}