package week3.assignments.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestList {

	public static void main(String[] args) {
		List<Integer> obj = new ArrayList<Integer>();
		obj.add(3);
		obj.add(2);
		obj.add(11);
		obj.add(4);
		obj.add(6);
		obj.add(7);
		
		Collections.sort(obj);
		System.out.println("Sorted List is: " +obj);
	
		int a = obj.size()-2;
		System.out.println("Second largest number is: " + obj.get(a));
	}
}
