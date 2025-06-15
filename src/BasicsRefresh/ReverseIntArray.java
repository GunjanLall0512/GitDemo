package BasicsRefresh;

import java.util.Arrays;

public class ReverseIntArray {

	public static void revArray(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
			
		}
	}
	
	
	public static void main(String[] args) {
		int inputarr[]= {1,2,3,4,5};
		revArray(inputarr);
		System.out.println(Arrays.toString(inputarr));
		

	}

}
