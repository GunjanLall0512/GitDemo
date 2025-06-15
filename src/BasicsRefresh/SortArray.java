package BasicsRefresh;

public class SortArray {

	public static void main(String[] args) {
/*1.need 2 loops one for the first iteration 
* and 2nd to compare it with the rest of the elements in the array
*2.swap the value if the element is less that the compared element  */
		
		int arr[] = {1,5,8,4,2,3};
		int temp;
		for (int i =0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if (arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
				}
			}
		
		}
	   for (int i =0; i<arr.length;i++) {
	   System.out.print(arr[i]);
	   System.out.print("\t");
	   }
	}

}
