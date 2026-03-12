package File_Handling;
// Package name where the class is stored

import java.io.FileOutputStream;
// Import FileOutputStream class to write data to a file

import java.io.IOException;
// Import IOException class to handle input/output errors

public class FileOutStream {
// Class declaration

	public static void main(String[] args) throws IOException {
	// Main method (program starts execution from here)
	// throws IOException handles file related errors
		
		String name = "aman";
		// Create a string variable with value "aman"
		
		byte[] charArray = name.getBytes();
		// Convert the string into a byte array because FileOutputStream writes data in bytes
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		// Create FileOutputStream object to create/open the file "abc.txt"
		// If the file does not exist, it will be created
		
		fos.write(charArray);
		// Write the byte array data into the file
		
		fos.close();
		// Close the stream to free system resources
		
		System.out.println("Succesfully Write......");
		// Print message after writing data successfully
		
	}
}