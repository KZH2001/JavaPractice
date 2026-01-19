import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
		String result = time.format(format);
		System.out.println(result);
		
		
		Dog dog1  = new Dog();
		dog1.speak();
		
		Dog dog2 = new Dog() {	
			@Override
			void speak() {
				System.out.print("Hello");
			}
		};
		dog2.speak();

		
	}

}
