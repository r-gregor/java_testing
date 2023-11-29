/* testing getter setter and private members of classes
 * calling in main program from other classes trough use
 * of functions or parameterized constructors
 *
 *
 */

public class Member {
	private String name;
	private String sname;
	private int	age;

	// default constructor
	public Member() {};

	// parameterized constructor
	public Member(String name, String sname, int age) {
		this.name = name;
		this.sname = sname;
		this.age = age;
	}

	// set info if not already set with parameterized constructor
	public void setMembInfo(String name, String sname, int age) {
		this.name = name;
		this.sname = sname;
		this.age = age;
	} // END setMembInfo

	// display member info
	public void getMembInfo() {
		System.out.println("Memeber name: " + name);
		System.out.println("Memeber surname: " + sname);
		System.out.println("Memeber age: " + age + " years");
	}
} //END class
