package constructorPracticals;

public class ConstructorLearn {
	
	static int abc;
	int xyz;
	
	ConstructorLearn()
	{
		abc=5000;
		xyz=6000;
	}
	
	public static void main(String[] args) {

		ConstructorLearn o=new ConstructorLearn();
		System.out.println(abc);    //   50000 7    5000 1
		System.out.println(o.xyz);  //   60000 7	6000 2
		
		ConstructorLearn o1=new ConstructorLearn();
		System.out.println(abc);    //   50000 7    5000 1
		System.out.println(o1.xyz);  //   60000 7	6000 2
		
		ConstructorLearn o2=new ConstructorLearn();
		System.out.println(abc);    //   50000 7    5000 1
		System.out.println(o2.xyz);  //   60000 7	6000 2
		
		
	}

}
