package day15_MethodOverriding_Final_Super;

class Bank
{
	double roi()
	{
		return 0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 11.5;
	}
}

public class _1MethodOverriding {

	public static void main(String[] args) {

		ICICI icici=new ICICI();
		System.out.println(icici.roi());//10.5
		
		SBI sbi=new SBI();
		System.out.println(sbi.roi());//11.5

	}

}
