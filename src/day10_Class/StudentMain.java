package day10_Class;

public class StudentMain {

	public static void main(String[] args) {

		Student student=new Student();
		
		student.sid=101;
		//student.sname="Ramya";
		student.grade='A';
		
		student.printData();
		
		Student student1=new Student();
		student1.sid=102;
		//student.sname="Ramya";
		student1.grade='A';
		
		student1.printData();

	}

}
