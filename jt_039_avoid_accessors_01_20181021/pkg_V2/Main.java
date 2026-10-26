package pkg_V2;
import pkg_V2.Part;


public class Main {

	public static void main(String[] args) {
		System.out.println("Starting ...");

		Part chair = new Part("Chair", 5, "Wood");
		Part wardrobe = new Part("Wardrobe", 72, "Wood");
		Part drillm = new Part("Drilling machine", 2, "Metal");
		Part test = new Part();
		Part hammer = new Part("Hammer", 3, "Wood/Mwtal");
		Part gearb = new Part("Gear box", 105, "Metal");


		Part[] parts = {chair, drillm, hammer, gearb, wardrobe};

		for (Part part : parts) {
			part.printInfo();
		}
	}
}
