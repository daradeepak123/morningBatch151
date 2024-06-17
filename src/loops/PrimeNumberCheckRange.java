package loops;

public class PrimeNumberCheckRange {

	public static void main(String[] args) {

		
		// 1-100 numbers what are prime number
		int primeNum=0;
		int nPrimeNum=0;
		for(int i=1;i<=100;i++)
		{
			int c=PrimeNumber.primeCheck(i);
			
			if(c==2)
			{
				primeNum++;
			}
			else
			{
				nPrimeNum++;
			}
		}
		
		System.out.println(primeNum +"    "+ nPrimeNum);
		
		
		
		
		
	}

}
