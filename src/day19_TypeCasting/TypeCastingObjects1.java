package day19_TypeCasting;

class Parent
{
	String name="Aadhvi";
	
	void m1()
	{
		System.out.println("This is m1() from Parent");
	}
}

class Child extends Parent
{
	int id=101;
	
	void m2()
	{
		System.out.println("This is m2() from Child");
	}
}

public class TypeCastingObjects1 {

	public static void main(String[] args) {
		
		/*

		Child c=new Child();
		
		System.out.println(c.name);// Parent  -- Aadhvi
		c.m1();// Parent  --  This is m1() from Parent
		
		System.out.println(c.id);// Child  --  101
		c.m2();// Child  --   This is m2() from Child
		
		*/
		
		/*
		Parent p=new Parent();// Upcasting
		
		System.out.println(p.name);// Parent
		p.m1();// Parent
		
		System.out.println(p.id);// We can not access
		p.m2();// We can not access
		*/
		
		//Downcasting
		
		Parent p=new Parent();
		Child c=(Child)p;
		
		//java.lang.ClassCastException
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();

	}

}
