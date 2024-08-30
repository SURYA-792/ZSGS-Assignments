package Assignment_Vector;

import java.util.Arrays;
import java.util.Vector;

public class convert {
	public static void main(String[] args) {
		Vector<String> vt = new Vector<>();
		vt.add("red");
		vt.add("green");
		vt.add("blue");
		vt.add("yellow");
		
		String arr[] = vt.toArray(new String[0]);
		System.out.println("Vector Emements: "+vt);
		System.out.println("Array Elements : "+Arrays.toString(arr));
		
		Vector<String> vt2 = new Vector<>(Arrays.asList(arr));
		
		System.out.println("Vector Emements: "+vt2);
	}
}
