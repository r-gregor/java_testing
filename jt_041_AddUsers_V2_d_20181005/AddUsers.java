/*
 * name:	AddUsers
 * V1_en:	20181005
 *		- void addUserToList(String user)
 *
 * V2_d:	20181006
 * 		- void uredi(Users myList, String theName)
 *
 *
 *
 */

package AddUsers_V2_d_20181005;
import java.util.*;


class Users {

	// list of users
	public ArrayList<String> usersList = new ArrayList<String>();

	public void addUserToList(String user) {
		usersList.add(user);
		System.out.printf("User %s added to usersList%n", user);
	}

	public void usersNum() {
		System.out.printf("Number of users in usersList: %d%n", usersList.size());
	}
} // END Users class


// -------------------------------------------------------------------------

public class AddUsers {
	// String user;
	String myname;

	public AddUsers() {}

	public AddUsers(String name) {
		myname = name;
	}

	public String getName() {
			return myname;
	}

	public static void uredi(Users myList, String theName) {
			myList.addUserToList(theName);
			myList.usersNum();
			System.out.println();
	}

	// MAIN
	public static void main(String[] args) {
		Users myList = new Users();


		String[] seznam = {"Gregor Redelonghi", "Tadeja Mali Redelonghi", "Mark Redelonghi", "Zala Redelonghi", "Spelca Redelonghi", "Uknown person?"};


		for (String name : seznam) {
			uredi(myList, name);
		}

		AddUsers alien = new AddUsers("ALIEN 8");
		String alien_name = alien.getName();
		uredi(myList, alien_name);

		AddUsers conan = new AddUsers("CONAN the BarbariaN");
		String conan_name = "\"" + conan.getName() + "\"";
		uredi(myList, conan_name);

		String hulk_name = new AddUsers("\"The Incredible H U L K\"").getName();
		uredi(myList, hulk_name);

		String sman_name = new AddUsers("\"The Spiderman\"").getName();
		uredi(myList, sman_name);

	} // END MAIN

} // END AddUsers class
