package collectionsLearn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListLearn {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<=100;i++)
		{
			list.add(i);
		}
		
		for(int i=0;i<=100;i++)
		{
			list.add(i);
		}
		
		
		LinkedList<Integer> lst=new LinkedList<Integer>(list);
		for(int i:lst)
		{
			System.out.println(i);
		}
		
		Set<Integer> set=new HashSet<Integer>(list);
		
	}

}
