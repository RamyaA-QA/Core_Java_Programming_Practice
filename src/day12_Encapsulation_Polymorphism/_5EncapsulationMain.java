package day12_Encapsulation_Polymorphism;

public class _5EncapsulationMain {

	public static void main(String[] args) {

		_4Encapsulation account=new _4Encapsulation();
		
		account.setAccno(101);
		account.setName("Ramya");
		account.setAmount(10000);
		
		System.out.println(account.getAccno());//101
		System.out.println(account.getName());//Ramya
		System.out.println(account.getAmount());//10000.0

	}

}
