package tests;

import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

public class Test110 {
	public static void main(String[] args) throws Exception {
		// Open browser, Define wait object, and launch site
		WebDriver driver = openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait = defineExplicitWait(driver, 40, 1000);
		launchSite(driver, "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		wait.until(titleIs("W3Schools Tryit Editor"));
		wait.until(frameToBeAvailableAndSwitchToIt("iframeResult"));
		wait.until(elementToBeClickable(By.tagName("button"))).click();
		System.out.println(wait.until(alertIsPresent()).getText());
		closeSite(driver);

	}
}
