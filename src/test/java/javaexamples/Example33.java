package javaexamples;

import java.util.Scanner;

public class Example33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a roll number");
		int rno = sc.nextInt();
		System.out.println("Enter a name");
		String name = sc.nextLine();
		sc.close();
		System.out.println("Given roll number is" + rno);
		System.out.println("Given name is " + name);
		/*
		The issue arises because nextInt() does not consume the newline character left in the input
		buffer when the integer is read. This causes nextLine() to read the newline character as 
		an empty string.
		*/
	}
}
