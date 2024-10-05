package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.WebSiteUtility;

public class Test111 {
	public static void main(String[] args) throws Exception {
		// Open browser, Define wait object, and launch site
		WebDriver driver = WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait = WebSiteUtility.defineExplicitWait(driver, 40, 1000);
		WebSiteUtility.launchSite(driver, "http://www.gmail.com");
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
		e.sendKeys("magnitiait");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']/parent::button"))).click();
		Thread.sleep(5000);
		wait.until(visibilityOfElementLocated(By.xpath("//a[@aria-label='Try again']")));
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		if (wait.until(stalenessOf(e))) {
			e = wait.until(refreshed(visibilityOfElementLocated(By.name("identifier"))));
		}
		e.clear();
		e.sendKeys("abdulkalam");
	}
}
