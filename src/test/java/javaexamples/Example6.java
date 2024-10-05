package javaexamples;

import java.util.Scanner;

public class Example6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int x = sc.nextInt();
		sc.close();
		int flag = 0;
		for (int i = 2; i < x; i++) {

			if (x % i == 0) {
				flag = 1;
				System.out.printf("%d i not a prime number",x);
				break;
			}
		}

		if (flag == 0) {
			System.out.printf("%d is a prime number", x);
		}

	}
}
