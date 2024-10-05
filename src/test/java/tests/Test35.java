package tests;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test35 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter URL");
		String URL=sc.nextLine();
		System.out.println("Enter innings 1 or 2 or...");
		int inum=sc.nextInt();
		System.out.println("Enter batter 1 or 2 or....");
		int bnum=sc.nextInt();
		sc.close();
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		try
		{
			String x=driver.findElement(By.xpath("(//div[contains(@id,'scard') and contains(@id,'innings-"+inum+"')]//div[@class='text-xs']/div[contains(@class,'scorecard-bat')])["+bnum+"]/div[2]")).getText();
			System.out.println(x);
		}
		catch(NoSuchElementException ex){	
System.out.println("No runs and no innings found in page source");
	}

	}
}
