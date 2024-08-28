package Assignment_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveGreaterElements {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		System.out.println("Before Removing : "+numbers);
		
		Iterator<Integer> i = numbers.iterator();
		while(i.hasNext()) {
			if(i.next()>30) i.remove();
		}
		System.out.println("After Removing  : "+numbers);
	}
}
