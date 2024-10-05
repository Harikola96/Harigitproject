package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://www.w3schools.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Try it Yourself")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
