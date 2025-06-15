package com.cgi.revision;

import java.util.HashSet;

public class HashSetDupRemove {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,2,4,5,5,5};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		 for (int uniquenumber:arr) {
			 hs.add(uniquenumber);
			 
		 }
		 System.out.println(hs);
	}

}
