package day11_Constructor;

public class GreetingsMain {

	public static void main(String[] args) {

		Greetings gr=new Greetings();
		gr.m1();
		
		String s=gr.m2();
		System.out.println(s);
		
		gr.m3("Aadhvi");
		
		String var=gr.m4("Ramya");
		System.out.println(var);

	}

}
