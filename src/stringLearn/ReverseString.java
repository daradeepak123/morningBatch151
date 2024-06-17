package stringLearn;

public class ReverseString {
	
	
	public String stringReverse(String str)
	{
		
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;         //    h   e+h=eh    l+leh    
			
		}
		
		
		
		return rev;
	}
	
	
	
	
	

	public static void main(String[] args) {

		ReverseString r=new ReverseString();
		String newVal=r.stringReverse("hello");
		System.out.println(newVal);
		
	}

}
