package loops;

public class NestedLoop {

	public static void main(String[] args) {
			int count=0;
			int icount=0;
			int iicount=0;
			
		for(int i=1;i<=10;i++)
		{
			count++;
			for(int j=1;j<=10;j++)
			{
				icount++;
				for(int k=1;k<=10;k++)
				{
					iicount++;
				}
			}
		}
		
		System.out.println(count+ "   "+icount+"   "+iicount  );
		
	}

}
