package tests;

import  org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.WebSiteUtility;



public class Test134 {
	public static void main(String[] args) throws Exception {
		// Open browser, Define wait object, and launch site
		WebDriver driver = WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait = WebSiteUtility.defineExplicitWait(driver, 30, 1000);
		WebSiteUtility.launchSite(driver, "https://www.google.co.in");
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		String x = e.getCssValue("text-decoration");
		System.out.println(x);
		Actions act = new Actions(driver);
		act.moveToElement(e).perform();
		Thread.sleep(5000);
		String y = e.getCssValue("text-decoration");
		System.out.println(y);
		if (y.contains("underline")) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed due to no underline");
		}
		WebSiteUtility.closeSite(driver);
	}
}