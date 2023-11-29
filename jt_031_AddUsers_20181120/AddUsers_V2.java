import java.util.*;

public class AddUsers_V2 {
	String myname;
	
	public AddUsers_V2() {
		System.out.println(	"------------------------------------------------------\n" +
							"Base Instace started.\n" +
							"------------------------------------------------------");
	}
	
	public AddUsers_V2(String name) {
		System.out.println(	"------------------------------------------------------\n" +
							"Parameterized Instace started.\n" +
							"------------------------------------------------------");
		myname = name;
	}
	
	ArrayList<String> usersList = new ArrayList<String>();
	
	void addUserToList(String user) {
		usersList.add(user);
		System.out.printf("User %s added to usersList%n", user);
	}
	
	void usersNum() {
		System.out.printf("Number of users in usersList: %d%n%n", usersList.size());
	}
	
	
	void uredi(String theName) {
			this.addUserToList(theName);
			this.usersNum();
	}


	//MAIN
	public static void main(String[] args) {
		// obj1 parameterized instance
		AddUsers_V2 obj1 = new AddUsers_V2("RogerG IhgnoledeR");
		System.out.printf("The name: %s.%n%n", obj1.myname);
		
		String[] seznam = {"Gregor Redelonghi", "Tadeja Mali Redelonghi", "Mark Redelonghi", "Zala Redelonghi", "Spelca Redelonghi", "Uknown person?"};
		
		for (String name : seznam) {
			obj1.uredi(name);
		}
		
		obj1.uredi("Conan The Barbarian");
		
		// obj2 base instance -- without parameters
		AddUsers_V2 obj2 = new AddUsers_V2();
		String[] seznam2 = {"Rogerg Ihgnoledr", "Ajedat Ilam Ihgnoleder", "Kram Ihgnoleder", "Alaz Ihgnoleder", "Acleps Ihgnoleder"};
		
		for (String name : seznam2) {
			obj2.uredi(name);
		}
				
	} // END MAIN

}