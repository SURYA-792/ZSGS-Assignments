package Assignment_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		
		String arr[] = list.toArray(new String[0]);
		
		System.out.println("List : "+ list);
		for(String str:arr) {
			System.out.print(str+" ");
		}
		System.out.println();
		
		ArrayList<String> copyArr =new ArrayList<>(Arrays.asList(arr));
		System.out.println("List: "+copyArr);
	}
}
