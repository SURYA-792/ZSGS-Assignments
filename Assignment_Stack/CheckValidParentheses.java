package Assignment_Stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckValidParentheses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<>();
		System.out.println("Enter the Parentheses: ");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='(') st.push(ch);
			else {
				if(st.isEmpty()) {
					System.out.println("Not Balanced!");
					break;
				}
				st.pop();
			}
		}
		if(st.isEmpty()) System.out.println("Balanced!");
		else System.out.println("Not Balanced!");
	}
}
