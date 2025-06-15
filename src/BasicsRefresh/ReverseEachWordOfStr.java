package BasicsRefresh;
/*Write a method which accepts a string and reverse each char
 * of the word,
 * I/P - Reverse me 
 * O/P - esreveR em
 * 
 * Approach - Take the string, split the string into each word
 * and store in the String array. Run a loop for iterate each word
 * and then another loop for reverse each word and store it back in a 
 * string appending the ReverseWords */
public class ReverseEachWordOfStr {
	
	public static void revEachWordOfStr(String inputStr) {
		String words[]= inputStr.split(" ");
		String reverseString ="";
		
		for(int i = 0; i<words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			
			for(int j=word.length()-1; j>=0; j--) {
				reverseWord = reverseWord+ word.charAt(j);
			}
			reverseString = reverseString+reverseWord+ " ";
			
		}
		
		System.out.println(inputStr);
		System.out.println(reverseString);
		System.out.println("-----------------------");
	}
	
	
	public static void main(String[] args) {
		
		revEachWordOfStr("input Str");
		revEachWordOfStr("New york");
		
	}
S
}
