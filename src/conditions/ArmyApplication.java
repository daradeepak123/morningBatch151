package conditions;

import java.util.Scanner;

public class ArmyApplication {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter your name");
		String name=sc.next();
		System.out.println("pleae enter your age");
		int age=sc.nextInt();
		System.out.println("Please enter your qualification");
		String quali=sc.next();
		System.out.println("enter your percentage");
		int percent=sc.nextInt();
		System.out.println("Please enter your gender");
		String gender=sc.next();
		System.out.println("Please enter your height");
		int height=sc.nextInt();
		System.out.println("Please enter your weight");
		int weight=sc.nextInt();
		System.out.println("please enter your physical fitness");
		boolean pFitness=sc.nextBoolean();
		System.out.println("please enter your mental fitness");
		boolean mFitness=sc.nextBoolean();
		
		if(age>=18 & age<=24) 
		{
			if(quali.equals("inter"))
			{
				if(percent>=70)
				{
					if(gender.equals("male"))
					{
						if(height>=170)
						{
							if(weight>=70)
							{
								if(pFitness)
								{
									if(mFitness)
									{
										System.out.println("You are eligible for army job application");
									}
									else
									{
										System.out.println("Based on mental fitness you are not eligible");
									}
								}
								else
								{
									System.out.println("Based on physical fitness you are not eligible");
								}
							}
							else
							{
								System.out.println("You are not eligible based on weight");
							}
						}
						else
						{
							System.out.println("You are not eligible based on height");
						}
					}
					else if(gender.equals("female"))
					{
						if(height>=150)
						{
							if(weight>=50)
							{
								if(pFitness)
								{
									if(mFitness)
									{
										System.out.println("You are eligible for army job application");
									}
									else
									{
										System.out.println("Based on mental fitness you are not eligible");
									}
								}
								else
								{
									System.out.println("Based on physical fitness you are not eligible");
								}
							}
							else
							{
								System.out.println("You are not eligible based on weight");
							}
						}
						else
						{
							System.out.println("You are not eligible based on height");
						}
						
					}
					else
					{
						System.out.println("you are not eligible based on gender");
					}
				}
				else
				{
					System.out.println("you are not eligible based on your percentage");
				}
			}
			else
			{
				System.out.println("you are not eligible based on qualification");
			}
		}
		else
		{
			System.out.println("you are not eligibel for this based on your age");
		}
		
	}

}
