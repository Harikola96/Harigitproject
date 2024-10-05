package tests;

import java.util.ArrayList;
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

public class Test77 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToLocation(300, 400).perform();
		Thread.sleep(5000);
		driver.switchTo().frame("pact");
		WebElement shadowHostElement = driver.findElement(By.id("snacktime"));
		SearchContext shadowRootElement = shadowHostElement.getShadowRoot();
		WebElement targetElement = shadowRootElement.findElement(By.className("food"));
		try {
			targetElement.click();
			Thread.sleep(5000);
		} catch (JavascriptException ex) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", targetElement);
			Thread.sleep(5000);
		}
		Set<String> s = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		driver.findElement(By.xpath("(//a[text()='Courses'])[2]")).click();
		Thread.sleep(5000);
		s = driver.getWindowHandles();
		l = new ArrayList<String>(s);
		driver.switchTo().window(l.get(2));
		List<WebElement> courses = driver.findElements(By.xpath(
				"(//span[contains(text(), 'Watch on Udemy')])|(//span[contains(text(), 'View on')])|(//span[contains(text(), 'Online Live')])"));
		System.out.println(courses.size());
		driver.close();
		driver.switchTo().window(l.get(1));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(l.get(0));
		Thread.sleep(5000);
		driver.close();
	}
}
