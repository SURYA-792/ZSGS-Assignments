package Assignment_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CharacterSearch {
	public static void main(String[] args) {
		ArrayList<Character> chars = new ArrayList<>();
		chars.add('q');
		chars.add('w');
		chars.add('a');
		chars.add('s');
		chars.add('f');;
		chars.add('b');
		chars.add('j');
		chars.add('i');
		chars.add('p');
		chars.add('t');
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		
		System.out.println(search(ch, chars));
	}
	static int search(char ch, ArrayList<Character> chars) {
		int index = -1;
		for(int i = 0;i<chars.size();i++) {
			if(chars.get(i)==ch) index = i;
		}
		return index;
	}
}
