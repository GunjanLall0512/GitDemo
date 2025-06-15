package BasicsRefresh;

public class SwapwithoutTemp {
	static int a = 4;
	static int b = 5;
	public static void main(String[] args) {
		System.out.println("a Before the swap:" +a);
		System.out.println("b Before the swap:" +b);
		a = a+b; //9
		b=a-b; //4
		a=a-b;//5
		
		System.out.println("a after the swap:" +a);
		System.out.println("b after the swap:" +b);
	}

}
