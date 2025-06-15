package com.cgi.revision;

public class SecondLargestElementArray {

	public static void main(String[] args) {
		int arr[] = {1,3,4,5,3,2,8,9};
		
		int max = arr[0];
		int secmax = 0; 
		
		for (int i =1; i<arr.length; i++) {
			if (arr[i] > max) {
				secmax = max;
				max=arr[i];
				
			}
			
			
		}
		System.out.println("largest: " +max);
		System.out.println("Second largest: " +secmax);
	}

}
