package conditions;

import java.util.Scanner;

public class OddEvenCheck {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter desired number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Given number is even number");
		}
		else if(num%2!=0)
		{
			System.out.println("Given number is odd number");
		}
		
		
		
		
		
	}

}
