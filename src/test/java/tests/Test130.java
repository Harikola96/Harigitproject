package tests;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

public class Test130 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://www.google.com");
		//Get Dev team given HTML attribute value from an element
		String x=wait.until(visibilityOfElementLocated(By.name("q"))).getDomAttribute("maxlength");
		System.out.println(x);
		String y=wait.until(visibilityOfElementLocated(By.name("q"))).getAttribute("maxlength");
		System.out.println(y);
		//Get Browser added property value from an element
		String z=wait.until(visibilityOfElementLocated(By.name("q"))).getDomProperty("disabled");
		System.out.println(z);
		//close site
		closeSite(driver);
	}
}
