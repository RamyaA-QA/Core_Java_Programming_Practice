package day13_This_Static;

public class _3Static {
	
	static int a=10; // static variable
	int b=20; // Instance variable
	
	static void m1()// static method
	{
		System.out.println("This is a static m1 method");
	}
	
	void m2()// Non static method
	{
		System.out.println("This is a non static m2 method");
	}
	
	void m() // Non static method
	{
		System.out.println(a); //10
		System.out.println(b); //20
		m1();//This is a static m1 method
		m2();//This is a non static m2 method
	}

	public static void main(String[] args) {
		
		//1. static methods can access static stuff directly (With out object)

		//System.out.println(a); //10
		//m1();//This is a static m1 method
		
		//System.out.println(b); //Can not access, b is non-static
		//m2();// Can not access, m2() is non static
		
		// 2. static methods can access non-static stuff through object
		
		//_3Static s=new _3Static();
		//System.out.println(s.b);//20
		//s.m2(); //This is a non static m2 method
		
		_3Static s=new _3Static();
		s.m();
		
		


	}

}
