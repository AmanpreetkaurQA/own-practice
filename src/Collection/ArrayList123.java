package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList123 {

	public static void main(String[] args) {
		// WAP to print the values using Arraylist , please perform it using add, remove, and other related methods.
		
		ArrayList<Integer> values = new ArrayList<>();
		
		//Adding values in the list
		values.add(0, 10);
		values.add(20);
		values.add(2, 30);
		values.add(40);
		System.out.println(values);
		
		// Removing values from the list
		values.remove(3);
		System.out.println(values);
		
		ArrayList<String> colors = new ArrayList<>();
		colors.add("green");
		colors.add(0, "black");
		System.out.println(colors);
		colors.remove(1);
		System.out.println(colors);
		
		List<Integer> values1 = new ArrayList<>();
		values1.add(100);
		System.out.println(values1);
	}

}
