package Assignment_Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<>();
		System.out.println("Enter the String: ");
		String str = sc.next();
		for(int i = 0;i<str.length();i++) {
			st.push(str.charAt(i));
		}
		
		str = "";
		
		while(!st.isEmpty()) str+=st.pop();
		System.out.println(str);
	}
}
