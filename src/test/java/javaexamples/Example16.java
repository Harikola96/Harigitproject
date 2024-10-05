package javaexamples;

import java.util.Scanner;

public class Example16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long x = sc.nextLong();
		sc.close();
		int count = 0;
		long temp1 = x;
		while (temp1 != 0) {
			temp1 = (int) (temp1 / 10);
			count++;
		}
		System.out.printf("No: of digits in %d is %d%n",x,count);
		long temp2 = x;
		long value = 0;
		while (temp2 != 0) {
			int d = (int) (temp2 % 10);
			value = (long) (value + Math.pow(d, count));
			temp2 = (long) temp2 / 10;
			if (value == x) {
				System.out.printf("%d is a armstrong number", x);
			} else {
				System.out.printf("%d is not a armstrong number", x);
			}
		}
	}
}
