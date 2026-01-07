package abstractClassMethod;

public class Main {

	public static void main(String[] args) {
		
		Circle c = new Circle(12);
		Triangle t = new Triangle(12,3);
		Rectangle r = new Rectangle(23,32);

		
		System.out.println(c.area());
		System.out.println(t.area());
		System.out.println(r.area());


	}

}
