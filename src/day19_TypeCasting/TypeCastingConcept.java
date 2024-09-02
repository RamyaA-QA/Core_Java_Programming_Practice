package day19_TypeCasting;

// Upcasting - Converting value from smaller to larger

// int -> long
// float -> double

// Downcasting - Converting value from larger to smaller  

// long -> int
//double -> float

public class TypeCastingConcept {

	public static void main(String[] args) {

		// Upcasting - Converting value from smaller to larger
		
		int intValue=100;
		long longValue=intValue;
		System.out.println(longValue);//100
		
		float floatValue=10.5F;
		double doubleValue=floatValue;
		System.out.println(doubleValue);//10.5
		
		// Downcasting - Converting value from larger to smaller (Manually)
		
		long longValue1=10000;
		int intValue1=(int)longValue1;
		System.out.println(intValue1);//10000
		
		double doubleValue1=125.55;
		float floatValue1=(float)doubleValue1;
		System.out.println(floatValue1);//125.55
		
		// Example:1
		
		int i=100;
		double d=i; // Upcasting
		System.out.println(d);//100.0
		
		// Example:2
		
		double d1=10.5;
		int i1=(int)d1; // Downcasting
		System.out.println(i1);//10
		
		
		

	}

}
