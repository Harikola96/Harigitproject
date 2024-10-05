package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test72 {
	public static void main(String[] args) throws Exception {
		// open browser and maximize
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Launch site
		driver.get("http://www.efuma.com");
		Thread.sleep(10000);
		// close cookies dialog if exists
		try {
			driver.findElement(By.xpath("//button[text()='Accept Cookies']")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("No cookies dailog");
		}
		try {
			WebElement shadowhost = driver.findElement(By.id("popupsmart-container-31292"));
			SearchContext shadowroot = (SearchContext) shadowhost.getShadowRoot();
			WebElement targetelement = shadowroot.findElement(By.id("close-button-cqwl1eh44e80"));
			targetelement.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("No Banner");
		}
	}
}
