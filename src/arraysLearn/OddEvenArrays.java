package arraysLearn;

import java.util.Scanner;

public class OddEvenArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int e=0;
		int o=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=i+1;
			if(a[i]%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
		}
		int even[]=new int[e];
		int odd[]=new int[o];
		
		e=0;
		o=0;
		
		for(int i=0;i<a.length;i++)   // 1 2 3 4 5 6 7 8  9 10
		{
			if(a[i]%2==0)
			{
				even[e++]=a[i];
			}
			else
			{
				odd[o++]=a[i];
			}
		}
		
		for(int r:even)
		{
			System.out.println(r + " is even number");
		}
		
		for(int r:odd)
		{
			System.out.println(r+" is odd number");
		}
		
		
		
		for(int i=0;i<a.length;i++)
		{
			
		}
		


	}

}
