package day5_Control_Statements;

public class _7ContinueStatement {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++)
		{
			if(i==2||i==5||i==7)//if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
