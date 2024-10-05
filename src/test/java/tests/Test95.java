package tests;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.CookiesUtility;
import Utilityclasses.WebSiteUtility;

public class Test95 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=WebSiteUtility.openBrowser("edge");
		BrowserWindowUtility.browserMaximize(driver);
		WebSiteUtility.launchSite(driver, "http://www.flipkart.com");
		Thread.sleep(5000);
		List<String> results1=CookiesUtility.getCookiesDetailsList(driver);
		for(String resut:results1)
		{
			System.out.println(resut);
		}
		List<String> results2=CookiesUtility.getCookiesTypes(driver, "flipkart.com", null);
		for(String result:results2)
		{
			System.out.println(result);
		}
	}

}
