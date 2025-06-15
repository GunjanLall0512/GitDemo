package BasicsRefresh;

public class StaticVar {
	String name;
	String address;
	
	static String City; 
	static int i;
	
	static{
		City="Bangalore";
		i = 0;
	}
	
	
	StaticVar(String name,String address) {
		this.name = name;
		this.address = address;
		
	}
	
	public void getAddress() {
		System.out.println(address +" " + City);
		System.out.println(i);
		i++;
	}
	

	
	
	public static void main(String[] args) {
		StaticVar obj = new StaticVar("Ram", "Marathalli");
		StaticVar obj1 = new StaticVar("John", "JayaDev");
		StaticVar obj3 = new StaticVar("John1", "JayaDev1");
		obj.getAddress();
		obj1.getAddress();
		obj3.getAddress();
		
		//assigning value to non static"instance variable" 
		obj1.address = "Chandapura";
		obj1.getAddress();
		
		//assigning value to static variable
		StaticVar.i=4;
		System.out.println(i);
	}

}
