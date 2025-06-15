package BasicsRefresh;

import java.util.Arrays;
import java.util.Collections;

public class StrArrSort_desc {

	public static void main(String[] args) {
		String[] arr = {"java","python", "C++","C"};
		
		//Reverse Sorting using Collections.reverseOrder 
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		
		
		System.out.println("Reverse order Z to A:" + Arrays.toString(arr));
		
		
	}

}
