package day3_Operators;

public class TernaryOpeartor {

	public static void main(String[] args) {

		//var= exp ? result1 : result2
		
		int a=200, b=100;
		
		int x=(a>b) ? a :b;
		System.out.println(x);
		
		int y=(a<b) ? a :b;
		System.out.println(y);
		
		int z=(1==1) ? 100 : 200;
		System.out.println(z);
		
		int person_age=13;
		String res=(person_age>=18) ? "Eligible" : "Not Eligible";
		System.out.println(res);

	}

}
