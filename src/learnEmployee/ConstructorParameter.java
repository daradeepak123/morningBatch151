package learnEmployee;

public class ConstructorParameter {

	int a;
	ConstructorParameter(int x)
	{
		a=x;
	}
	
	public void displayDet()
	{
		System.out.println(a);
	}
	
	public void hlo()
	{
		
	}
	public static void main(String[] args) {
		
		ConstructorParameter o=new ConstructorParameter(100);
		o.displayDet();
		System.out.println(o.a);
		o.a=500;
		System.out.println(o.a);
		o.hlo();
		ConstructorParameter o1=new ConstructorParameter(1000);
		
		
	
	}

}
