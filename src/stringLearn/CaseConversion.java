package stringLearn;

public class CaseConversion {

	public static void main(String[] args) {

		String str="mom and Dad are going to meet Madam";

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				System.out.print(Character.toLowerCase(str.charAt(i)));
			}
			else
			{
				System.out.print(Character.toUpperCase(str.charAt(i)));
			}
		}
		
		
		
		
	}

}
