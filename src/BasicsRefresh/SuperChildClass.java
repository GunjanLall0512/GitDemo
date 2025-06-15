package BasicsRefresh;

public class SuperChildClass extends SuperParentClass {
	
	String name = "QA";
	
	//to use super with variable
	public void callingparentVariable() {
		System.out.print(name);
		System.out.println();
		System.out.println(super.name);
	}
	
	//to use the super for the mtd
	public void getData() {
		super.getData();
		System.out.println("mtd in the child class");
	}
		
	//to use super for the constructor
	public SuperChildClass(){
		super();
		System.out.println("constructor in Child class");
	}

	public static void main(String[] args) {
		
		
		SuperChildClass scc1 = new SuperChildClass();
		scc1.callingparentVariable();
		
		scc1.getData();
		
		
				
}
}
	
