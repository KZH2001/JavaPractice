package toString;

public class Car {
	String name;
	String model;
	
	Car(String name, String model){
		this.name = name;
		this.model = model;
		
	}
	
//	@Override
	public String toString() {
		return this.name;
	}

}
