package composition;

public class Main {

	public static void main(String[] args) {

		Car car = new Car("BMW",2025,"A");
		
		System.out.println(car.name);
		System.out.println(car.year);
		System.out.println(car.engine.type);
		
		car.start();
	}

}
