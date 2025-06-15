package BasicsRefresh;

public class MatrixMax {

	public static void main(String[] args) {
		int b[][] = {{2,4,5},{3,4,7},{1,2,9}};
		
		int max = b[0][0];
	
		
		for (int i =0;i<3;i++) {
			for (int j=0; j<3; j++) {
				System.out.println(b[i][j]);
				if(b[i][j]>max) {
					max=b[i][j];
				}
			}
			
		}
		System.out.println("min value:" +max);
	}

	}


