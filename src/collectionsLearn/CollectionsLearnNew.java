package collectionsLearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionsLearnNew {
	
	
	static List<String> names;

	public static void main(String[] args) {
		String d="fastUpdate";
		if(d.equalsIgnoreCase("fastInsert"))
		{
		names=new ArrayList<>();
		}
		else if(d.equalsIgnoreCase("fastUpdate"))
		{
			names=new LinkedList<>();
		}
		else if(d.equalsIgnoreCase("fastImplement"))
		{
			names=new Vector<>();
		}
		else 
		{
			names=new Vector<>();
		}
		
		names.add("welcome");
		names.add("to");
		names.add("Quality");
		names.add("THought");
		
		for(String s:names)
		{
			System.out.println(s);
		}
		
		
		int a=10,b=50,c=0,dd;
		dd=a+b+c;
		System.out.println(dd);
		try
		{
		dd=a/c;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(dd);
		
		System.out.println("execution completed");
		
		
	}

}
