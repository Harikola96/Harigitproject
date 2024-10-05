package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test59sir
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.goindigo.in/"); 
		Thread.sleep(10000);
		//Collect all radio buttons
		List<WebElement> l=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(l.size());
		//Get count of visible radio buttons
		int count=0;
		for(WebElement e:l)
		{
			if(e.isDisplayed())
			{
				count++;
			}
		}
		System.out.println(count); //count is 0 because of pseudo elements
		//Close site
		driver.quit();
	}
}
