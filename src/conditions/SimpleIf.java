package conditions;

import java.util.Scanner;

import conditionAllLogics.AllLogicsForConditions;

public class SimpleIf {

	public static void main(String[] args) {
		
		AllLogicsForConditions o=new AllLogicsForConditions();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks");
		int mark=sc.nextInt();
		o.dress(mark);
		
		o.promoted(mark);
		o.ranges(mark);
		
	}

}
