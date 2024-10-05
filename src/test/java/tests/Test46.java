package tests;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test46 {
	public static void main(String[] args) throws Exception
	{
		//Get product type to search from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("search for a product");
		String pro=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(pro);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		List<WebElement> results=driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		System.out.println("total results count "+results.size());
		int vc=0;
		for(WebElement result:results)
		{
			if(result.isDisplayed())
			{
			vc++;
			WebElement price=result.findElement(By.xpath("descendant::span[@class='a-price-whole']"));
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='2px red dotted';", result);
			js.executeScript("arguments[0].style.border='2px blue dotted';", price);
			}
		}
		System.out.println("Total visible results count is "+vc);
	}
}
