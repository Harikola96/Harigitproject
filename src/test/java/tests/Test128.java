 package tests;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

public class Test128
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,
				     "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		//"JavscriptException" or "InvalidElementStateException" because 
		//we try to clear a disabled element
		wait.until(frameToBeAvailableAndSwitchToIt("iframeResult"));
		driver.findElement(By.name("lname")).clear();
	}
}
