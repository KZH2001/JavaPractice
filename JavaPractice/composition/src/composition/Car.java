package composition;

public class Car {
	String name;
	int year;
	Engine engine;
	
	Car(String name, int year, String engineType){
			this.name = name;
			this.year = year;
			this.engine = new Engine(engineType);
	}
	
	
	void start() {
		this.engine.start();
	}

}
