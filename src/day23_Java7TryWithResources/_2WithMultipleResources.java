package day23_Java7TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//You can manage multiple resources using try-with-resources by declaring them in the try block, separated by semicolons (;).

public class _2WithMultipleResources {
	
	public static void main(String[] args) {
		
	String inputFilePath = "C:\\Users\\abbur\\OneDrive\\Desktop\\Magnus_Infotech\\Interview_Preparation\\TestData\\input.txt";
    String outputFilePath = "C:\\Users\\abbur\\OneDrive\\Desktop\\Magnus_Infotech\\Interview_Preparation\\TestData\\output.txt";

    // Try-with-resources with multiple resources
    //BufferedReader and FileWriter are resources managed in the try-with-resources block.
    //Both resources are closed automatically when the block finishes, ensuring proper resource management without the need for manual closing.
    
    try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
         FileWriter writer = new FileWriter(outputFilePath)) {

        String line;
        while ((line = br.readLine()) != null) {
            writer.write(line + "\n");
        }
        System.out.println("Success");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
