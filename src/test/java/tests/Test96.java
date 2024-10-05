package tests;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.CookiesUtility;
import Utilityclasses.WebSiteUtility;

public class Test96 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		Thread.sleep(5000);
		System.out.println("cookies after open browser");
		System.out.println("--------------------------");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		WebSiteUtility.launchSite(driver, "http://www.facebook.com");
		Thread.sleep(5000);
		System.out.println("cookies after launchsite");
		System.out.println("--------------------------");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		List<String> details = CookiesUtility.getCookiesDetailsList(driver);
		for (String detail : details) {
			System.out.println(detail);
		}
		List<String> types = CookiesUtility.getCookiesTypes(driver, "facebook.com", null);
		for (String type : types) {
			System.out.println(type);
		}
		WebSiteUtility.closeSite(driver);
	}

}
