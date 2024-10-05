package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test59 {
	public static void main(String[] args) throws Exception {
		// Get product type to search from keyboard
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		Thread.sleep(5000);
		List<WebElement> l = driver.findElements(By.xpath("//input[@type='radio']"));
		int count = 0;
		for (WebElement e : l) {
			if (e.isDisplayed()) {
				count++;
			}
			System.out.println(count);
		}
	}
}
