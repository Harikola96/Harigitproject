package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test28 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/");
		Thread.sleep(5000);
		driver.findElement(By.id("searchInput")).sendKeys("kalam");
		Thread.sleep(3000);
		//"NoSuchElementException" in above statement because our element is under shadow-root

	}

}
