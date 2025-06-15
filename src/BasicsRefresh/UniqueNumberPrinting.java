package BasicsRefresh;

import java.util.ArrayList;

public class UniqueNumberPrinting {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,4,5,5,5,3,3,9};
		
		ArrayList<Integer> arrli = new ArrayList<Integer>();
		
		for(int i =0; i<arr.length ; i++) {
			int k=0;
			if(!(arrli.contains(arr[i]))) {
				arrli.add(arr[i]);
				k++;
			
			for (int j =i+1; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					k++;	
				}
			}
//			System.out.print(arr[i]);
//			System.out.print("\t");
//			System.out.print(k);
//			System.out.println();
			
			if(!(k==1))
		{
			System.out.print("Unique Number: " + arr[i]);
			System.out.print("\t");
		}
			
			}
			
		}
		System.out.println(arrli);
		
		
	}

}


//if(k==1)
//	System.out.print("Unique Number: " + arr[i]);
//	System.out.print("\t");