package tests;

import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;

public class Test106 {
	public static void main(String[] args) throws Exception {
		// Open browser, Define wait object, and launch site
		WebDriver driver = openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait = defineExplicitWait(driver, 40, 1000);
		launchSite(driver, "http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/\"\r\n"
				+ "				                                      +\"explicit-show-hide/defaultcs.aspx");
		WebElement e = wait.until(visibilityOfElementLocated(By.xpath("//*[contains(@class, 'RadCalendar_Silk')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView;", e);
		wait.until(elementToBeClickable(By.linkText("22"))).click();
		wait.until(visibilityOfElementLocated(By.className("raDiv")));
		wait.until(visibilityOfElementLocated(By.className("raDiv")));
		closeSite(driver);
	}
}
