package haspMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, Double> box = new HashMap<>();
		
		box.put("Orange",0.23);
		box.put("Apple",023.23);
		box.put("Pineapple",23.23);


		for (String key : box.keySet()) {
			System.out.println(key);
			System.out.println(box.get(key));
		}
	}

}
