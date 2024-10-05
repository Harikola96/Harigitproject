package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test17 
{
	public static void main(String[] args) throws Exception
	{
		//Cross-browser for any site
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=sc.nextLine();
		System.out.println("Enter complete URL of target site");
		String url=sc.nextLine();
		sc.close();
		//Open any browser
		WebDriver driver = null; //declare object to an interface
		if(bn.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver(); //define that object using concrete class's class
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(bn.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Please enter correct browser name");
			System.exit(0); //stop execution forcibly
		}
		//wait for few seconds
		Thread.sleep(5000);
		//Launch site
		driver.get(url);
		//wait for few seconds
		Thread.sleep(5000);
		//Get title 
		String t=driver.getTitle();
		System.out.println("Title is "+t);
	}
}
