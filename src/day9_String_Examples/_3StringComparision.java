package day9_String_Examples;

public class _3StringComparision {

	public static void main(String[] args) {

		// Case1
		
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2));//true
		
		//Case2
		
		String s3=new String("welcome");
		String s4=new String("welcome");
		System.out.println(s3);//welcome
		System.out.println(s4);//welcome
		
		System.out.println(s3==s4);//false -- To compare the objects
		System.out.println(s3.equals(s4));//true -- To compare values of objects
		
		// Case3
		
		String s5="abc";
		String s6=new String("abc");
		
		System.out.println(s5==s6);//false
		System.out.println(s5.equals(s6));//true
		
		//case4
		
		String s7="abc";
		String s8=new String("abc");
		String s9=s8;
		
		System.out.println(s7==s8);//false
		System.out.println(s7.equals(s8));//true
		
		System.out.println(s8==s9);//true, bcoz objects are same/equal
		System.out.println(s8.equals(s9));//true
		
		System.out.println(s7==s9);//false
		System.out.println(s7.equals(s9));//true
		
		
		

	}

}
