package day21_Java8_LambdaExpressions;

public class _1LambdaExpWithNoParams {
public static void main(String[] args) {
	
	//Before Java 8 (Anonymous class)
	
	Runnable runnable = new Runnable() {
	    @Override
	    public void run() {
	        System.out.println("Hello from Runnable (before Java 8)!");
	    }
	};
	new Thread(runnable).start();
	
	//Using Lambda Expression
	
	Runnable runnable1 = () -> System.out.println("Hello from Lambda!");
	new Thread(runnable1).start();
}
}
