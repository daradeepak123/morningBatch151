package variablesDataTypes;

public class StaticLearn {

	static int abc=500;   //4 bytes
	int xyz=600;
	
	
	public static void main(String[] args) {
		
		StaticLearn obj=new StaticLearn();
		System.out.println(obj.xyz);
		System.out.println(abc);
		hello();
	}
	
	
	public static void hello()
	{
		StaticLearn obj=new StaticLearn();
		System.out.println(obj.xyz);
		System.out.println("this is hello method");
		
		obj.hi();
	}
	

	
	public void hi()
	{
		System.out.println("this is hi method");
		System.out.println(xyz);
		System.out.println(abc);
	}
	
	
}
