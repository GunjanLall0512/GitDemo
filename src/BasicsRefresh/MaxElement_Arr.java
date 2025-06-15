package BasicsRefresh;

public class MaxElement_Arr {

	public static void main(String[] args) {
		int temp;
		int arr[]= {5,3,8,0,7,9};
		for (int i=0; i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]< arr[j]) {
					//swapping 
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			}for(int i =0; i<arr.length;i++) {
				System.out.print(arr[i]);
				System.out.print("\t");
				
		}

	}

}
