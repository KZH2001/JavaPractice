package composition;

public class Engine {
String type; 
	Engine(String type){
		this.type = type;
	}
	
	void start() {
		System.out.print("You are the " + this.type + " engine");
	}
}
