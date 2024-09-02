package day9_String_Examples;

import java.util.Arrays;

public class _2MutableVSImmutable {

	public static void main(String[] args) {
		
		//Mutable- Can change
		
		/*
		
		int a[]= {20,10,30,40,50};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		*/
		
		// String - Immutable - Cannot change
		
		/*
		
		String s=new String("Welcome");
		
		System.out.println(s);// Welcome
		
		String concatString=s.concat(" to Java");
		
		System.out.println(s); // Welcome -- Immutable -we can not change
		
		System.out.println(concatString);
		
		*/
		
		// StringBuffer - Mutable
		
		StringBuffer sb=new StringBuffer("Welcome");
		sb.append(" to Java");
		System.out.println(sb);//Mutable- we can change original value of s  -- Welcome to Java
		
		// StringBuilder - Mutable
		
		StringBuilder sb1=new StringBuilder("Welcome");
		sb1.append(" to Java");
		System.out.println(sb1);//Mutable- we can change original value of s  -- Welcome to Java


		

	}

}
