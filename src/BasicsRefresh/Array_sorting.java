package BasicsRefresh;

public class Array_sorting {

	public static void main(String[] args) throws Exception{
		int arr[] = {4,2,7,5,9,6};
		int temp = 0;
		
		for(int i =0; i<arr.length; i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print("\t");
		}
		System.out.println("");
		System.out.println("2nd smallest element- "+ arr[1]);
		System.out.println("smallest element- "+ arr[0]);
	}
	
	

}
