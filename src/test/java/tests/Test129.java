 package tests;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

public class Test129
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
	launchSite(driver, "https://www.flipkart.com");
	wait.until(visibilityOfElementLocated(By.name("q"))).sendKeys("mobiles");
	//wait.until(visibilityOfElementLocated(By.name("q"))).clear();
	wait.until(visibilityOfElementLocated(By.name("q"))).sendKeys(Keys.chord(Keys.CONTROL,"a"),
			Keys.BACK_SPACE,Keys.ESCAPE);
	}
}



