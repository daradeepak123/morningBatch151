package arraysLearn;

public class ArraysTransfer {

	public static void main(String[] args) {

		int a[]=new int[100];
		int b[]=new int[100];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;  
		}
		int q=b.length-1;
		for(int i=0;i<a.length;i++)
		{
			b[q--]=a[i];
		}
		
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"    "+b[i]);
		}
		
		
		
	}

}
