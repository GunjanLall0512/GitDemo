package BasicsRefresh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) throws Exception{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0,"USA");
		hm.put(1,"UK");
		hm.put(2,"China");
		hm.put(3,"Japan");
		hm.put(4,"India");
		hm.put(5,"Europe");
		
		System.out.println(hm.get(1));
		
		System.out.println("------------------------------");
		
		System.out.println(hm);
		
		System.out.println("------------------------------");
		
		hm.remove(2);
		System.out.println(hm);
		
		System.out.println("------------------------------");
		
		System.out.println(hm.get(2));
		
		
		System.out.println("------------------------------");
		
		//convert the HASHMAP To the HASHSET using EntrySet
		Set sn = hm.entrySet();
		//create iterator object
		Iterator i = sn.iterator();
		
		
		while(i.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		
		
		


		}
		
	}
}
