package operatorsUserDefinedMethods;

public class LogicalOperators {
	
	
	public boolean orOperatorLessGreater(int a,int b)
	{
		boolean bb=a<b,aa=a>b;
		boolean cc=aa|bb;
		return cc;
	}
	
	public boolean orOperatorGreaterLess(int a,int b)
	{
		boolean bb=a>b,aa=a<b;
		boolean cc=aa|bb;
		return cc;
	}
	

}
