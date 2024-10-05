package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;

import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

public class Test136 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait = defineExplicitWait(driver, 30, 1000);
		launchSite(driver, "https://www.gmail.com");
		WebElement e = wait.until(visibilityOfElementLocated(By.xpath("//button[text()='Forgot email?']")));
		String x1 = e.getCssValue("color");
		System.out.println(x1);
		String x2 = e.getCssValue("background-color");
		System.out.println(x2);
		Actions act = new Actions(driver);
		act.contextClick(e).perform();
		String y1 = e.getCssValue("color");
		System.out.println(y1);
		String y2 = e.getCssValue("background-color");
		System.out.println(y2);
		if(!x1.contains(y1)&& !x2.contains(y2))
		{
			System.out.println("Test passed because of changes after right click");
		}
		else
		{
			System.out.println("Test failed due to same after right click also");
		}
		closeSite(driver);
	}
}