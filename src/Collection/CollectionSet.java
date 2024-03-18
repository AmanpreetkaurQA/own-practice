package Collection;

import java.util.HashSet;

public class CollectionSet {

	public static void main(String[] args) {
		// WAP to print the values using Hashset , please perform it using add, remove, and other related methods.
		
		HashSet <String> value= new HashSet<>();
		value.add("aman");
		value.add("preet");
		
		System.out.println(value);
		value.remove("preet");
		System.out.println(value);

	}

}
