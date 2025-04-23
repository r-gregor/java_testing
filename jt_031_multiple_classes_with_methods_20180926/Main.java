// imports

public class Main {
	public static void main(String[] args) {

		if (args.length != 3) {
			GetInfo info = new GetInfo();
		} else {
			GetInfo info = new GetInfo(args[0], args[1], Integer.parseInt(args[2]));
			info.InfoAboutPerson();
		}
	}
}
