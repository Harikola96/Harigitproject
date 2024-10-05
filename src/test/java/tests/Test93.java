package tests;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test93 {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Set<Cookie> cs=driver.manage().getCookies();
		int cc=cs.size();
		System.out.println(cc);
		driver.get("http://www.yahoomail.com");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("harikrishna1439");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		cs=driver.manage().getCookies();
		cc=cs.size();
		System.out.println(cc);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hari@143");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		cs=driver.manage().getCookies();
		cc=cs.size();
		System.out.println(cc);
		driver.quit();
	}
}
