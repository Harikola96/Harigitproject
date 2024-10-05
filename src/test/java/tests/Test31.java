package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test31 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//*[contains(@id, 'name')]")).sendKeys("abdul");
		driver.findElement(By.name("lname")).sendKeys("kalam");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

}
