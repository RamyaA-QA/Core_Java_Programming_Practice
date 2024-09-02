package day2_DataTypes_Variables;
/*
 * Variables: Represents type of data.
 * 1. Primitive DT's: byte,short,int,long,float,double,char,boolean
 * 2. Non-Primitive DT's: String, ArrayList,HashMap,HashSet
 */
public class DataTypes {

	public static void main(String[] args) {
		
		//Numeric Data Types
		
		int a=100,b=200;
		
		System.out.println("The value of A is:"+a);
		System.out.println("The value of B is:"+b);
		System.out.println(a+b);
		System.out.println("The concatination of A and B is:"+a+b);
		
		byte by=125;
		System.out.println(by);
		
		short sh=3535;
		System.out.println(sh);
		
		long l=21232323232323L;
		System.out.println(l);
		
		//Decimal Numbers - float,double
		
		float item_Price=15.5F;
		System.out.println(item_Price);
		
		double dl=1234.43434356;
		System.out.println(dl);
		
		char grade='A';
		System.out.println(grade);
		
		String name="Ramya";
		System.out.println(name);
		
		//char ch='ABC'; // Invalid
		//String ch1='ABC'; // Invalid
		//String ch2='A'; // Invalid
		String ch3="A"; // valid
		
		boolean bl=false; // Allows only true/false
		System.out.println(bl);

		//boolean bl1="true"; // Invalid
		//boolean bl2="false";// Invalid
		
		//String bl3=true;//Invalid
		String bl4="true";//valid
	}

}
