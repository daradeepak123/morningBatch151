package arraysLearn;

public class ArrayParameter {
	
	
	public static int[] evenArray(int abc[])
	{
		int count=0;
		for(int i=0;i<abc.length;i++)
		{
			if(abc[i]%2==0)
			{
				count++;
			}
		}
		
		int evenArr[]=new int[count];
		count=0;
		for(int i=0;i<abc.length;i++)
		{
			if(abc[i]%2==0)
			{
				evenArr[count++]=abc[i];
			}
		}
		
		return evenArr;
	}
	
	
	

	public static void main(String[] args) {

		
		
		int a[]=new int[100];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		
		
		int even[]=evenArray(a);
		
		for(int abc:even)
		{
			System.out.println(abc);
		}
		
	}

}
