package day3_Operators;

public class DecrementOperator {

	public static void main(String[] args) {
		
		// -- is called decrement operator
		
				/*case:1
				 int a=10;
				 
				System.out.println(a);//10
				
				a=a-1;
				System.out.println(a);//9
				
				*/
				//case 2 - post decrement -- Assignment and then decrement
				/*
				int a=10;
				int res=a--; 
				System.out.println(res);//10
				System.out.println(a);//9
			    */
				
				//case 3- pre decrement -- decrement and then assignment
				
				int a=10;
				int res=--a;
				System.out.println(res);//9
				System.out.println(a);//9
				

	}

}
