package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.WebSiteUtility;

public class Test103 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> w = WebSiteUtility.defineExplicitWait(driver, 20, 1000);
		WebSiteUtility.launchSite(driver, "https://www.facebook.com");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys("abdulkalam");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass"))).sendKeys("abdulkalam");
		w.until(ExpectedConditions.elementToBeClickable(By.name("login"))).click();
		try {
			w.until(ExpectedConditions.textToBe(By.name("tryanotherway"), "Try another way"));
			System.out.println("Test passed");
			w.until(ExpectedConditions.elementToBeClickable(By.name("tryanotherway"))).click();
		} catch (TimeoutException e) {
			System.out.println("Test Failed");
		}
		//WebSiteUtility.closeSite(driver);
	}
}
