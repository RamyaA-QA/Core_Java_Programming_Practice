package day3_Operators;

public class IncrementOperator {

	public static void main(String[] args) {
		
		// ++ is called increment operator
		
		/*case:1
		 int a=10;
		 
		System.out.println(a);//10
		
		a=a+1;
		System.out.println(a);//11
		*/
		
		//case 2 - post increment -- Assignment and then increment
		
		/*int a=10;
		int res=a++; 
		System.out.println(res);//10
		System.out.println(a);//11
		*/
		
		//case 3- pre increment -- Increment and then assignment
		
		int a=10;
		int res=++a;
		System.out.println(res);//11
		System.out.println(a);//11
				
	}

}
