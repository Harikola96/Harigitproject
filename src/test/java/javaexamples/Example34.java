package javaexamples;

import java.util.Scanner;

public class Example34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a roll number");
		int rno = Integer.parseInt(sc.nextLine());
		System.out.println("Enter a name");
		String name = sc.nextLine();
		System.out.println("Give a Grade(A/B/C/D)");
		char grade = sc.nextLine().charAt(0);
		System.out.println("Enter \"are you married?\"");
		boolean b = sc.nextBoolean();
		sc.close();
		System.out.println("Given roll number is" + rno);
		System.out.println("Given name is " + name);
		System.out.println("Give a Grade is" + grade);
		System.out.println("Given \"are you married?\" is" + b);
	}
}
