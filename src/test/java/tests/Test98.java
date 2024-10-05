package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.CookiesUtility;
import Utilityclasses.WebSiteUtility;

public class Test98 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		Thread.sleep(5000);
		System.out.println("cookies count after open browser");
		System.out.println("-------------------------------");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		System.out.println(CookiesUtility.getCookiesList(driver));
		List<String> types1 = CookiesUtility.getCookiesTypes(driver, "yahoomail.com", "yahoomail.co.in");
		for (String type : types1) {
			System.out.println(type);
		}
		WebSiteUtility.launchSite(driver, "http://www.yahoomail.com");
		System.out.println("cookies count after launch site");
		System.out.println("-------------------------------");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		System.out.println(CookiesUtility.getCookiesList(driver));
		List<String> types2 = CookiesUtility.getCookiesTypes(driver, "yahoomail.com", "yahoomail.co.in");
		for (String type : types2) {
			System.out.println(type);
		}
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-username")).sendKeys("harikrishna1439");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-passwd")).sendKeys("Hari@143");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println("cookies count after login");
		System.out.println("-------------------------------");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		System.out.println(CookiesUtility.getCookiesList(driver));
		List<String> types3 = CookiesUtility.getCookiesTypes(driver, "yahoomail.com", "yahoomail.co.in");
		for (String type : types3) {
			System.out.println(type);
		}
		driver.findElement(By.id("ybarAccountMenuOpener")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("profile-signout-link")).click();
		Thread.sleep(5000);
		System.out.println("cookies count after logout");
		System.out.println("-------------------------------");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		System.out.println(CookiesUtility.getCookiesList(driver));
		List<String> types4 = CookiesUtility.getCookiesTypes(driver, "yahoomail.com", "yahoomail.co.in");
		for (String type : types4) {
			System.out.println(type);
		}
	}
}
