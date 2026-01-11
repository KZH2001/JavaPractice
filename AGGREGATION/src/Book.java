
public class Book {
	String title;
	int page;

	Book(String title, int page) {
		this.title = title;
		this.page = page;
		}
	
	String displayInfo() {
		return this.title + " " + this.page + " pages";
	}
}
