package Assignment_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReplaceThree {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println("Before replace: ");
		ListIterator<String> i = list.listIterator();
		while (i.hasNext()) {
			if (i.next().equals("three")) i.set("THREE");
		}
		System.out.println("After replace: " + list);
	}
}
