package tests;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test10 {

	public static void main(String[] args) 
	{
		
		String bn;
		
		WebDriver driver;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Browser name please Harikrishna");
		bn=sc.nextLine();
		if(bn.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(bn.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else if(bn.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else
			System.out.println("please enter the correct Browser");
		

	}

}
