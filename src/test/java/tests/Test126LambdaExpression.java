 package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.WebSiteUtility;

public class Test126LambdaExpression
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait=WebSiteUtility.defineExplicitWait(driver, 40, 1000);
		WebSiteUtility.launchSite(driver,"http://www.facebook.com");
		//Locate and operate elements
		WebElement uid=wait.until(
				(WebDriver d) -> {
									WebElement e=d.findElement(By.name("email"));
									String c=e.getAttribute("aria-label");
									return(c.contains("Email address") ? e : null);
								}
				);
		uid.sendKeys("abdulkalam");
	}
}

