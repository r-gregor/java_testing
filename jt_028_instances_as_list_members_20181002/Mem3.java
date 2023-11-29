public class Mem3 {
	private String name;
	private String sname;
	private int age;
	
	// default constructor
	public Mem3 () {};

	// parameterized constructor
	public Mem3 (String name, String sname, int age) {
		this.name = name;
		this.sname = sname;
		this.age = age;
	}

	// <------------ getter and setter methods ------------------>
	public String getName() {
		return this.name;
	}

	public String getSname() {
		return this.sname;
	}

	public int getAge() {
		return this.age;
	}
	// <------------ getter and setter methods ------------------>
	
} // END class
