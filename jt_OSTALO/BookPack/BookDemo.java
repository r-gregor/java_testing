/*
 * Inserted from book:
 * "Java: A Beginner’s Guide"
 * 20181007
 *
*/

// A short package demonstration.
package BookPack;

class Book {
	private String title;
	private String author;
	private int pubDate;

	Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}

	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}


class BookDemo {
	public static void main(String[] args) {
		Book books[] = new Book[5];

		books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2005);
		books[1] = new Book("Java: The Complete Reference", "Schildt", 2005);
		books[2] = new Book("The Art of Java", "Schildt and Holmes", 2003);
		books[3] = new Book("Red Storm Rising", "Clancy", 1986);
		books[4] = new Book("On the Road", "Kerouac", 1955);

		for(int i=0; i < books.length; i++) books[i].show();
	}
}
