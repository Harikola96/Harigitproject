package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.CookiesUtility;
import Utilityclasses.WebSiteUtility;

public class Test99samebrowser {

	public static void main(String[] args) throws Exception {
		WebDriver driver1 = WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver1);
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebSiteUtility.launchSite(driver1, "http://www.yahoomail.com");
		driver1.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("login-username")).sendKeys("harikrishna1439");
		driver1.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("login-passwd")).sendKeys("Hari@143");
		driver1.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		List<Cookie> cl = CookiesUtility.getCookiesList(driver1);

		WebDriver driver2 = WebSiteUtility.openBrowser("firefox");
		for (Cookie c : cl) {
			try {
				driver2.manage().addCookie(c);
			} catch (Exception Ex) {

			}
		}
		WebSiteUtility.launchSite(driver2, "http://www.yahoomail.com");
		Thread.sleep(5000);
		try {
			if (driver2.findElement(By.xpath("//a[@aria-label='Compose']")).isDisplayed()) {
				System.out.print("Yahoo Login Session cookie is working for different type browsers");
			}
			driver2.findElement(By.id("ybarAccountMenuOpener")).click();
			Thread.sleep(5000);
			driver2.findElement(By.id("profile-signout-link")).click();
			Thread.sleep(5000);
		} catch (Exception Ex) {
			System.out.print("Yahoo Login Session cookie is not working for different type browsers");

		}
		driver2.close();
		driver1.findElement(By.id("ybarAccountMenuOpener")).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("profile-signout-link")).click();
		Thread.sleep(5000);
		driver1.close();
	}

}
