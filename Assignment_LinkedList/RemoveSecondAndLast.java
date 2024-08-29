package Assignment_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveSecondAndLast {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println("Before Removing: "+list);
		list.remove(2);
		// After Removing second element will make last element index to 8
		list.remove(8);
		System.out.println("After removing: "+list);
	}
}
