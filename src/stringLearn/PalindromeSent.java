package stringLearn;

public class PalindromeSent {

	public static void main(String[] args) {

		
		String sent="mom and dad are going to bring racecar";
		
		String wor[]=sent.split(" ");
		
		System.out.println(wor);
		
		
		int nPal=0;
		int pal=0;
		for(int i=0;i<wor.length;i++)
		{
			
			String ss=wor[i];
			
			String rev="";
			
			for(int j=0;j<ss.length();j++)
			{
				rev=ss.charAt(j)+rev;
			}
			
			if(ss.equals(rev))
			{
				System.out.println(ss+ " is a palindrome word");
				pal++;
			}
			
			
			else
			{
				System.out.println(ss+ " is not a palindrome word");
				nPal++;
			}
			
			
		}
		
		
		System.out.println(pal+"    "+nPal);
		
		
	}

}
