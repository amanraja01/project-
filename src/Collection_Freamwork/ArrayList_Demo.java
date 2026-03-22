package Collection_Freamwork; // Package name (used to organize code)

import java.util.ArrayList; // Importing ArrayList class

public class ArrayList_Demo {

	public static void main(String[] args) {
		
		// Creating ArrayList for String type
		ArrayList<String> al = new ArrayList<String>();
		
		// Creating ArrayList for Integer type
		ArrayList<Integer> ai = new ArrayList<Integer>();
		
		// Adding elements to String list
		al.add("Aman");
		al.add("Ramajn");
		
		// Printing list
		System.out.println(al); // [Aman, Ramajn]
       
	    // Adding elements at specific index
	    al.add(0,"Sameer");   // Insert at index 0
	    al.add(2,"Surender"); // Insert at index 2
	    System.out.println(al); // [Sameer, Aman, Surender, Ramajn]
	    
	    // Removing element at index 1 (Aman removed)
	    al.remove(1);
	    System.out.println(al); // [Sameer, Surender, Ramajn]
	    
	    // Updating element at index 0
	    al.set(0, "aman");
	    System.out.println(al); // [aman, Surender, Ramajn]
	    
	    // Getting element at index 1 (but not printing it)
	    al.get(1); // returns "Surender"
	    System.out.println(al); // list remains same
	    
	    // Clearing all elements
	    al.clear();
	    System.out.println(al); // []
	    
	    // Adding Integer value
	    ai.add(1212);
	    System.out.println(ai); // [1212]
	}
}




