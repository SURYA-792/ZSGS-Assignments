package Assignment_ArrayList;

import java.util.ArrayList;

public class Fruits {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Jackfruit");
		fruits.add("Orange");
		fruits.add("Papaya");
		
		System.out.println("Third Fruit is: "+fruits.get(2));
		
	}
}
