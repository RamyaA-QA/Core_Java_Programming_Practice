package day16_DataAbstraction;


interface Shape
{
	int length=10;// final & static
	int width=20; // final & static
	
	void circle(); // Abstract method
	
	default void square()
	{
		System.out.println("This is a square-default method");
	}
	
	static void rectangle()
	{
		System.out.println("This is rectangle - static method");
	}
	
	
}


public class _1Interfacedemo implements Shape{

	
	@Override
	public void circle() {

		System.out.println("This is circle - Abstract method");
		
	}
	
	void triangle()
	{
		System.out.println("This is triangle");
	}
	
	int x=100,y=200;
	
	public static void main(String[] args) {
		
		// Scenario:1
		
		_1Interfacedemo idobj=new _1Interfacedemo();
		idobj.circle();//abstract
		idobj.square();//default
		Shape.rectangle(); // Static method can directly access from Interface 
		
		idobj.triangle();
		
		System.out.println(idobj.x+idobj.y);
		
		// Scenario:2
		
		Shape shape=new _1Interfacedemo();
		shape.circle();//abstract
		shape.square();//default
		Shape.rectangle(); // Static method can directly access from Interface
		
		//shape.triangle(); - We cannot access
		
		System.out.println(Shape.length * Shape.width);//Acceessing static variables directly
		
		//System.out.println(shape.x+shape.y); -- We can not access

	}

}
