package Collection_Freamwork;

import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("aman");
		v.add("ramnjan");
		v.add("jaheer");
		v.add(100);
		v.add(11.11);
		System.out.println(v);
		
		System.out.println(v.firstElement());
		
		System.out.println(v.lastElement());
	}
}
