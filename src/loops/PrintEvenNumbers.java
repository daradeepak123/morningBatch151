package loops;

public class PrintEvenNumbers {
	
	
	public void loopOddEven(int min,int max)
	{
		for(int i=min;i<=max;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is a even number");
			}
			else if(i%2!=0)
			{
				System.out.println(i+" is a odd number");
			}
		}
	}
	
	

	public static void main(String[] args) {

		PrintEvenNumbers o=new PrintEvenNumbers();
		o.loopOddEven(1,1000);
		
		
		
		
		
	}

}
