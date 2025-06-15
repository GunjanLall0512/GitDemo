package BasicsRefresh;

public class ExcHandlingTryCatch {

	public static void main(String[] args) {
		int b=7;
		int c=0;
		
		
		try {
			int k =b/c;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception Handled");
			
		} 
		
	}

}
