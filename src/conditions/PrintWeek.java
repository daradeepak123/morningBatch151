package conditions;

import java.util.Scanner;

public class PrintWeek {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the week number");
		int week=sc.nextInt();
		
		if(week==1)
		{
			System.out.println("Monday");
		}
		else if(week==2)
		{
			System.out.println("Tuesday");
		}
		else if(week==3)
		{
			System.out.println("Wed");
		}
		else if(week==4)
		{
			System.out.println("Thurs");
		}
			
		else if(week==5)
		{
			System.out.println("Friday");
		}
		else if(week==6)
		{
			System.out.println("Sat");
		}
		else if(week==7)
		{
			System.out.println("Sun");
		}
		else
		{
			System.out.println("please enter the numbers from 1-7 only");
		}
		
	}

}
