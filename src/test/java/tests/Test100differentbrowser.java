package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.WebSiteUtility;

public class Test100differentbrowser {

	public static void main(String[] args) throws Exception {
		WebDriver driver = WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebSiteUtility.launchSite(driver, "http://www.yahoomail.com");
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-username")).sendKeys("harikrishna1439");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-passwd")).sendKeys("Hari@143");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		BrowserWindowUtility.getNewWindoworTab(driver, "tab");
		List<String> whs = BrowserWindowUtility.getAllBrowserWindowHandlesList(driver);
		BrowserWindowUtility.switchToDesiredBrowser(driver, whs.get(1));
		WebSiteUtility.launchSite(driver, "http://www.yahoomail.com");
		Thread.sleep(5000);
		try {
			if (driver.findElement(By.xpath("//a[@aria-label='Compose']")).isDisplayed())
				;
			{
				System.out.println("Yahoo Login Session cookie is working for same type browser");
			}
		} catch (Exception Ex) {
			System.out.println("Yahoo Login Session cookie is not working for same type browser");
		}
		driver.findElement(By.id("ybarAccountMenuOpener")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("profile-signout-link")).click();
		Thread.sleep(5000);
		BrowserWindowUtility.switchToDesiredBrowser(driver, whs.get(0));
		driver.findElement(By.id("ybarAccountMenuOpener")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("profile-signout-link")).click();
		Thread.sleep(5000);
		driver.close();

	}
}
