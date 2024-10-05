package tests;

import pages.CacheLookupPage;
import static Utilityclasses.BrowserWindowUtility.*;
import static Utilityclasses.WebSiteUtility.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Test117 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.crome.logfile", "target\\\\TestLog4.txt");
		WebDriver driver = openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait = defineExplicitWait(driver, 30, 1000);
		launchSite(driver, "https://www.google.com");
		CacheLookupPage cp = new CacheLookupPage(driver, wait);
		System.out.println(cp.getTimeWithCacheLookup() + ".seconds");
		closeSite(driver);
	}
}
