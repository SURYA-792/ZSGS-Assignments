package Assignment_LinkedList;

import java.util.LinkedList;

public class FirstAndLastNumbers {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
		System.out.println("First Element is : "+list.get(0));
		System.out.println("Last Element is  : "+list.get(list.size()-1));
	}
}
