package stringLearn;

public class StringFunctions {

	public static void main(String[] args) {

		String str="hello         ";
		String str1=" helloWelcome";
		System.out.println(str);
		
		char ch=str.charAt(3);
		System.out.println(ch);
		
		System.out.println(str.codePointAt(3));
		System.out.println(str.codePointBefore(3));
		System.out.println(str1.compareTo(str));
		System.out.println(str.concat(str1));
		System.out.println(str1.contains(str));
		System.out.println(str.contentEquals(str1));
		System.out.println(str.endsWith("he"));
		System.out.println(str.equals("hello"));
		System.out.println(str.equalsIgnoreCase("Hello"));
		System.out.println(str.indent(1));
		System.out.println(str.indexOf('l'));
		System.out.println(str.isBlank());
		System.out.println(str.lastIndexOf('l'));
		System.out.println(str.length());
		System.out.println(str.replace(ch, 'p'));
		System.out.println(str.repeat(3));
		System.out.println(str.replaceFirst("l", "p"));
		System.out.println(str.startsWith("h"));
		System.out.println(str.strip());
		System.out.println(str.substring(3));
		System.out.println(str.substring(0, 3));
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		System.out.println();
		
		String sent="mom and dad are going to meet madam";
		
		String words[]=sent.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			
		}
		
		
		System.out.println(sent);
		for(String v:words)
		{
			System.out.println(v);
		}
		
		char chh[]=str.toCharArray();
	
		
		for(char c:chh)
		{
			System.out.println(c);
			
		}
		
		
	}

}
