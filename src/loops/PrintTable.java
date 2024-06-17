package loops;

import java.util.Scanner;

public class PrintTable {
	
	public static void tablePrint(int num,int max)
	{
		for(int i=1;i<=max;i++)
		{
			System.out.println(num+"*"+i+"="+i*num);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number which table you want");
		int tab=sc.nextInt();
		System.out.println("Enter how many tables you need");
		int maxTable=sc.nextInt();
		
		tablePrint(tab,maxTable);
	}

}
