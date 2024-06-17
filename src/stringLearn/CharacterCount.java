package stringLearn;

public class CharacterCount {

	public static void main(String[] args) {

		String str="forum Mall, second Street, Roadno-2, doorno 11-234/2";
		int alpha=0;
		int num=0;
		int splchar=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				alpha++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				num++;
			}
			else
			{
				splchar++;
			}
		}
		
		System.out.println(alpha +"  "+num+"  "+splchar);
		
		
	}

}
