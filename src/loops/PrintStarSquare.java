package loops;

public class PrintStarSquare {

	public static void main(String[] args) {

		for(int i=0;i<=10;i++)    //flaw  i not used 
		{
			for(int j=0;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
