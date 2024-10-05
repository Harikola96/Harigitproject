package tests;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

public class Test132 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_test");
		wait.until(frameToBeAvailableAndSwitchToIt("iframeResult"));
		//Get accessible name of an element, which developed using HTML without ARIA
		String x=wait.until(visibilityOfElementLocated(By.xpath("//*[@type='button']")))
				                                                              .getAccessibleName();
		System.out.println(x);
		//Get aria role of an element
		String y=wait.until(visibilityOfElementLocated(By.xpath("//*[@type='button']")))
				                                                              .getAriaRole();
		System.out.println(y);
		String z=wait.until(visibilityOfElementLocated(By.xpath("//*[@type='button']"))).getTagName();
		System.out.println(z);
		//close site
		closeSite(driver);
	}
}