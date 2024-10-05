package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test29 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.name("fname")).sendKeys("abdul");
		driver.findElement(By.name("lname")).sendKeys("kalam");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value=Submit'][3]")).click();
		Thread.sleep(3000);
		//"InvalidSelectorException" in above statement because our xpath is in wrong syntax


	}

}
