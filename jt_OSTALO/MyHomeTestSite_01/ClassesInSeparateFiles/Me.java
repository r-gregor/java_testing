public class Me {
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
