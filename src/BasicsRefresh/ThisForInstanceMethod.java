package BasicsRefresh;

public class ThisForInstanceMethod {

	
	public void add(int a, int b) {
		int result = a+b;
		this.display(result);
	}
	
	public void display(int result) {
		System.out.println("Expected Result " +result);
	}
	
	public static void main(String[] args) {
		ThisForInstanceMethod tt2 = new ThisForInstanceMethod();
		
		tt2.add(5,3);
		
		
	}

}
