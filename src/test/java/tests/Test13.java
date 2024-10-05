package tests;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test13  {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Try it Yourself")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Try it Yourself")).click();
		Set<String> x=driver.getWindowHandles();
		System.out.println(x);
		driver.close();
	}

}
