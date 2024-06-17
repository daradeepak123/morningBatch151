package acc1.copy;

public class Access1 {
	
	public static int a=100;
	static int xyz=2000;
	protected static int abc=20000;
	private static int qwe=3000;
	
	
	public  void hello()
	{
		System.out.println("this is plain hello");
	}
	public static void hello(String s)
	{
		System.out.println(s);
	}
	

	
	
	public static void main(String[] args) {

		
		System.out.println(a);
		System.out.println(xyz);
		System.out.println(abc);
		System.out.println(qwe);
	}

}
