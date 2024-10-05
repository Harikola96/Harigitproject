package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

public class Test135
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://www.google.co.in");
		//Locate element
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(
				                                    By.xpath("//div[@jsname='RNNXgb']")));
		//get details before focus
		String x=e.getCssValue("box-shadow"); //no shadow
		System.out.println(x);
		//get focus
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
		Thread.sleep(5000);
		//get details after focus
		String y=e.getCssValue("box-shadow"); //shadow exists
		System.out.println(y);
		//if(!y.contains("none"))
		if(x==y)
		{
			System.out.println("Test passed because of shadow exists for that element");
		}
		else
		{
			System.out.println("Test failed due to shadow does not exist for that element");
		}
		//close site
		closeSite(driver);
	}
}