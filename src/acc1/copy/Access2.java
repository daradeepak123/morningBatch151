package acc1.copy;

public class Access2 extends Access1{
	
	public void hello()
	{
		System.out.println("hi");
	}
	
	public static void hello(String ss)
	{
		System.out.println("hi this is new");
	}
	

	public static void main(String[] args) {
		Access2 o=new Access2();
		
		o.hello();
		
		hello("String");
	}

}
