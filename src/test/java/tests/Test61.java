package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test61 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.name("fname")).clear();
		driver.findElement(By.name("fname")).sendKeys("abdul");
		Thread.sleep(5000);
		driver.findElement(By.name("lname")).clear();
		driver.findElement(By.name("lname")).sendKeys("kalam sir");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().defaultContent();
		//driver.close();

	}

}
