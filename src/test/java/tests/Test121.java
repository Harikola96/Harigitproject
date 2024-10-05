package tests;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.WebSiteUtility;

public class Test121 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait = WebSiteUtility.defineExplicitWait(driver, 30, 1000);
		WebSiteUtility.launchSite(driver, "https://www.facebook.com/");
		wait.until(visibilityOfElementLocated(By.name("email"))).sendKeys("abdul");
		wait.until(visibilityOfElementLocated(By.name("email"))).sendKeys(Keys.TAB, "kalam", Keys.TAB, Keys.TAB,
				Keys.ENTER);
	}
}
