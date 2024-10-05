package tests;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test14  {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Try it Yourself")).click();
		Set<String> s=driver.getWindowHandles();
		List<String> l=new ArrayList<>(s);
		System.out.println(l);
		driver.switchTo().window(l.get(1));	
	    Thread.sleep(3000);
		driver.switchTo().window(l.get(0));
		 Thread.sleep(3000);
		driver.switchTo().window(l.get(1));
		Thread.sleep(1000);
		driver.quit();
	}

}
