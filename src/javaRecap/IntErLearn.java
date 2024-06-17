package javaRecap;

public interface IntErLearn {

	public void hello();
	public void abc();
}
class Abc implements IntErLearn
{


	public void hello() {
		System.out.println("this is hello method");
	}

	public void abc() {
		System.out.println("this is abc method");
	}
}

class XYZ
{

	public static void main(String args[])
	{
		IntErLearn o=new Abc();
		o.abc();
	}
}





