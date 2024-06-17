package conditions;

import java.util.Scanner;

public class SmallStringExample {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your area");
		String area=sc.next();  //rurall
		int abc=100;
		if(area.equals("city"))
		{
			System.out.println(" you are staying in cities");
		}
		else if(area.equals("town"))
		{
			System.out.println(" you are staying in town");
		}
		else if(area.equals("rural"))
		{
			System.out.println(" you are staying in village");
		}
		
		
		if(abc==100)
		{
			
		}
		
	}

}
