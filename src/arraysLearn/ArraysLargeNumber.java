package arraysLearn;

public class ArraysLargeNumber {

	public static void main(String[] args) {

		int a[]=new int[1000];
	
		System.out.println(a.length);
	
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
		
		for(int xyz:a)
		{
			System.out.println(xyz);
		}
		
		
		
		
		
		
		
	}

}
