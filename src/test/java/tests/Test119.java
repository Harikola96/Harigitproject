package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.WebSiteUtility;

public class Test119 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait = WebSiteUtility.defineExplicitWait(driver, 30, 1000);
		WebSiteUtility.launchSite(driver, "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeResult"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lname")));
	}
}
