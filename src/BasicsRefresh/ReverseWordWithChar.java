package BasicsRefresh;
/* i/p: New york
 * o/p: kroy weN    
 * */
public class ReverseWordWithChar {

	public static void main(String[] args) {
		String inputStr = "New york"; 
		String words[] = inputStr.split(" ");
		
		String reverseString = ""; 
		
		for(int i= words.length-1; i>=0; i--) {
			String word = words[i];
			String reverseWord = "";
			
			for(int j= word.length()-1; j>=0;j--) {
				reverseWord= reverseWord+word.charAt(j);
			}
			reverseString= reverseString+ reverseWord+" ";
		}
		System.out.println(inputStr);
		System.out.println(reverseString);
		
	}
	
}
