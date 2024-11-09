package day23_Java7TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * In Java, try-with-resources is a feature introduced in Java 7 to ensure that resources are closed automatically after use.
 * It is primarily used for managing resources such as file handles, database connections, sockets, etc., 
 * that must be closed to avoid memory leaks or other resource exhaustion issues. 
 * Any object that implements the AutoCloseable interface (or its sub-interface Closeable) can be used with try-with-resources.
 */

/*
 * Syntax: 
 * try (ResourceType resource = new ResourceType()) {
    // Use the resource
} catch (ExceptionType e) {
    // Handle the exception
}
 */
public class _1WithFileIO {

	// reading a file using BufferedReader, where the resource (BufferedReader) is automatically closed after the operation
	
	public static void main(String[] args) {
        // Path to a text file
		
        String filePath = "C:\\Users\\abbur\\OneDrive\\Desktop\\Magnus_Infotech\\Interview_Preparation\\TestData\\example.txt";

        // Try-with-resources block
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
