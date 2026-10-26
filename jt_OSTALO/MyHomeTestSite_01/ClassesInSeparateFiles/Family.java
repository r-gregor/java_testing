public class Family {

	// [01] function to print out New names
	void my_data(Info name) {
		System.out.println("New name is: " + name.get_my_name());
		System.out.println("New address is: " + name.get_my_addr());
		System.out.println("New: I am " + name.get_my_age() + " years old.");
	}

	public static void main(String[] args) {

		// Info: class with default data, methods and both constructors
		// instastiating ...
		Info mark = new Info("Mark Redelonghi", 19);
		Info greg = new Info(); // default ...
		Info zala = new Info("Zala Redelonghi", 22);
		Info spela = new Info("Spela Redelonghi", 10);
		Info tadeja = new Info("Tadeja Mali Redelonghi", 48);

		// print from parametrized constructor
		System.out.println("\nUsing parametrized constructor:");
		System.out.println("His name is: " + mark.get_my_name());
		System.out.println("He is " + mark.get_my_age() + " years old.");

		// print from default constructor
		System.out.println("\nUsing default constructor:");
		System.out.println("My name is: " + greg.get_my_name());
		System.out.println("My address is: " + greg.get_my_addr());
		System.out.println("My e-mail is: " + greg.get_my_eml());
		System.out.println("I am " + greg.get_my_age() + " years old.");

		// [01] print using function
		System.out.println("\nPrinted using function my_data(name); name = mark, greg");

		// instastiate Family class
		Family family = new Family();

		family.my_data(mark);
		System.out.println("----------------------------------------");
		family.my_data(greg);

		// put object names into array and loop trough with for loop:
		System.out.println("\nPrinted using for loop to cycle trough obj names array:");
		Info[] names = new Info[] {mark, greg, zala, spela, tadeja};

		for (int i=0; i < names.length; i++) {
			// [01] function to print out each object
			family.my_data(names[i]);
			System.out.println("----------------------------------------");
		}
	}
}
