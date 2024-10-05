package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.WebSiteUtility;

public class Test104
{
	public static void main(String[] args)
	{
		//open browser
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		//Define wait object to sync our code and Browser
		FluentWait<WebDriver> wait=WebSiteUtility.defineExplicitWait(driver, 40, 1000);
		//launch site
		WebSiteUtility.launchSite(driver,"https://my.aidaform.com/signup");
		wait.until(ExpectedConditions.urlContains("https"));
		//fill page
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("nickname")))
		                                                                  .sendKeys("abdul");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")))
																     .sendKeys("apj@abdulkalam.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")))
														            .sendKeys("Apj@143sir");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("confirm")))
		                                                                  .sendKeys("Apj@143sir");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='svg'])[last()]")))
		                                                                   .click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				                             "//button[text()='Create My Free Account']"))).click();
	}
}
