package day18_ExceptionHandling;

public class _4FinallyBlock {

	public static void main(String[] args) {

		//String s=null;
		
		String s1="Ramya";
		
		try
		{
			System.out.println(s1.length());
		}
		
		catch (NullPointerException e) {

			System.out.println("Catch block handled exception....");
			System.out.println(e.getMessage());
		}
		
		/*
		catch (NumberFormatException e) {
			System.out.println("Catch block handled exception....");
			System.out.println(e.getMessage());
		}
		*/
		finally {
			System.out.println("You entered into finally block....");
		}
		
		System.out.println("Program finished....");

	}

}
