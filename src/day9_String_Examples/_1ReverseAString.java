package day9_String_Examples;

public class _1ReverseAString {

	public static void main(String[] args) {

		//Approach1 - length(), charAt()
		
		/*
		String s="welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			//System.out.println(s.charAt(i));
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reverse string is:" +rev);
        */
		
		// Approach2- Without using string methods- By converting string to char array type
		
		/*
		String s="welcome";
		String rev="";
		
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			//System.out.println(a[i]);
			rev=rev+a[i];
		}
		System.out.println("Reverse string is:" +rev);
		*/
		
		// Approach3 : Using string buffer class
		
		/*
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println("Reverse string is:"+sb.reverse());
		*/
		
		// Approach4: Using string builder class
		
		StringBuilder s=new StringBuilder("Welcome");
		System.out.println("Reverse string is:" +s.reverse());
	}

}
