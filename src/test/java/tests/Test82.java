package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test82 {
	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("abdulkalam", Keys.TAB);
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("batch267", Keys.TAB,Keys.TAB);
		Thread.sleep(5000);
		driver.switchTo().activeElement().click();
	}
}