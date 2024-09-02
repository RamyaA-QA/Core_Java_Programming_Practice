package day13_This_Static;

public class _2ThiskeywordSet {
		
		int x,y; // calss variables/Instance variables
		
		/*
		void setData(int a,int b)
		{
			x=a;
			y=b;
		}
		*/
		
		void setData(int x,int y)
		{
			x=x;
			y=y;
		}
		
		/*
		void display()
		{			
			System.out.println(x);//100
			System.out.println(y);//200
		}
		*/
		
		void display()
		{			
			System.out.println(x);//0
			System.out.println(y);//0
		}

		public static void main(String[] args) {

			_2ThiskeywordSet tk=new _2ThiskeywordSet();
			tk.setData(100, 200);
			tk.display();

		}

	}
