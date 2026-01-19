public class Mian {

	public static void main(String[] args) {
		Book book1  = new Book("Rabbit",23);
		Book book2  = new Book("Turtle",223);
		Book book3  = new Book("Dog",233);
		Book book4  = new Book("Bird",234);

		Book[] books = {book1,book2,book3};
		for (Book book: books) {
			System.out.println(book.displayInfo());

		}
		
		Library lib = new Library("TH",2022,books );
		lib.showInfo();


	}
	

}
