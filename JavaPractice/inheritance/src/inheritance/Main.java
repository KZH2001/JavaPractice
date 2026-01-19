package inheritance;

public class Main {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		System.out.println(dog1.isAlive);	
		
		Cat cat1 = new Cat();
		cat1.shout();
}
}
