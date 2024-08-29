package Assignment_Stack;

import java.util.Stack;

public class StackToArray {
	public static void main(String[] args) {
		Stack<Double> st1 = new Stack<>();
		st1.push(1.1);
		st1.push(2.2);
		st1.push(3.3);
		st1.push(4.4);
		st1.push(5.5);

		double arr[] = new double[st1.size()];
		Stack<Double> st2 = new Stack<>();
		int i = 0;
		
		System.out.print("Array Elements: ");
		
		while (!st1.isEmpty()) {
			arr[i] = st1.pop();
			st2.push(arr[i]);
			System.out.print(arr[i++] + " ");
		}
		
		System.out.print("\nStack Elements: ");
		
		while (!st2.isEmpty()) {
			System.out.print(st2.pop()+" ");
		}

	}
}
