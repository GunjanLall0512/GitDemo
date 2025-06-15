package BasicsRefresh;

public class Factorial {
	static int fact = 1; 
	static int num = 5;
	public static void main(String[] args) {
	
		for(int i=1; i<=num; i++) {
			fact= fact*i; 
		}
		
		System.out.println("Factorial of "+ num + " is "+ fact  );
	}

}
