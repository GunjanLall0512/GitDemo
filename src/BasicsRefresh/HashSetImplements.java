package BasicsRefresh;

import java.util.HashSet;
import java.util.Iterator;
/*No duplicate object can be created, 
 * it follows random sequence
 * No index based object addition, removal,retrieving*/
public class HashSetImplements {

	public static void main(String[] args) throws Exception{
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("India");
		hs.add("  ");
		hs.add("China");
		hs.add("Japan");
		
		
		
		//print the objects in the set
		System.out.println(hs);

		//remove obj
		hs.remove("Japan");
		
		System.out.println(hs);
		
		//length of Hashset
		System.out.println(hs.size());
		
		//if the set is empty
		System.out.println(hs.isEmpty());
		
		//Iterator is used to traverse over each object in the Set
		
		//Iterator with next 
		
		Iterator<String> i = hs.iterator();
		//System.out.println(i.next());
		//System.out.println(i.next());
		
		System.out.println("------------------------");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	}

}
