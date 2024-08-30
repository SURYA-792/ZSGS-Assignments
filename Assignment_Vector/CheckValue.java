package Assignment_Vector;

import java.util.Vector;

public class CheckValue {
	public static void main(String[] args) {
		Vector<Double> vt = new Vector<>();
		vt.add(10.1);
		vt.add(10.2);
		vt.add(10.3);
		vt.add(10.4);
		vt.add(10.5);
		
		System.out.println("does vector has 10.5 :"+vt.contains(10.5));
		System.out.println("Size: "+vt.size());
		System.out.println(vt);
	}
}
