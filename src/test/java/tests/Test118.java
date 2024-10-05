package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.WebSiteUtility;

public class Test118 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait=WebSiteUtility.defineExplicitWait(driver, 30, 1000);
		WebSiteUtility.launchSite(driver, "http://www.gmail.com");
		WebElement e=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='password']")));
        e.click();
	}
}
