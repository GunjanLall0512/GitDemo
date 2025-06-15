package BasicsRefresh;
/* i/p: New york
 * o/p: york New    
 * */
public class ReverseWordInString {

	public static void main(String[] args) {
		
		String inputStr = "New york"; 
		String words[] = inputStr.split(" ");
		String reverseWords = "";
		
		for(int i=words.length-1;i>=0;i--) {
			reverseWords = reverseWords+ words[i]+ " ";
			
		}
		System.out.println(inputStr);
		System.out.println(reverseWords);
		System.out.println("---------------------");
	}

}
