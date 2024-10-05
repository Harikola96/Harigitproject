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

public class Test109 {
	public static void main(String[] args) throws Exception {
		// Open browser, Define wait object, and launch site
		WebDriver driver = openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait = defineExplicitWait(driver, 40, 100);
		launchSite(driver, "https://www.google.co.in/");
		ExpectedCondition<Boolean> ec = invisibilityOfElementLocated(By.name("q"));
		wait.until(not(ec));
		closeSite(driver);

	}
}
