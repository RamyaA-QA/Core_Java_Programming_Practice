package day11_Constructor;

public class StudentMain {

	public static void main(String[] args) {

		//Student student=new Student();
		
		// Using object reference variables
		
		/*
		student.sid=101;
		student.sname="Aadhvi";
		student.grad='A';
		*/
		//student.printStudentData();
		
		//Using method
		/*
		student.setStudentData(102, "Ramya", 'A');
		student.printStudentData();
		*/
		
		// Using construtor
		
		Student student2=new Student(103, "Srihari", 'A');
		student2.printStudentData();
		
	}

}
