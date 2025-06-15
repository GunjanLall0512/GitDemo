package BasicsRefresh;
/*
 *  
 *  *
   ***
  *****
 *******
*********
 */

public class Pattern_6 {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			//i=1,2,3,4,5 - row
			for(int j=i;j<5;j++){
				//j=4,3,2,1  -space
				System.out.print(" ");
			}
			//stars
			for (int j =1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");	
		}
			
			

	}

}
