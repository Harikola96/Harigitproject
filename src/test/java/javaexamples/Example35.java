package javaexamples;

public class Example35 {
	public static void main(String[] args) {
		display();
		String a = "abdul kalam";
		display(a);
		String b = "My guru";
		display(a, b);

	}

	private static void display(String... x) {
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%s%n",x[i]);
		}
	}
}/*
package javaexamples;

public class Example35
{
	public static void main(String[] args)
	{
		display(); //no argument
		String a="abdul kalam";
		display(a); //one argument
		String b="My guru";
		display(a,b); //two arguments
		// and so on...
	}
	//Method allows only one argument with "..." operator if required.
	//And that argument should be last argument 
	//This argument takes no or one or more values while calling the method.
	//This argument behaves like an array.
	public static void display(String... x)
	{
		for(int i=0;i<x.length; i++)
		{
			System.out.printf("%s%n",x[i]);
		}
	}
}
*/



