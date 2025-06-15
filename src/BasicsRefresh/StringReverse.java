package BasicsRefresh;

public class StringReverse {
	
	
	public static String revStr(String str) {
		
		StringBuffer result=new StringBuffer();
		
		for(int i=str.length()-1; i>=0 ;i--) 
		{
			result.append(str.charAt(i));
			
			
		}
		
		return result.toString();	
	}
	
	
	
	
	
	public static void main(String[] args) {
		String Str1= "ABCD";
		StringBuffer sb1=new StringBuffer(Str1);
		System.out.println(revStr("Gunjan"));
		sb1.reverse();
		System.out.println(sb1);
	}

}
