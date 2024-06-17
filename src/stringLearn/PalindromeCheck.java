package stringLearn;

public class PalindromeCheck {

	public static void main(String[] args) {

		
		String str="hello";
		ReverseString r=new ReverseString();
		String rev=r.stringReverse(str);
		
		if(str.equals(rev))
		{
			System.out.println(str+ " is a palindrome");
		}
		else
		{
			System.out.println(str+ " is not a palindrome");
		}
		
		
	}

}
