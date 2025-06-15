package BasicsRefresh;


import java.util.Arrays;

public class StrArr_Sorting {

	public static void main(String[] args) {
		String arr[] = {"java","python", "C++","C"};
		System.out.println("Arr before sorting"+ Arrays.toString(arr));
		Arrays.sort(arr);
		
		System.out.println("Arr after sorting"+ Arrays.toString(arr));

	}

}
