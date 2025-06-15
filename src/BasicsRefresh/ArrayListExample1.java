package BasicsRefresh;

import java.util.ArrayList;

public class ArrayListExample1 {
/*
 * ArrayList can have a duplicate value
 * ArrayList,LinkedList,vector implements linked interface 
 *Arrays have fixed size where as the ArrayList grows dynamically
 *you can access any value at any index 
 */
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		//Add element to the list based on the values and index 
		a.add("Rahul");
		a.add("John");
		a.add(0,"Gunjan");
		a.add(1,"MM");
		
		
		//print the list:
		System.out.println(a);
		
		//remove element based String
		a.remove("John");
		System.out.println(a);
		
		//remove element based on index
		a.remove(1);
		System.out.println(a);
		
		//Get the value based on index
		System.out.println(a.get(1));
		
		//index of string in list
		System.out.println(a.indexOf("Gunjan"));
		
		//if string is present or not
		System.out.println(a.contains("Gunjan"));
		
		//if list is empty
		System.out.println(a.isEmpty());
		
		//check the size of the list 
		System.out.println(a.size());

	}

}
