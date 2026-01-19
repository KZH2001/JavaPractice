
public class Library {
	
	String name;
	int year;
	Book[] books;
	
	
	Library(String name,int year,Book[] books){
		this.name = name;
		this.year = year;
		this.books = books;
//		System.out.println("Libraray" + this);
		
		
	}
	void showInfo() {
		System.out.print("Library name is " + this.name + " and" + "it is " + year );
		for(Book book : books) {
			System.out.print(book.displayInfo());
		}
	}
	
	

}
