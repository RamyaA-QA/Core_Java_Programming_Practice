package day4_Conditions;

public class _4LargestOf3Numbers {

	public static void main(String[] args) {
		
		int a=50,b=30,c=20;
		
		if(a>b && a>c)
		{
			System.out.println("A is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is largest number");
		}
		else
		{
			System.out.println("C is largest number");
		}
	}

}
