package day7_Arrays_Examples;

public class _1SearchingElementInArray {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50};
		int search_element=10;
		
		boolean status=false;
		
		//for loop
		
		/*
		 * for(int i=0;i<a.length;i++) { //System.out.println(a[i]);
		 * 
		 * if(a[i]==search_element) { System.out.println("Element found"); status=true;
		 * break; }
		 * 
		 * }
		 */
		
		//for each loop
		
		for(int x:a)
		{
			if(x==search_element) 
				{ 
					System.out.println("Element found"); 
					status=true;
					break; 
				}
		}
		
		if(status==false)
		{
		System.out.println("Element not found");
		}

	}

}
