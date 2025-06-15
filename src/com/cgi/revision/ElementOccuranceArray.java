package com.cgi.revision;

import java.util.ArrayList;

public class ElementOccuranceArray {

	public static void main(String[] args) {
		int a[]= {1,1,2,2,2,3,3,3,3,4};
		
		ArrayList<Integer> arrlist1 = new ArrayList<Integer>();
		
		for (int i=0; i<a.length;i++) {
			int k=0;
			if(!(arrlist1.contains(a[i]))) {
				arrlist1.add(a[i]);
				k++;
			
			for (int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					k++;
				}
				
			}
			System.out.print(a[i]);
			System.out.print("\t");
			System.out.println(k);
			
			}
			
			
		}
		
	}

}
