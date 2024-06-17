package arraysLearn;

public class TwoDArray {

	public static void main(String[] args) {

		int a[][]=new int[10][10];
		
		int num=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[1].length;j++)
			{
				a[i][j]=num++;
			}
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[1].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
