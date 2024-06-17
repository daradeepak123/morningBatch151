package methodsLearn;

public class MethodWithParameter {
	
	
	public static void add(int x,int y)
	{
		int a=x,b=y;
		System.out.println(a+b);
	}
	
	public static void add(int x,int y,int z)
	{
		int a=x,b=y;
		System.out.println(a+b+z);
	}
	
	public void savingTHisMonth(String name,int i,int e)
	{
		int inc=i;
		int exp=e;
		int saving=inc-exp;
		
		System.out.println("Hello mr/ms " +name+" your savings are " + saving );
	}

	public static void main(String[] args) {

		MethodWithParameter o=new MethodWithParameter();
		
		o.savingTHisMonth("Qualith Thought", 1000000, 950000);
		o.savingTHisMonth("xyz", 100000, 150000);
		
		
	}

}
