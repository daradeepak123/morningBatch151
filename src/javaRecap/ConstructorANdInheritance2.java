package javaRecap;

public class ConstructorANdInheritance2 extends ConstructorANdInheritance1{

	
	int b=200;
	
	ConstructorANdInheritance2()
	{
		b=500;
		System.out.println(b);
	}
	
	public static void main(String[] args) {

		ConstructorANdInheritance1 o=new ConstructorANdInheritance2();
		System.out.println(o.a);
		
	}

}
