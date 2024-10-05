package tests;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(3000);
		URL obj=new URL("https://www.google.com/intl/en-US/gmail/about/");
		driver.navigate().to(obj);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("Hari");	
	

	}

}
