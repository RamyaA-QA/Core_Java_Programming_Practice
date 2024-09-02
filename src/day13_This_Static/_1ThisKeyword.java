package day13_This_Static;

public class _1ThisKeyword {
	
	int x,y; // calss variables/Instance variables
	
	/*
	
	_1ThisKeyword(int a, int b)
	{
		x=a;
		y=b;
	}
	void display()
	{
		System.out.println(x);//100
		System.out.println(y);//200
	}
	*/
	
	_1ThisKeyword(int x,int y)
	{
		/*
		x=x;
		y=y;
		*/
		
		this.x=x;
		this.y=y;
	}
	void display()
	{
		/*
		System.out.println(x);//0
		System.out.println(y);//0
		*/
		
		System.out.println(x);//100
		System.out.println(y);//200
	}

	public static void main(String[] args) {

		_1ThisKeyword tk=new _1ThisKeyword(100,200);
		tk.display();

	}

}
