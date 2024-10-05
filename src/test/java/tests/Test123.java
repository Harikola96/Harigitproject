package tests;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

public class Test123
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"http://www.gmail.com"); 
		//Challenge-1: element found in Page source but not present on page.
		//So, we get "ElementNotInteractableException" when we fill that hidden element.
		wait.until(presenceOfElementLocated(By.name("hiddenPassword"))).sendKeys("abdulkalam");
	}
}
