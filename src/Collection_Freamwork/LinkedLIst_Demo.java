package Collection_Freamwork; // Package name (used to organize code)

import java.util.LinkedList; // Importing LinkedList class

public class LinkedLIst_Demo { // Main class

	public static void main(String[] args) { // Entry point of program
		
		// Creating a LinkedList that stores String values
		LinkedList<String> ls = new LinkedList<String>();
		
		// Adding elements to the list
		ls.add("Aman");
	    ls.add("Ramajn");
		
		// Printing the list
		System.out.println(ls); // Output: [Aman, Ramajn]
        
		// Adding element at the beginning
		ls.addFirst("Sameer");
		System.out.println(ls); // [Sameer, Aman, Ramajn]
		
		// Adding element at the end
		ls.addLast("Jaheer");
		//System.out.println(ls); // [Sameer, Aman, Ramajn, Jaheer]
		
		// Inserting element at index 3
		ls.add(3,"karan");
		//System.out.println(ls); // [Sameer, Aman, Ramajn, karan, Jaheer]
       
		// Removing element at index 1 (Aman will be removed)
		ls.remove(1);
		//System.out.println(ls); // [Sameer, Ramajn, karan, Jaheer]
		
		// Using for-each loop to print all elements
		for(String str : ls ) {
			System.out.println(str);
		}
		
		// Clearing all elements from the list
		ls.clear();
		
		// Printing empty list
		System.out.println(ls); // Output: []
	  
         ls.offerFirst("Manager");	
         System.out.print(ls);
         
         System.out.println(ls.peek());

         System.out.println(ls.poll());
         
}
}  