package BasicPrograms;

import java.util.ArrayList;

public class ArrayListExaples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Orange");
		list.add("greaps");
		list.add("mango");
		list.add("banana");
		
		for(String FrutName : list) {
			
			System.out.println(FrutName);
		}
		
		
	}

}
