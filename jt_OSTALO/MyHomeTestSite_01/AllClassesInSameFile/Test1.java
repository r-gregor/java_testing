//Test1.java

class Info {
	String my_name = "Gregor Redelonghi";
	String my_addr = "Valvasorjeva ulica 5, 1000 Ljubljana";
	int my_age = 50;
	String my_email = "gredelonghi@gmail.com";
	static String test = "Test static variable";

	String get_my_name() {
		return my_name;
	}

	String get_my_addr () {
		return my_addr;
	}

	int get_my_age () {
		return my_age;
	}

	String get_my_eml () {
		return my_email;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Info me = new Info();

		String e_mail = me.my_email;
		String test = Info.test;
		System.out.println(test);

		System.out.println("My name is: " + me.get_my_name());
		System.out.println("My address is: " + me.get_my_addr());
		System.out.println("My e-mail is: " + me.get_my_eml());
		System.out.println("I am " + me.get_my_age() + " years old.");

		System.out.println("Accessing a variable from class: e_mail = " + e_mail);
	}
}
