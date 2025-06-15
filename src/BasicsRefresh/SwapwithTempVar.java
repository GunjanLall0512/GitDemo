package BasicsRefresh;

public class SwapwithTempVar {

	public static void main(String[] args) {
		int a = 10; 
		int b = 20;
		int temp;
		
		System.out.println("a Before the swap:" +a);
		System.out.println("b Before the swap:" +b);
		
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("a after the swap:" +a);
		System.out.println("b after the swap:" +b);

	}

}
