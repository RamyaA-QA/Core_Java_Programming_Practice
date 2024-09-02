package day11_Constructor;

public class Student {
	
	int sid;
	String sname;
	char grad;
	
	void printStudentData()
	{
		System.out.println(sid+"  "+sname+"  "+grad);
	}
	
	void setStudentData(int id,String name,char grade)
	{
		sid=id;
		sname=name;
		grad=grade;
	}
	
	Student(int id,String name,char grade)
	{
		sid=id;
		sname=name;
		grad=grade;
	}

}
