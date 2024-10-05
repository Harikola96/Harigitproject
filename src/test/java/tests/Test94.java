package tests;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.CookiesUtility;
import Utilityclasses.WebSiteUtility;

public class Test94 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		WebSiteUtility.launchSite(driver, "http://www.amazon.in");
		Thread.sleep(5000);
		List<String> results1 = CookiesUtility.getCookiesDetailsList(driver);
		for (String result : results1) {
			System.out.println(result);
		}
		List<String> results2 = CookiesUtility.getCookiesTypes(driver, "amazon.in", "amazon.com");
		for (String result : results2)
		{
			System.out.println(result);
		}
		WebSiteUtility.closeSite(driver);
	}

}
