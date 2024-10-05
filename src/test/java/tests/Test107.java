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

public class Test107 {
	public static void main(String[] args) throws Exception {
		// Open browser, Define wait object, and launch site
		WebDriver driver = openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait = defineExplicitWait(driver, 40, 1000);
		launchSite(driver, "https://www.google.co.in");
		ExpectedCondition<WebElement> ec1 = elementToBeClickable(By.name("q"));
		ExpectedCondition<WebElement> ec2 = elementToBeClickable(By.linkText("Gmail"));
		ExpectedCondition<Boolean> ec3 = titleIs("Google");
		ExpectedCondition<Boolean> ec4 = urlContains("https");
		closeSite(driver);
	}
}
