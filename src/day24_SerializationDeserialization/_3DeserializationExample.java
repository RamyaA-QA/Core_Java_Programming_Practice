package day24_SerializationDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import day10_Class.Employee;

// The object is deserialized using the ObjectInputStream and read from the file.
public class _3DeserializationExample {
	public static void main(String[] args) {
        Employee emp = null;

        try (FileInputStream fileIn = new FileInputStream("employee.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            // Deserialize the object
            emp = (Employee) in.readObject();
            System.out.println("Employee object has been deserialized");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Display the object after deserialization
        System.out.println(emp);
    }
}
