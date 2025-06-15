package BasicsRefresh;

/*create a variable, method and constructor 
 * in parent class and override the same variable, method and constructor 
 * under the child class but we want to print the values from the Parent
 *  class thats when the super keyword comes handy  
 */


public class SuperParentClass {
	String name = "Gunjan";
	
	public void getData() {
		 System.out.println("mtd in the parent class");
		 
	}
	public SuperParentClass()
	{
		System.out.println("constructor in parent class");
	}
}
