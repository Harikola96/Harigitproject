package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://www.w3schools.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Try it Yourself")).click();
		Thread.sleep(5000);
		Set<String> s = driver.getWindowHandles();
		List<String> x = new ArrayList<String>(s);
		driver.switchTo().window(x.get(1));
		driver.close();
		driver.switchTo().window(x.get(0));
		// driver.close();
	}
}
