package javaexamples;

import java.util.Scanner;

public class Example17
{
	public static void main(String[] args)
	{
		//Take limits from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower limit");
		long llimit=sc.nextLong();
		System.out.println("Enter upper limit");
		long ulimit=sc.nextLong();
		sc.close();
		int count=0;
		//goto each number in between lower limit and upper limit
		for(long i=llimit;i<=ulimit;i++)//Lowerlimit=110 and Upper limit=210
		{
			//Calculate no: of digits in given number
			long temp1=i; //take original number
			int nod=0;
			while(temp1!=0)
			{
				temp1=temp1/10; //cut digit
				nod++;//3
			}
			//Calculate sum of Armstrong equation
			long temp2=i; //take original number
			int value=0;
			while(temp2!=0)
			{
				int d=(int) (temp2%10); //get last digit//1
				value=(int) (value+Math.pow(d,nod));//27+5^3=152+1=153
				temp2=(long)temp2/10; //cut last digit//15
			}
			//compare output value with original number for for Armstrong
			if(value==i)
			{
				System.out.printf("%d is Armstrong number%n",i);
				count++;
			}
		}
		System.out.printf("count of armstrong numbers in given range is %d",count);
	}
}







