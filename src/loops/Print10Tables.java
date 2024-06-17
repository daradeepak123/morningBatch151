package loops;

public class Print10Tables {
	
	
	
	
	public static void printTableRange(int e)
	{
		
		int tab=e;
		int maxTab=20;
		for(int i=1;i<=maxTab;i++)
		{
			System.out.println(tab+"*"+i+"="+tab*i);  
		}
		System.out.println("*************");
	}
	
	

	public static void main(String[] args) {

		for(int j=1;j<=10;j++)
		{
			printTableRange(j);
		}
	}
}
