package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test83 {
	public static void main(String[] args) throws Exception {
		// Open initial browser window
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Launch google site
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		// Create new tab
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);
		Set<String> s = driver.getWindowHandles();
		List<String> l = new ArrayList<>(s);
		driver.switchTo().window(l.get(1));
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);
		s = driver.getWindowHandles();
		l = new ArrayList<>(s);
		driver.switchTo().window(l.get(2));
		driver.get("http://www.yahoomail.com");
		Thread.sleep(5000);

	}
}