package day13_This_Static;

public class _4StaticMain {

	public static void main(String[] args) {
		//1. static methods can access static stuff directly (With out object)

		System.out.println(_3Static.a); //10
		_3Static.m1();//This is a static m1 method
				
				//System.out.println(b); //Can not access, b is non-static
				//m2();// Can not access, m2() is non static
				
		//2. static methods can access non-static stuff through object
				
			_3Static s=new _3Static();
			System.out.println(s.b);//20
			s.m2(); //This is a non static m2 method
				
		
			s.m();
			/* Out put:
			 * 10
			   20
               This is a static m1 method
               This is a non static m2 method

			 */

	}

}
