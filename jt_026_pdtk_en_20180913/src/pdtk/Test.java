public class Test {
	public static void main(String[] args) {
		String name;
		if (args.length == 1) {
			name = args[0];
		} else {
			name = "None";
		}
		
		if (name.contains("All")) {
			System.out.printf("Doing something with %s ...\n", name);
		} else {
			System.out.printf("The name is: %s.\n", name);
			System.out.println("Doing nothing!\n");
		}

		
		
		
	} // END main

} //END Test class