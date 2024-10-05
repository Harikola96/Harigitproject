package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test73 {
	public static void main(String[] args) throws Exception {
		// open browser and maximize
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("chrome://settings/");
	Thread.sleep(5000);
	WebElement host1=driver.findElement(By.tagName("settings-ui"));
	SearchContext root1=host1.getShadowRoot();
	WebElement host2=root1.findElement(By.id("toolbar"));
	SearchContext root2=host2.getShadowRoot();
	WebElement host3=root2.findElement(By.id("search"));
	SearchContext root3=host3.getShadowRoot();
	root3.findElement(By.id("searchInput")).sendKeys("abdul kalam sir");
	}
}
