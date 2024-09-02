package day20_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _1ArrayList {

	public static void main(String[] args) {

		// Declaration
		
		ArrayList mylist=new ArrayList();
		//List mylist1=new ArrayList();
		//ArrayList <String> mylist=new ArrayList<String>();
		
		// Adding data into arraylist
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		// Size of arraylist
		System.out.println("Size of an ArrayList:" +mylist.size()); //Size of an ArrayList:8
		
		//Printing arraylist
		System.out.println("Printing data from Arraylist:" +mylist);//Printing data from Arraylist:[100, 10.5, Welcome, A, true, 100, null, null]
		
		// Remove element from arraylist
		mylist.remove(5);// Here, 5 is index of an element
		System.out.println("After removing:"+mylist);//After removing:[100, 10.5, Welcome, A, true, null, null]
		
		// Insert element in the Arraylist
		mylist.add(2,"Java");
		System.out.println("After insertion:" +mylist);//After insertion:[100, 10.5, Java, Welcome, A, true, null, null]
		
		//Modify element in the arraylist (Modify/Replace/Change)
		mylist.set(2, "Python");
		System.out.println("After replacing:"+mylist);//After replacing:[100, 10.5, Python, Welcome, A, true, null, null]
		
		// Access specific element from arraylist
		System.out.println(mylist.get(3));// Here, 3 is index     -Welcome
		
		//Reading all the elements from arraylist
		
		// Using normal for loop
		
		/*
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		*/
		
		// Using for..each loop
		
		/*
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		*/
		
		// Using iterator
		
		//Iterator<Integer> it=mylist.iterator();
		
		Iterator<Object> it=mylist.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		// Checking arraylist is empty or not
		
		System.out.println("Is arraylist empty:" +mylist.isEmpty()); // Is arraylist empty:false
		
		// Remove all the elements from arraylist
		
		ArrayList mylist2=new ArrayList();
		mylist2.add("a");
		mylist2.add("b");
		mylist2.add("c");
		
		mylist2.removeAll(mylist2);
		System.out.println("After removing multiple elements:" +mylist2); //After removing multiple elements:[]
		
		// Remove all the elements/clear
		
		mylist.clear();
		System.out.println("Is arraylist empty?" +mylist.isEmpty());//Is arraylist empty?true

	}

}
