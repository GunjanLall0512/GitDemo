package BasicsRefresh;


public class PalindromeCheck {

	public static void main(String[] args) {
		String Str = "madam";
		String reverseStr = "";
		for (int i=Str.length()-1; i>=0; i--) {
			reverseStr = reverseStr + Str.charAt(i);
		}
		System.out.println("Input String: "+ Str);
		System.out.println("Reverse String: " + reverseStr.toString());
		System.out.println("---------------------");
		
		//palindrome Check
		
		if(Str.equalsIgnoreCase(reverseStr)) {
			System.out.println("Entered String is a palindrome");
		}else {
			System.out.println("Entered String isn't a palindrome");
		}
	}

}
