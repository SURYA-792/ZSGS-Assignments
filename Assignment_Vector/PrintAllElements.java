package Assignment_Vector;

import java.util.Vector;

public class PrintAllElements {
	public static void main(String[] args) {
		Vector<Integer> vt = new Vector<>();
		vt.add(10);
		vt.add(20);
		vt.add(30);
		vt.add(40);
		vt.add(50);
		System.out.println("Third Element: "+vt.get(2));
		System.out.println(vt);
	}
	
}
