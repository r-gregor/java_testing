import java.util.*;

class Users {
	
	public ArrayList<String> usersList = new ArrayList<String>();
	
	public void addUserToList(String user) {
		usersList.add(user);
		System.out.printf("User %s added to usersList%n", user);
	}
	
	public void usersNum() {
		System.out.printf("Number of users in usersList: %d%n", usersList.size());
	}
}

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

	public static void main(String[] args) {
		Users myList = new Users();

		
		String[] seznam = {"Gregor Redelonghi", "Tadeja Mali Redelonghi", "Mark Redelonghi", "Zala Redelonghi", "Spelca Redelonghi", "Uknown person?"};
		
		
		for (String name : seznam) {
			uredi(myList, name);
			/*
			myList.addUserToList(name);
			myList.usersNum();
			System.out.println();
			*/
		}
		
		
		AddUsers alien = new AddUsers("ALIEN 8");
		String alien_name = alien.getName();
		
		uredi(myList, alien_name);
		/*
		myList.addUserToList(alien.getName());
		myList.usersNum();
		System.out.println();
		*/
		
	}

}