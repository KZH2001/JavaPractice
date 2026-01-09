package runtimepPolymorphism;
import java.util.*;

public class Main{
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

		Animal animal;
		
		System.out.println("Enter no 1 or 2");
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			animal = new Dog();
			animal.sound();
		}
		if (choice == 2) {
			animal = new Cat();
			animal.sound();
		}
		
	}
}

