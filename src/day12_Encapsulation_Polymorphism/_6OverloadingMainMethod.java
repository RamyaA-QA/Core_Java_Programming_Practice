package day12_Encapsulation_Polymorphism;

public class _6OverloadingMainMethod {
	
	void main(int x)
	{
		System.out.println(x);
	}
	
	void main(String s)
	{
		System.out.println(s);
	}
	
	void main(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
	
	public static void main(String[] args) {
		_6OverloadingMainMethod ov=new _6OverloadingMainMethod();
		ov.main(10);
		ov.main("Aadhvi");
		ov.main("Aadhvi"," Ramya");
		
		/*
		 10
		 Aadhvi
         Aadhvi Ramya

		 */
	
	}

}
