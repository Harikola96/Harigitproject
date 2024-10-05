package tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test27 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		Thread.sleep(5000);
		driver.findElement(By.name("fname")).sendKeys("abdul");
		driver.findElement(By.name("lname")).sendKeys("kalam");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.close();
		//"NoSuchElementException" in above code because our elements are under a frame(Part of a page)

	}

}
