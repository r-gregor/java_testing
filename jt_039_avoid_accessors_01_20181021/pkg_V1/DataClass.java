package pkg_V1;



public class DataClass {
	private String my_name = "my_name";
	private int my_age = 1;
	private String my_address = "my_address";
	private String my_email = "my_email";
	private String gender = "male";
	private Boolean male = true;
	private static int count = 0;

	public DataClass(String name, int age, String gender) {
		this.my_name = name;
		this.my_age = age;
		this.gender = gender;
		this.count += 1;
	}

	public DataClass(String name, int age, String gender, String address) {
		this.my_name = name;
		this.my_age = age;
		this.gender = gender;
		this.my_address = address;
		this.count += 1;
	}

	public DataClass(String name, int age, String gender, String address, String email) {
		this.my_name = name;
		this.my_age = age;
		this.gender = gender;
		this.my_address = address;
		this.my_email = email;
		this.count += 1;
	}

	public DataClass() {
		this.count += 1;
	}


	public void displayInfo() {

		if (this.gender.toLowerCase().equals("male")) {
			System.out.printf("%nSubject: %d%nName: %s%nAge: %d%nGender: %s%nAddress: %s%nE-mail: %s%n",
			this.count, this.my_name, this.my_age, this.gender.toLowerCase(), this.my_address, this.my_email);
		} else {
			System.out.printf("%nSUBJECT %d IS NOT MALE!!!%nName: %s%nAge: %d%nGender: %s%nAddress: %s%nE-mail: %s%n",
			this.count, this.my_name, this.my_age, this.gender.toLowerCase(), this.my_address, this.my_email);
		}

		halfAge();
	}

	public void halfAge() {
		int halfage = this.my_age / 2;
		System.out.printf("The half age of %s is %d.%n", this.my_name, halfage);
	}

	public static void main(String[] args) {

		DataClass empty1 = new DataClass();
		empty1.displayInfo();
		//empty1.halfAge();

		DataClass test2 = new DataClass("Tadeja Mali Redelonghi", 48, "FeMale", "Valvasorjeva ulica 5");
		test2.displayInfo();
		//test2.halfAge();

		DataClass test1 = new DataClass("Gregor Redelonghi", 50, "Male");
		test1.displayInfo();
		//test1.halfAge();

		DataClass test3 = new DataClass("Joda (The Jedi)", 885, "MALE", "Tatooin, Aldebaran", "joda.the.jedi@star-wars.com");
		test3.displayInfo();
		//test3.halfAge();

	}

}
