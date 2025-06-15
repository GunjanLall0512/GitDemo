package com.cgi.revision;

import java.util.ArrayList;


public class CommonElementAcrossAL {

	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(2);
		ar1.add(0);
		ar1.add(8);
		ar1.add(7);
		
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(1);
		ar2.add(2);
		ar2.add(6);
		ar2.add(8);
		ar2.add(7);
		
		
		ar1.retainAll(ar2);
		
		for(int num: ar1) {
		System.out.println(num);
		}
	}

}
