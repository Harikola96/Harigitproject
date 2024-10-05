package tests;

import static org.openqa.selenium.support.ui.ExpectedConditions.and;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
import static org.openqa.selenium.support.ui.ExpectedConditions.urlContains;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

public class Test105 {
	public static void main(String[] args) throws Exception {
		// Open browser, Define wait object, and launch site
		WebDriver driver = openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait = defineExplicitWait(driver, 40, 1000);
		launchSite(driver, "http://www.gmail.com");
		// waiting for home page
		ExpectedCondition<Boolean> ec1 = titleIs("Gmail");
		ExpectedCondition<Boolean> ec2 = urlContains("https");
		wait.until(and(ec1, ec2));
		// Do login and then close site
		wait.until(visibilityOfElementLocated(By.name("identifier"))).sendKeys("magnitiait");
		// wait.until(elementToBeClickable(
		// By.xpath("//*[text()='Next']/parent::*"))).click();
		wait.until(elementToBeClickable(By.xpath("//span[text()='Next']/parent::button"))).click();
		//button[@type='button'][3]
	}
}
