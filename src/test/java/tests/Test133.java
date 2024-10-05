package tests;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

public class Test133 {
	public static void main(String[] args) throws Exception {
		// Open browser, Define wait object, and launch site
		WebDriver driver = openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait = defineExplicitWait(driver, 30, 1000);
		launchSite(driver, "https://www.gmail.com");
		WebElement e = wait.until(visibilityOfElementLocated(By.xpath("//button[text()='Forgot email?']")));
		String x = e.getAttribute("type");
		System.out.println(x);
		String y = e.getCssValue("color");
		System.out.println(y);
		closeSite(driver);
	}
}