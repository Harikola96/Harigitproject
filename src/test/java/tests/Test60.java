package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test60 {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.aidaform.com/signup");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("(//img)|(//input[@type='image'])"));
		int count=0;
		for(WebElement e:l)
		{
		if(e.isDisplayed());
		{
			count++;
		}
		}
		System.out.println(count);

	}

}
