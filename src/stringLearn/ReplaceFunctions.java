package stringLearn;

public class ReplaceFunctions {

	public static void main(String[] args) {

		String s="hello";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='l')
			{
				System.out.print('p');
			}
			else
			{
				System.out.print(s.charAt(i));
			}
			
		}
		
		
		
		
	}

}
