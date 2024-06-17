package constructorPracticals;

public class ConstructorOverLoading {

	int a;
	String s;
	ConstructorOverLoading()
	{
		System.out.println("hello");
	}
	ConstructorOverLoading(int x)
	{
		System.out.println(a=x);
	}
//	ConstructorOverLoading(String xyz)
//	{
//		System.out.println(s=xyz);
//	}
//	ConstructorOverLoading(boolean xyz)
//	{
//		System.out.println(xyz);
//	}
	public static void main(String args[])
	{
		ConstructorOverLoading o=new ConstructorOverLoading();
//		ConstructorOverLoading o1=new ConstructorOverLoading(500);
//		ConstructorOverLoading o2=new ConstructorOverLoading("500");
//		ConstructorOverLoading o3=new ConstructorOverLoading(true);
		ConstructorOverLoading o5=new ConstructorOverLoading(1000);
		ConstructorOverLoading o7=new ConstructorOverLoading(120);
		
		
		ConstructorOverLoading o6=new ConstructorOverLoading();
	}
	
	
	
	
}
