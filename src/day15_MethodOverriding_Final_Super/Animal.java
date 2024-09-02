package day15_MethodOverriding_Final_Super;

public class Animal {

		String color="white";
		
		void eat()
		{
			System.out.println("Eating ........");
		}
}

class Dog extends Animal
{
	String color="black";
	
	void displayColor()
	{
		System.out.println(super.color);
	}
	
	void eat()
	{
		System.out.println("Eating bread...");
		super.eat();
	}
}
