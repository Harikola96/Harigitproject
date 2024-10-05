package tests;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test45
{
	public static void main(String[] args) throws Exception
	{
		//Get product type to search from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product type to search");
		String pro=sc.nextLine();
		sc.close();
		//open browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		//Search for a product
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys(pro);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(5000);
		//collect all results
		List<WebElement> results=driver.findElements(By.xpath(
		                                      "//div[@data-component-type='s-search-result']")); 
		System.out.println("count of all results in first page is "+results.size());
		//Goto each result 
		int vc=0;
		for(WebElement result:results)
		{
			if(result.isDisplayed())
			{
				vc++;
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].style.border='2px red dotted';", result);
			}
		}
		System.out.println("Count of visible results in first page is "+vc);
		//close site
		//driver.close();
	}
}

