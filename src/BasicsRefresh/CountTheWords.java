package BasicsRefresh;

public class CountTheWords {

	public static void main(String[] args) {
		String inputStr = "The world is round" ; 
		String words[] = inputStr.split(" ");
		
		
		int count = words.length;
		System.out.println("Length of Words in String " + count);

	}

}
