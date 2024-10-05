package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://httpforever.com/");
		Thread.sleep(5000);
		String u = driver.getCurrentUrl();
		if (u.startsWith("https")) {
			System.out.println("secured site");
		} else {
			System.out.println("unsecured site");
		}

	}
}
