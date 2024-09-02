package day14_Inheritance;

class A 
{

	int a=100;
	
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b=200;
	
	void show()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int c=300;
	
	void print()
	{
		System.out.println(c);
	}
}

public class _1InheritanceTypes 
{
	public static void main(String[] args) {
		
		/*
		 * B bobj=new B();
		 * 
		 * System.out.println(bobj.a);//100 System.out.println(bobj.b);//200
		 * 
		 * bobj.display();//100 bobj.show();//200
		 */	
		
		C cobj=new C();
		
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		
		cobj.display();//10
		cobj.show();//20
		cobj.print();//30
	}
}

	
	
	