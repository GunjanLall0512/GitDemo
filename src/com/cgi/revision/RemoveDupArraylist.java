package com.cgi.revision;

import java.util.ArrayList;

public class RemoveDupArraylist {

	public static void main(String[] args) {
		int arr[] = {1,1,2,2,2,3,3,3,3,4};
		
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		
		for (int i=0; i<arr.length ; i++) {
			if (!(arlist.contains(arr[i]))) {
				arlist.add(arr[i]);
			}
		}
		System.out.println("UniqueNum: "+ arlist);
		for (int ref1:arlist) {
			System.out.println(ref1);
		}
	}

}
