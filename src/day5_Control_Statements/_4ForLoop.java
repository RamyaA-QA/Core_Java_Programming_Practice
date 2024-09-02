package day5_Control_Statements;

public class _4ForLoop {

	public static void main(String[] args) {

		// Print 1 to 10 numbers
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		// Print 1 to 10 numbers
		
		for (int i=2;i<=10;i+=2) 
		{
			System.out.println(i);
		}
		
		// Print even and odd numbers in between 1 to 10 numbers
		
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even:"+i);
			}
			else
			{
				System.out.println("Odd:"+i);
			}
		}
		
		// Print 10 to 1 numbers
		
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}

	}

}
