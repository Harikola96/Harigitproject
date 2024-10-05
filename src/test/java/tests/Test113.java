package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import java.util.regex.Pattern;

import org.openqa.selenium.support.ui.FluentWait;

import static Utilityclasses.WebSiteUtility.*;
import static Utilityclasses.BrowserWindowUtility.*;

public class Test113 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.logfile", "target\\TestLog1.txt");
		// Open browser, Define wait object, and launch site
		WebDriver driver = openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait = defineExplicitWait(driver, 30, 1000);
		launchSite(driver, "https://github.com/login");
		WebElement username = wait.until(visibilityOfElementLocated(By.id("login_field")));
		WebElement pass = wait.until(visibilityOfElementLocated(By.name("password")));
		WebElement sub = wait.until(elementToBeClickable(By.xpath("//input[@type='submit']")));
		username.sendKeys("Jessy");
		pass.sendKeys("143");
		sub.click();
		Pattern p = Pattern.compile("Incorrect username or password");
		wait.until(textMatches(By.xpath("//div[@role='alert']"), p));
		username.clear();
		username.sendKeys("kalamgit143");
		//pass.clear();
		pass.sendKeys("Magnitia@263264");
		sub.click();

	}
}