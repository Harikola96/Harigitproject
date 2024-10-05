package javaexamples;

import java.util.Scanner;

public class Example33Solution1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = sc.nextLine();
		System.out.println("Enter a roll number");
		int rno = sc.nextInt();
		sc.close();
		System.out.println("Given roll number is" + rno);
		System.out.println("Given name is " + name);
	}
}
