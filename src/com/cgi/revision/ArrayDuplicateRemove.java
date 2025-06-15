package com.cgi.revision;

import java.util.ArrayList;


public class ArrayDuplicateRemove {
	ArrayList<Integer> arrlist = new ArrayList<Integer>();
	//create a method to remove the array
	
	public void removeDuplicate(int arr[]) {
		
		
		for (int i=0; i<arr.length; i++) {
			if(!(arrlist.contains(arr[i]))) {
				arrlist.add(arr[i]);
			}
		}
	
				
	}
	
	public static void main(String[] args) {
		ArrayDuplicateRemove a1 = new ArrayDuplicateRemove();
		int arr[]= {1,1,2,3,4,4,4};
		a1.removeDuplicate(arr);
		

	}

}


//{1,1,2,3,4,4,4}