package day8_Strings;

/*
 * Immutable: we cannot change
 * Mutable: We can change
 * 
 * String: Immutable
 * StringBuffer: Mutable
 * StringBuilder: Mutable
 * 
 * String comparisions: == equals()
 * String s="Welcome"
 * String s=new String("Welcome"); // Memory location is different
 */

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String s="Aadhvi";
		System.out.println(s); //Aadhvi
		
		//length() : Returns length of a string (number of characters)
		
		String s1="Aadhvi";
		s1.length();
		System.out.println(s1.length());//6
		System.out.println("Welcome".length());//7
		
		//concat() : Joining strings
		
		String s2="Welcome";
		String s3=" to Java";
		String s4=" Automation";
		
		System.out.println(s2+s3); //Welcome to Java
		System.out.println(s2.concat(s3)); //Welcome to Java
		
		System.out.println(s2+s3+s4); //Welcome to Java Automation
		System.out.println(s2.concat(s3).concat(s4));//Welcome to Java Automation
		System.out.println(s2.concat(s3+s4)); //Welcome to Java Automation
		
		System.out.println("Welcome"+" to java"); //Welcome to java
		System.out.println("Welcome".concat(" to java")); //Welcome to java
		
		//trim() : Remove spaces right and left side
		
		String s5="   Welcome  ";
		
		System.out.println(s5); // print string along with spaces
		System.out.println("Before trimming:" +s5.length()); //12
		
		System.out.println(s5.trim());
		System.out.println("After trimming:" +s5.trim().length());//7
		
		//charAt() : Returns a character from a string based on index
		//Index starts from 0
		
		String s6="Welcome";
		System.out.println(s6.charAt(3));//c
		System.out.println(s6.charAt(0));//W
		
		//contains() : Returns true/false
		//Check string is part of main string or not
		
		String s7="Aadhvi";
		
		System.out.println(s7.contains("dh"));//true
		System.out.println(s7.contains("Aa"));//true
		System.out.println(s7.contains("aa"));//false
		
		//equals(), equalsIgnoreCase() - compare strings
		
		String s8="Aadhvi";
		String s9="aadhvi";
		
		System.out.println(s8==s9); // false
		System.out.println(s8.equals(s9));//false
		System.out.println(s8.equalsIgnoreCase(s9));//true
		System.out.println(s8.equals("Aadhvi")); //true
		
		// Replace() : Replace single/multiple (sequence) of characters in a string
		
		String s10="Welcome to selenium java selenium python selenium c#";
		
		System.out.println(s10.replace('e', 'X')); //WXlcomX to sXlXnium java sXlXnium python sXlXnium c#
		System.out.println(s10.replace("selenium", "PlayWright"));//Welcome to PlayWright java PlayWright python PlayWright c#
		
		// substring() : Extract substring from the main string
		// Starting index - 0
		//Ending index - 1
		
		String s11="Selenium";
		System.out.println(s11.substring(1,5));//elen
		System.out.println(s11.substring(0,3));//Sel
		
		//toUppercase(), toLowercase()
		
		String s12="Aadhvi";
		System.out.println(s12.toUpperCase());//AADHVI
		System.out.println(s12.toLowerCase());//aadhvi
		
		//split() : Split the string into multiple parts based on delimeter
		
		String s13="aaburiramya2@gmail.com";
		
		String a[]=s13.split("@");
		System.out.println(a[0]);//aaburiramya2
		System.out.println(a[1]);//gmail.com

		//ex1
		
		String amount="$15,20,55";
		System.out.println(amount.replace("$",""));// 15,20,55
		
		//ex2
		
		String s14="abburi,ramya@gmail"; // abburi   ramya   gmail
		
		String arr1[]=s14.split(",");
		System.out.println(Arrays.toString(arr1)); //[abburi, ramya@gmail]
		
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));//[ramya, gmail]
		
		System.out.println(arr1[0]);//abburi
		System.out.println(arr2[0]);//ramya
		System.out.println(arr2[1]);//gmail
		
		//ex3
		
		String s15="abc 123 xyz";
		String ar[]=s15.split("  ");
		System.out.println(Arrays.toString(ar));// [abc 123 xyz]
		
		// * % ^ & (  ) - You cannot use as delimeters
		
		//ex4
		
		String name=" Aadhvi Thanikonda";
		System.out.println(name.contains("aadhvi")); //false
		
		System.out.println(name.replace('A', 'a').contains("aadhvi"));//true
		System.out.println(name.toLowerCase().contains("thanikonda"));//true
		
		

	}

}
