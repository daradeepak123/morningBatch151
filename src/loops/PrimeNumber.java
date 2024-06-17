package loops;

import java.util.Scanner;

public class PrimeNumber {
	
	
	public static int primeCheck(int num)
	{
		boolean flag=false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
			
		}
		
		if(flag)
		{
			System.out.println(num+" is not a prime number");
			return 1;
		}
		else
		{
			System.out.println(num+ " is a prime number");
			return 2;
		}
	}
	

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		primeCheck(num);
		
		primeCheck(7);
		
	}

}
