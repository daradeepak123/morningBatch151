package methodsLearn;

public class MethodWithReturnType {
	
	
	public static int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("THis is sum method");
		return c;
		
	}
	
	public int summ(int a,int b)
	{
		int c=a+b;
		System.out.println("THis is sum method");
		return c;
		
	}
	
	

	public static void main(String[] args) {
		MethodWithReturnType o=new MethodWithReturnType();
		int aa=sum(100,100);
		System.out.println(aa);
		
		aa=o.summ(aa,600);
		
		System.out.println(aa);
		
		System.out.println(o.summ(aa,aa));
		
		sum(o.summ(aa,aa),aa);
		
		
	}

}
