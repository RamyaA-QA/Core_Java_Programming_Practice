package day18_ExceptionHandling;

public class _3MultipleCatchBlocks {

	public static void main(String[] args) {
		
		// Example: NullPointerException
		
		System.out.println("Program is started...");
		
		String s1=null;
		
		try
		{
		
		System.out.println(s1.length()); //java.lang.NullPointerException
		
		}
		
		/*
		
		catch (ArithmeticException e) {
			System.out.println("Handled Exception");
			System.out.println(e.getMessage());
		}
		
		catch (NullPointerException e) {
			System.out.println("Handled Exception");
			System.out.println(e.getMessage());
		}
		
		catch (NumberFormatException e) {
			System.out.println("Handled Exception");
			System.out.println(e.getMessage());
		}
		*/
		
		catch (Exception e) {
			System.out.println("Handled Exception");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program finished");

	}

}
