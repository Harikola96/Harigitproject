package javaexamples;

import java.util.HashSet;
import java.util.Set;

public class Example2 {
	public static void main(String[] args) {
		Set<String> myset = new HashSet<>();
		myset.add("apple");
		myset.add("Banana");
		myset.add("PineAppla");
		myset.add("apple"); // won't be added beacause it is duplicate
		System.out.println("myset");
		System.out.println(myset.contains("apple"));// Output: true
		System.out.println(myset.contains("Banana"));// Output: true
		System.out.println(myset.contains("Guva")); //Output: false
		System.out.println("Pineapple");// Output: true

	}
}
