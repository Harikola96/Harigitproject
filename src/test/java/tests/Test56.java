package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test56 {
	public static void main(String[] args) throws Exception {
		// Get product type to search from keyboard
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.aidaform.com/signup");
		List<WebElement> l = driver.findElements(By.xpath("(//button)|(//input[@type='button' or @type='submit'])"));
		System.out.println(l.size());
		driver.close();
	}
}
