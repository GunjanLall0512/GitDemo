package BasicsRefresh;

public class MaxCol {
	/*2 4 5
	 *3 4 7 
	 *1 2 9*/
	public static void main(String[] args) {
		
		int mat[][] = {{2,4,5},{3,4,7},{1,2,9}};
		int min = mat[0][0];
		int minCol = 0;
		for(int i=0;i< 3;i++)
		{
			for(int j=0;j<3;j++) {
				if(mat[i][j]<min) {
					min=mat[i][j];
					minCol = j;
				}
			}
		}
		int k=0;
		int max = mat[0][minCol];
		while (k<3) {
			if(mat[k][minCol] > max) {
				max= mat[k][minCol];	
			}
			k++;
			
				}
		System.out.println("max in min col:" +max);

	}

}
