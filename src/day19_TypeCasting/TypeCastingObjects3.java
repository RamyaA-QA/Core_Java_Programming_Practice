package day19_TypeCasting;

// A b=(C)d;

public class TypeCastingObjects3 {

	public static void main(String[] args) {
		
		// Ex:1
		
		/*
		Object o=new String("Welcome");
		StringBuffer sb=(StringBuffer)o; // Rule1-Yes, Rule2-Yes, Rule3-Failed
		*/
		
		//Ex:2
		
		/*
		String s=new String("Welcome");
		StringBuffer sb1=(StringBuffer)s;// Rule1:Failed
		*/
		
		//Ex:3
		
		/*
		Object o=new String("Welcome");
		StringBuffer sb=(StringBuffer)o; // Rule1-Yes, Rule2-Yes, Rule3-Failed
		*/
		
		//Ex:4
		
		/*
		Object o=new String("Welcome");
		StringBuffer sb=(String)o;// Rule1-Yes, Rule2-Failed
		*/
		
		//Ex:5
		
		/*
		String s=new String("Welcome");
		StringBuffer sb=(String)s;// Rule1-Yes, Rule2-Failed
		*/
		
		//Ex:6
		
		/*
		Object o=new String("Welcome");
		StringBuffer sb=(StringBuffer)o;// Rule1-Yes, Rule2-Yes, Rule3-Failed
		*/
		
		//Ex:7
		
		Object o=new String("Welcome");
		String s=(String)o; // Rule1-Yes, Rule2-Yes, Rule3-Yes
		
		System.out.println(s);//Welcome
	}

}
