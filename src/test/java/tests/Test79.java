package tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test79 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[starts-with(@aria-label, 'Beauty')]")).click();
		driver.findElement(By.xpath("//a[text()='View All'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slAVV4']")).click();
		Thread.sleep(2000);
		List<WebElement> all=driver.findElements(By.xpath("//div[contains(@data-tkid, 'SEARCH')]/a[1]"));
		for(int i=0;i<all.size();i++)
		{
		all.get(i).click();
		Thread.sleep(2000);
		Set<String> s=driver.getWindowHandles();
		List<String> l=new ArrayList<>(s);
		driver.switchTo().window(l.get(1));
		String x=driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']")).getText();
		Thread.sleep(2000);
		x=x.substring(1);
		x=x.replace(",","");
		System.out.println(x);
		//close that newly opened browser window/tab
		driver.close();
		//back to previous page
		driver.switchTo().window(l.get(0));
		Thread.sleep(5000);
		}

	}
}
