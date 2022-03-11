package week3.assignments.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesList {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] splitted = text.split(" ");
		List <String> list = new ArrayList<String>();	
		for(int i=0; i<splitted.length; i++)
		{
			list.add(splitted[i]);
		}
		System.out.println("Before Removing duplicates: " +list);

		Set<String> set = new LinkedHashSet<String>(); 
		set.addAll(list);
		System.out.println("After Removing duplicates: " +set);	
	}
}
