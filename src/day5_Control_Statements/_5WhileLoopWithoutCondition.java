package day5_Control_Statements;

public class _5WhileLoopWithoutCondition {

	public static void main(String[] args) {
		
		/*
		 * int j=1;
		 * 
		 * while(j<=10) { System.out.println("Aadhvi");
		 * 
		 * }
		 */
		int i=1;
		
		while(i<=10)
		{
			System.out.println("Aadhvi");
			i++;
		}
		
		int k=1;
		
		while(true)
		{
			System.out.println("Ramya");
			k++;
			
			if(k==10)
			{
				break;
			}
		}

	}

}
