package day7_Arrays_Examples;

public class _2FindHowmanyDuplicatesInArray {

	public static void main(String[] args) {

		int a[]= {100,300,200,100,300,500,300};
		int num=300;
		int count=0;
		
		for(int value:a)
		{
			//System.out.println(value);
			if(value==num)
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
