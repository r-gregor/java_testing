// imports

public class GetInfo {

	private String gr_name = null;
	private String gr_address = null;
	private int gr_year = 0;

	public GetInfo() {
		System.out.print("Usage: java Main [name] [address] [year].");
	};

	GetInfo(String person, String address, int year) {
		this.gr_name = person;
		this.gr_address = address;
		this.gr_year = year;
	}

	public void InfoAboutPerson() {
		System.out.printf("Hy %s! You live on %s, right? The year is %d.%n", this.gr_name, this.gr_address, this.gr_year);

		if (this.gr_year < 1960) {
			System.out.println("Wow. You are an OLDIE!");
		} else {
			System.out.println("OK. Our legue. Welcome.");
		}
	}
} // END class
