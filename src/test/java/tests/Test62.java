package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test62 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		String x = driver.findElement(By.tagName("p")).getText();
		System.out.println(x);
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.close();

	}

}
