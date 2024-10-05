package tests;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

public class Test122 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait = defineExplicitWait(driver, 30, 1000);
		launchSite(driver, "http://www.facebook.com");
		wait.until(visibilityOfElementLocated(By.name("email"))).sendKeys("abdulkalam",Keys.chord(Keys.CONTROL,"a", Keys.chord(Keys.CONTROL,"c")));
		wait.until(visibilityOfElementLocated(By.name("pass"))).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}
}
/*
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

public class Test122
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"http://www.facebook.com");
		//fill fields
		wait.until(visibilityOfElementLocated(By.name("email"))).sendKeys("abdulkalam",
																	Keys.chord(Keys.CONTROL,"a"),
																	Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(5000);
		wait.until(visibilityOfElementLocated(By.name("pass")))
											.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
	}

}
*/