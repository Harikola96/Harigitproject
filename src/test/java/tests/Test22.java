package tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://www.w3schools.com");
		Thread.sleep(5000);
		By b=By.linkText("Try it Yourself");
		driver.findElement(b).click();
		Set<String> x=driver.getWindowHandles();
		System.out.println(x);
		//driver.close();
	}
}
