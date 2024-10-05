package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.WebSiteUtility;

public class Test120 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait = WebSiteUtility.defineExplicitWait(driver, 30, 1000);
		WebSiteUtility.launchSite(driver, "https://www.magnitia.com/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("About Us"))).click();
	}
}
