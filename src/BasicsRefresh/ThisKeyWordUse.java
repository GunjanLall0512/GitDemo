package BasicsRefresh;
/* THIS Keyword is used to refer to the current 
 * instance of the class (Accessing instance variable,invoking instance method
 * invoking the current class constructor)
 * 
 * */ 
public class ThisKeyWordUse {
		int i=5;
		
		public void getData() {
			int i= 10;
			System.out.println(i);
			System.out.println(this.i);
			System.out.println(i+this.i);
		}
		
		
	public static void main(String[] args) {
		ThisKeyWordUse tt1 = new ThisKeyWordUse();
		tt1.getData();

	}

}
