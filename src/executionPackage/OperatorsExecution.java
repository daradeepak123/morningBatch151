package executionPackage;

import operatorsUserDefinedMethods.ArithmaticOperators;
import operatorsUserDefinedMethods.ComparatorUserDefinedLogics;
import operatorsUserDefinedMethods.LogicalOperators;

public class OperatorsExecution {

	public static void main(String[] args) {

		ArithmaticOperators o=new ArithmaticOperators();
		
		int abc=ArithmaticOperators.add(100, 1000);
		System.out.println(abc);
		
		abc=o.sub(1000, 100);
		System.out.println(abc);
	
		int op=o.add(100, 100, 100, 100);
		
		abc=o.sub(op, 100);
		System.out.println(abc);
		
		ComparatorUserDefinedLogics oo=new ComparatorUserDefinedLogics();
		
		boolean bool=oo.lessThan(100,1000);
		System.out.println(bool);
						    //100  >  400		  false	
		int xyz=o.add(100, 100, 100, 100);
		bool=oo.greaterTHan(100,xyz);
		System.out.println(bool);
		
		LogicalOperators lo=new LogicalOperators();
		
		boolean bb=lo.orOperatorGreaterLess(2000, 2000);
		System.out.println(bb);
		
		
		int qwe=500,asd=600;
		boolean lkj=asd<qwe;
		boolean pot=asd>qwe;
		
		boolean wer=lkj|pot;
		boolean oiu=lkj&pot;
		
		System.out.println(wer +"   "+ oiu);
		
		System.out.println(true | false);
		System.out.println(true | true);
		System.out.println(false | true);
		System.out.println(false | false);
		
		
		int df=600;
		System.out.println(df);
		
		df+=400;
		System.out.println(df);
		
		df%=1000;
		System.out.println(df);
		
		df++;
		System.out.println(df);
		df--;
		System.out.println(df);
		
		System.out.println(df++);
		
	}

}
