package week3.assignments.list;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		System.out.print("Intersection numbers are: ");
		 List<Integer> obj = new ArrayList<Integer>();
		 obj.add(3);
		 obj.add(2);
		 obj.add(11);
		 obj.add(4);
		 obj.add(6);
		 obj.add(7);
		 
		 List<Integer> obj1 = new ArrayList<Integer>();
		 obj1.add(1);
		 obj1.add(2);
		 obj1.add(8);
		 obj1.add(4);
		 obj1.add(9);
		 obj1.add(7);
		 
		 for (int i=0; i<obj.size(); i++) {
			 for (int j=0; j<obj1.size(); j++) {
				 if(obj.get(i) == obj1.get(j)) {
					 System.out.print(obj.get(i) + " ");
				 }
			 }
		 }	 
	}
}
