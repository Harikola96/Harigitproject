package tests;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		URL u=new URL("http://www.gmail.com");
		driver.navigate().to(u);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
		
	}
}
