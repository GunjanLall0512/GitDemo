package com.cgi.revision;

public class SecongLargestUsingSorting {

	public static void main(String[] args) {
		int a[] = {1,4,5,3,5,7,8};
		int temp=0;
		for(int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					temp= a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
			
			}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			System.out.print("\t");
		}
	}
	

}
