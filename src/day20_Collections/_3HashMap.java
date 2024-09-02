package day20_Collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class _3HashMap {

	public static void main(String[] args) {

		// Declaration
		
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		// Adding pairs
		
		hm.put(101, "Ramya");
		hm.put(102, "Aadhvi");
		hm.put(103, "Hari");
		hm.put(104, "Amma");
		hm.put(105,"Nana");
		
		System.out.println(hm);//{101=Ramya, 102=Aadhvi, 103=Hari, 104=Amma, 105=Nana}
		
		System.out.println("Size of HashMap:" +hm.size());//Size of HashMap:5
		
		// Remove pair
		
		hm.remove(103);// 103 is key of the pair
		System.out.println("After removing pair:" +hm); //After removing pair:{101=Ramya, 102=Aadhvi, 104=Amma, 105=Nana}
		
		// Access value from key
		System.out.println(hm.get(102)); //Aadhvi
		
		// Get all the keys from hashmap
		System.out.println(hm.keySet()); //[101, 102, 104, 105]
		
		// Get all the values from hashmap
		System.out.println(hm.values()); //[Ramya, Aadhvi, Amma, Nana]
		
		// Get all the key-value pairs
		System.out.println(hm.entrySet());//[101=Ramya, 102=Aadhvi, 104=Amma, 105=Nana]
		
		// Reading data from HashMap
		
		// Using for..each
		
		/*
		
		for (int k:hm.keySet())
		{
			System.out.println(k+"     "+hm.get(k));
		}
		*/
		
		// Using Iterator
		/*
		Iterator it=hm.entrySet().iterator();
		
		while (it.hasNext()) {
			Entry entry = it.next();
	        System.out.println(entry.getKey() + " = " + entry.getValue());
			
		}
		*/
		
		hm.clear();
		System.out.println(hm.isEmpty());//true
		
	}

}
