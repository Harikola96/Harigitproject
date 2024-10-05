package javaexamples;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
	public static void main(String[] args) {
		List<String> mylist = new ArrayList<>();
		mylist.add("apple");
		mylist.add("Banana");
		mylist.add("Guva");
		mylist.add("apple");
		System.out.println("mylist");
		System.out.println(mylist.get(0));
		System.out.println(mylist.get(1));
		System.out.println(mylist.get(3));
		System.out.println(mylist.get(4));

	}
}
