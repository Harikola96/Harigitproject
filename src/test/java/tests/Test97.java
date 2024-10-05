package tests;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utilityclasses.BrowserWindowUtility;
import Utilityclasses.CookiesUtility;
import Utilityclasses.WebSiteUtility;

public class Test97 {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter a word in search");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		WebDriver driver = WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		Thread.sleep(5000);
		System.out.println("cookies count after open browser");
		System.out.println("--------------------------------");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		WebSiteUtility.launchSite(driver, "https://www.google.co.in/");
		Thread.sleep(5000);
		System.out.println("cookies count after launch site");
		System.out.println("--------------------------------");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		System.out.println(CookiesUtility.getCookiesDetailsList(driver));
		List<String> types1 = CookiesUtility.getCookiesTypes(driver, "google.co.in", "google.com");
		for (String type : types1) {
			System.out.println(type);
		}
		driver.findElement(By.name("q")).sendKeys(word, Keys.ENTER);
		Thread.sleep(5000);
		System.out.println("cookies count after search word");
		System.out.println("--------------------------------");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		System.out.println(CookiesUtility.getCookiesDetailsList(driver));
		List<String> types2 = CookiesUtility.getCookiesTypes(driver, "google.co.in", "google.com");
		for (String type : types2) {
			System.out.println(type);
		}
		WebSiteUtility.closeSite(driver);
	}

}
