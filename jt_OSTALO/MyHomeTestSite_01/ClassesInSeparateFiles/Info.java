class Info {
	String my_name = "Gregor Redelonghi";
	String my_addr = "Valvasorjeva ulica 5, 1000 Ljubljana";
	int my_age = 50;
	String my_email = "gredelonghi@gmail.com";
	static String test = "Test static variable";

	// default constructor
	Info() {}

	// parametrized constructor
	Info(String name, int age) {
		my_name = name;
		my_age = age;
	}

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
