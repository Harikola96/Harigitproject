package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Test80
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site using base URL
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000); 
		//Close banner if exists
		try
		{
			driver.findElement(By.xpath("//span[@role='button']")).click();
			Thread.sleep(5000); 
		}
		catch(Exception ex)
		{
			System.out.println("No banner this time");
		}
		//click on "beauty" link
		driver.findElement(By.xpath("//div[starts-with(@aria-label,'Beauty')]")).click();
		Thread.sleep(5000); 
		//click on "VIEW ALL"
		driver.findElement(By.xpath("(//a[text()='VIEW ALL'])[1]")).click();
		Thread.sleep(5000);
		//click on link
		driver.findElement(By.xpath("//img[@alt='suzuki Car Key Cover']")).click();
		Thread.sleep(5000);
		//collect all models
		List<WebElement> all=driver.findElements(By.xpath("//div[contains(@data-tkid,'SEARCH')]/a[1]"));
		for(int i=0;i<all.size();i++)
		{
			//((JavascriptExecutor)driver).executeScript("arguments[0].click();",all.get(i));
			all.get(i).click();
			Thread.sleep(5000);
			//switch to newly opened window/tab(2nd tab)
			Set<String> s=driver.getWindowHandles();
			List<String> l=new ArrayList<String>(s);
			driver.switchTo().window(l.get(i+1));
			//get amount and display
			String x=driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']")).getText();
			x=x.substring(1); //take text from 2nd position to avoid currency symbol
			x=x.replace(",",""); //remove "," in value
			System.out.println(x);
			//back to previous page
			driver.switchTo().window(l.get(0));
			Thread.sleep(2000);
		}
		//close site
		//driver.close();
	}
}
