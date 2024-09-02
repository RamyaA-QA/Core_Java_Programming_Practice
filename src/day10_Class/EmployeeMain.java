package day10_Class;

/*
 * Class: is a collection of attributes/variables and behavior/methods
 * Object: is an instance of a class (plan/blue print)
 * 			Object will be created by using class.
 * 			Object is a physical entity.
 * 			Occupy space in memory
 * 			We can create multiple objects for single class
 */

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="Aadhvi";
		emp1.job="Kid";
		emp1.sal=100000;
		
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Ramya";
		emp2.job="Quality Analyst";
		emp2.sal=100000;
		
		emp2.display();

	}

}
