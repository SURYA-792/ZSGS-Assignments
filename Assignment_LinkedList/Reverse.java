package Assignment_LinkedList;

import java.util.LinkedList;

public class Reverse {
	public static void main(String[] args) {
		LinkedList<Character> list  = new LinkedList<>();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		System.out.println("Before Reverse: "+list);
		
		int left = 0, right = list.size()-1;
		while(left<right) {
			char temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);
			left++;
			right--;
		}
		System.out.println("After Reverse : "+list);
	}
}
