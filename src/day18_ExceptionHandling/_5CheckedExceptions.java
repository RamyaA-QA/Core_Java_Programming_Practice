package day18_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _5CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Program started....");
		System.out.println("Program Inprogress...");
		
		Thread.sleep(5000);
		
		FileInputStream file=new FileInputStream("C:\\Users\\abbur\\OneDrive\\Desktop\\Ramya\\Programs_Practice\\Sample.txt");
		
		/*
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		*/
		
		System.out.println("Program Finished....");
		System.out.println("Program exited....");

	}

}
