package stringLearn;

public class DuplicatingChar {

	public static void main(String[] args) {

		String str="hello";
		
		
		for(int i=0;i<str.length();i++)
		{
		
		char ch=str.charAt(i);
		
		int fIndex=str.indexOf(ch);
		int lIndex=str.lastIndexOf(ch);
		
		if(fIndex==lIndex)
		{
			System.out.println(ch+" is not duplicating");
		}
		else
		{
			System.out.println(ch+" is duplicating");
		}
		}
		
		
		
	}

}
