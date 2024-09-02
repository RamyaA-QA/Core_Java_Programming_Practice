package day20_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class _2HashSet {

	public static void main(String[] args) {

				// Declaration
		
				HashSet myset=new HashSet();
				//Set myset1=new HashSet();
				//HashSet <String> myset=new HashSet<String>();
				
				// Adding elements into HashSet
				
				myset.add(100);
				myset.add(10.5);
				myset.add("Welcome");
				myset.add('A');
				myset.add(true);
				myset.add(100);
				myset.add(null);
				myset.add(null);
				
				// Size of HashSet
				System.out.println("Size of an HashSet:" +myset.size()); //Size of an HashSet:8
				
				//Printing HashSet
				System.out.println("Printing data from HashSet:" +myset);//Printing data from HashSet:[100, 10.5, Welcome, A, true, 100, null, null]
				
				// Remove element from HashSet
				myset.remove(5);// Here, 5 is index of an element
				System.out.println("After removing:"+myset);//After removing:[100, 10.5, Welcome, A, true, null, null]
				
				// Insert element in the HashSet -- Not Possible
				// Access specific element - Not Possible
				/*
				myset.add(2,"Java");
				System.out.println("After insertion:" +myset);//After insertion:[100, 10.5, Java, Welcome, A, true, null, null]
				// Access specific element from HashSet
				System.out.println(myset.get(3));// Here, 3 is index     -Welcome
				
				//Modify element in the HashSet (Modify/Replace/Change)
				myset.set(2, "Python");
				System.out.println("After replacing:"+myset);//After replacing:[100, 10.5, Python, Welcome, A, true, null, null]
				*/
				
				// Convert HashSet --> ArrayList
				
				ArrayList al=new ArrayList(myset);
				System.out.println(al);
				System.out.println(al.get(2));
				
				
				//Reading all the elements from HashSet
				
				// Using normal for loop
				
				/*
				for(int i=0;i<myset.size();i++)
				{
					System.out.println(myset.get(i));
				}
				*/
				
				// Using for..each loop
				
				/*
				for(Object x:myset)
				{
					System.out.println(x);
				}
				*/
				
				// Using iterator
				
				//Iterator<Integer> it=mylist.iterator();
				
				Iterator<Object> it=myset.iterator();
				
				while (it.hasNext()) {
					System.out.println(it.next());
					
				}
				
				// Checking HashSet is empty or not
				
				System.out.println("Is HashSet empty:" +myset.isEmpty()); // Is HashSet empty:false
				
				// Remove all the elements from HashSet
				
				HashSet myset2=new HashSet();
				myset2.add("a");
				myset2.add("b");
				myset2.add("c");
				
				myset2.removeAll(myset2);
				System.out.println("After removing multiple elements:" +myset2); //After removing multiple elements:[]
				
				// Remove all the elements/clear
				
				myset2.clear();
				System.out.println("Is HashSet empty?" +myset2.isEmpty());//Is HashSet empty?true

	}

}
