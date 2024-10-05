package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleclass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys(args);
	}

}
