package conditions;

import java.util.Scanner;

public class ElectricityBilling {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);

		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter current month reading");
		int cMonthReading=sc.nextInt();
		System.out.println("enter last month reading");
		int lMonthReading=sc.nextInt();

		int units=cMonthReading-lMonthReading;
		System.out.println("enter your area city/town/rural");
		String area=sc.next();
		System.out.println("enter applience type");
		String applType=sc.next();

		if(area.equals("city"))  // area==1
		{
			if(applType.equals("industries"))
			{
				if(units >=0 & units<=100)
				{
					System.out.println(name+", you need to pay "+ units*5);
				}
				else if(units>100 & units<=200)
				{
					System.out.println(name+", you need to pay "+ units*7.5);
				}
				else if(units>200 & units<=300)
				{
					System.out.println(name+", you need to pay "+ units*10);
				}
				else if(units>300 & units<=500)
				{
					System.out.println(name+", you need to pay "+ units*15);
				}
				else if(units>500)
				{
					System.out.println(name+", you need to pay "+ units*20);
				}
			}
			if(applType.equals("commercial"))
			{
				if(units >=0 & units<=100)
				{
					System.out.println(name+", you need to pay "+ units*4);
				}
				else if(units>100 & units<=200)
				{
					System.out.println(name+", you need to pay "+ units*6);
				}
				else if(units>200 & units<=300)
				{
					System.out.println(name+", you need to pay "+ units*8);
				}
				else if(units>300 & units<=500)
				{
					System.out.println(name+", you need to pay "+ units*10);
				}
				else if(units>500)
				{
					System.out.println(name+", you need to pay "+ units*12);
				}
			}if(applType.equals("home"))
			{
				if(units >=0 & units<=100)
				{
					System.out.println(name+", you need to pay "+ units*3);
				}
				else if(units>100 & units<=200)
				{
					System.out.println(name+", you need to pay "+ units*4);
				}
				else if(units>200 & units<=300)
				{
					System.out.println(name+", you need to pay "+ units*5);
				}
				else if(units>300 & units<=500)
				{
					System.out.println(name+", you need to pay "+ units*8);
				}
				else if(units>500)
				{
					System.out.println(name+", you need to pay "+ units*10);
				}
			}
			

		}
		else if(area.equals("town"))
		{
			if(applType.equals("industries"))
			{
				if(units >=0 & units<=100)
				{
					System.out.println(name+", you need to pay "+ units*5);
				}
				else if(units>100 & units<=200)
				{
					System.out.println(name+", you need to pay "+ units*7.5);
				}
				else if(units>200 & units<=300)
				{
					System.out.println(name+", you need to pay "+ units*10);
				}
				else if(units>300 & units<=500)
				{
					System.out.println(name+", you need to pay "+ units*15);
				}
				else if(units>500)
				{
					System.out.println(name+", you need to pay "+ units*20);
				}
			}
			if(applType.equals("commercial"))
			{
				if(units >=0 & units<=100)
				{
					System.out.println(name+", you need to pay "+ units*4);
				}
				else if(units>100 & units<=200)
				{
					System.out.println(name+", you need to pay "+ units*6);
				}
				else if(units>200 & units<=300)
				{
					System.out.println(name+", you need to pay "+ units*8);
				}
				else if(units>300 & units<=500)
				{
					System.out.println(name+", you need to pay "+ units*10);
				}
				else if(units>500)
				{
					System.out.println(name+", you need to pay "+ units*12);
				}
			}if(applType.equals("home"))
			{
				if(units >=0 & units<=100)
				{
					System.out.println(name+", you need to pay "+ units*3);
				}
				else if(units>100 & units<=200)
				{
					System.out.println(name+", you need to pay "+ units*4);
				}
				else if(units>200 & units<=300)
				{
					System.out.println(name+", you need to pay "+ units*5);
				}
				else if(units>300 & units<=500)
				{
					System.out.println(name+", you need to pay "+ units*8);
				}
				else if(units>500)
				{
					System.out.println(name+", you need to pay "+ units*10);
				}
			}
		}
		else if(area.equals("rural"))
		{
			if(applType.equals("industries"))
			{
				if(units >=0 & units<=100)
				{
					System.out.println(name+", you need to pay "+ units*5);
				}
				else if(units>100 & units<=200)
				{
					System.out.println(name+", you need to pay "+ units*7.5);
				}
				else if(units>200 & units<=300)
				{
					System.out.println(name+", you need to pay "+ units*10);
				}
				else if(units>300 & units<=500)
				{
					System.out.println(name+", you need to pay "+ units*15);
				}
				else if(units>500)
				{
					System.out.println(name+", you need to pay "+ units*20);
				}
			}
			if(applType.equals("commercial"))
			{
				if(units >=0 & units<=100)
				{
					System.out.println(name+", you need to pay "+ units*4);
				}
				else if(units>100 & units<=200)
				{
					System.out.println(name+", you need to pay "+ units*6);
				}
				else if(units>200 & units<=300)
				{
					System.out.println(name+", you need to pay "+ units*8);
				}
				else if(units>300 & units<=500)
				{
					System.out.println(name+", you need to pay "+ units*10);
				}
				else if(units>500)
				{
					System.out.println(name+", you need to pay "+ units*12);
				}
			}if(applType.equals("home"))
			{
				if(units >=0 & units<=100)
				{
					System.out.println(name+", you need to pay "+ units*3);
				}
				else if(units>100 & units<=200)
				{
					System.out.println(name+", you need to pay "+ units*4);
				}
				else if(units>200 & units<=300)
				{
					System.out.println(name+", you need to pay "+ units*5);
				}
				else if(units>300 & units<=500)
				{
					System.out.println(name+", you need to pay "+ units*8);
				}
				else if(units>500)
				{
					System.out.println(name+", you need to pay "+ units*10);
				}
			}
		}
		else 
		{
			System.out.println("please enter proper input city/town/rural");
		}

	}

}
