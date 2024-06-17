package conditionAllLogics;

public class AllLogicsForConditions {
	
	
	public void dress(int marks)
	{
		if(marks>500)
		{
			System.out.println("You will get new deress");
		}
		
	}
	
	public void promoted(int marks)
	{
		if(marks>260)
		{
			System.out.println("You are promoted to inter");
		}
		else
		{
			System.out.println("you need to driver auto");
		}
		
	}
	
	public void ranges(int marks)
	{
		
		if(marks>500)     
		{
		System.out.println("you will get bicycle"); 
		}
		else if(marks>400)  
		{
		System.out.println("you will get outing");
		}
		else if(marks>300)  
		{
		System.out.println("you will get new dress");
		}
		else 
		{
		System.out.println("you need to driver auto");
		}
		
	}
	

}
