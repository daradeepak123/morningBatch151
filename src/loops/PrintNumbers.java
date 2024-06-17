package loops;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {

//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("how many times you need to iterate the loop");
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			System.out.println(i);
		}
		
		
		
		
	}

}
