package day14_Inheritance;

class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}

class Child2 extends Parent
{
	void print(int c)
	{
		System.out.println(c);
	}
}


public class _2HierarchyInheritance {

	public static void main(String[] args) {

		Child1 c1=new Child1();
		
		c1.display(100); //100
		c1.show(200); //200
		
		Child2 c2=new Child2();
		
		c2.display(1000); //1000
		c2.print(2000); //2000

	}

}
