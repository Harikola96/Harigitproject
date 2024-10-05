package tests;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test89 {
	public static void main(String[] args) throws Exception {
		// open chrome browser
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Duration d = driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(d.getSeconds());
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(300));
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.close();
	}
}
