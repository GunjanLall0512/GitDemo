package BasicsRefresh;
/*
 * *********
 	*******
 	 *****
      ***
       *
 */
public class Pattern_7 {
	public static void main(String[] args) {
		int num =5;
		//row
		for (int i =1; i<=num; i++)
		{
			//spaces
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			//star 
			for (int j =1; j<= 2*(num-i)+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
