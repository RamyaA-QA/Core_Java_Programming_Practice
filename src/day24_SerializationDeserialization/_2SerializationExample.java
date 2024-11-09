package day24_SerializationDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


// The object is serialized using the ObjectOutputStream and saved to a file.

public class _2SerializationExample {
	 public static void main(String[] args) {
	       // Employee emp = new Employee(101, "Ramya", "password123");

	        try (FileOutputStream fileOut = new FileOutputStream("employee.ser");
	             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

	            // Serialize the object
	           // out.writeObject(emp);
	            System.out.println("Employee object has been serialized");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
