package acc1;


public class AccessMod2 extends AccessMod1{

	
	public static void hi()
	{
		System.out.println("THis is hi method");
	}
	
	
	
	public static void main(String args[])
	{
		AccessMod1 o=new AccessMod1();
		System.out.println(o.xyz);
		System.out.println(abc);
		hello();
	}

}
