package tests;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test92 {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Set<Cookie> cs = driver.manage().getCookies();
		int cc = cs.size();
		System.out.println(cc);
	}
}
