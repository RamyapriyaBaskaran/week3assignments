package week3.assignments.list;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18); 
		list.add(16); 
		list.add(17); 
		list.add(19); 
		list.add(18);
		list.add(17); 
		list.add(20);
		 
		System.out.println("Given List: "+list);
		System.out.print("Duplicates in List: ");
		for (int i=0; i<list.size()-1;i++) {
			int count = 0;
			for (int j=i+1; j<=list.size()-1;j++) {
				if (list.get(i) == list.get(j)) {
					count++;
					break;
				}
			}
			if(count>0)
				System.out.print(list.get(i) + "  ");
		}
	}
}
