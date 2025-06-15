package BasicsRefresh;

import java.util.HashMap;

public class OccurancesCountStringElement {

	public static void main(String[] args) {
	
		String inputStr = "aabbbcccs";
		HashMap<Character,Integer> elementcount  = new HashMap<Character, Integer> ();
		
		for(int i=0;i<inputStr.length()-1; i++) {
			if(elementcount.containsKey(inputStr.charAt(i))) {
				int count = elementcount.get(inputStr.charAt(i));
				elementcount.put(inputStr.charAt(i), ++count ); 
				
				
			}else {
				elementcount.put(inputStr.charAt(i),1);
			}
			
		}
		System.out.println(elementcount);
	
		
	}

}
