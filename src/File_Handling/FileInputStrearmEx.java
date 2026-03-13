package File_Handling;  
// Package name where the class is stored

import java.io.FileInputStream;  
// Import FileInputStream class to read data from a file

import java.io.IOException;  
// Import IOException class to handle input/output exceptions

public class FileInputStrearmEx {  
// Main class declaration

 public static void main(String[] args) throws IOException {  
 // Main method (program execution starts from here)
 // throws IOException means if an input/output error occurs, it will be thrown to JVM
	
	 FileInputStream fis = new FileInputStream("abc.txt");  
	 // Create FileInputStream object to open and read the file "abc.txt"
	 
	 int i = fis.read();  
	 // Read the first byte from the file and store it in variable i
	 
	 while(i != -1){  
	 // Loop will run until end of file (-1 indicates end of file)
	 
		   System.out.println((char)i);  
		   // Convert the byte into character and print it
		   
		   i = fis.read();  
		   // Read the next byte from the file
	   };	 
	 
 }	
}