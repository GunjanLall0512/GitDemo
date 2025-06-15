package com.cgi.revision;

public class StringReverse {
	//create a method to reverse the string with parameter string
	public static String revString(String str){
		
		//create a variable to store the reverse
		StringBuffer result = new StringBuffer();
		for(int i=str.length()-1; i>=0; i--) {
			result.append(str.charAt(i));	
		}
		return result.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println(revString("Munesh"));

	}

}
