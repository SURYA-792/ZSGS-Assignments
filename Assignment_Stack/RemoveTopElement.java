package Assignment_Stack;

import java.util.Stack;

public class RemoveTopElement {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.println("Before Remove top element: "+st);
		st.pop();
		System.out.println("After Remove top element : "+st);
	}
}
