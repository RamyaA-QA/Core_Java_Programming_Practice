package day11_Constructor;

public class Greetings {
	
	// No Params   No Return value
	
	void m1()
	{
		System.out.println("Hello....");
	}
	
	// No Params   Return value
	
	String m2()
	{
		return("Hello How are you?");
	}
	
	// Takes Params    No return value
	
	void m3(String name)
	{
		System.out.println("Hello: "+name);
	}
	
	// Takes params    Return value
	
	String m4(String name)
	{
		return("Hello "+name);
	}

}
