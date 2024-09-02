package day17_WrapperClass;

public class _1DataConversionMethods {

	public static void main(String[] args) {

		// String to Int
		
		//String s="Welcome"; // Can not convert to Int
		//int sint=Integer.parseInt(s);// NumberFormat Exception

		String s1="10";
		String s2="20";
		System.out.println(s1+s2);//1020
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));//30
		
		// String to Double
		
		String s3="10.5";
		String s4="20.0";
		
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4)); //30.5
		
		
		String s5="false";
		System.out.println(Boolean.parseBoolean(s5)); //false
		
		String s6="WELCOME";
		System.out.println(Boolean.parseBoolean(s6));//false
		
		String s7="true";
		System.out.println(Boolean.parseBoolean(s7)); //true
		
		String s8="SELENIUM";
		System.out.println(Boolean.parseBoolean(s8));//false
		
		// String to boolean
		
		String s9="true";// Otherthan true, if you pass any string that will returns false
		System.out.println(Boolean.parseBoolean(s9));//true
		
		int a=10;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		String s=String.valueOf(a);
		System.out.println(s);//10
		
		s=String.valueOf(d);
		System.out.println(s);//10.5
		
		s=String.valueOf(c);
		System.out.println(s);//A
		
		s=String.valueOf(bool);
		System.out.println(s);//true
	}

}
