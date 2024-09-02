package day15_MethodOverriding_Final_Super;

class Test
{
	//int x=100;
	final int y=200;
}

public class _3FinalKeyword {

	public static void main(String[] args) {

		Test t=new Test();
		
		//System.out.println(t.x);//100
		
		//t.x=200;
		//System.out.println(t.x);//200
		
		//t.y=300; // Incorrect, bcoz Y is final variable - Compile time error
		System.out.println(t.y);
		

	}

}
