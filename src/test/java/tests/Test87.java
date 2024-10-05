package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test87 {
	public static void main(String[] args) throws Exception {
		// Open initial browser window
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.name("fname")).clear();
		driver.findElement(By.name("fname")).sendKeys("abdul");
		driver.findElement(By.id("lname")).clear();
		driver.findElement(By.id("lname")).sendKeys("kalam sir");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().defaultContent();
	}
}