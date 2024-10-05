package tests;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test50 {

	public static void main(String[] args) throws Exception {

		// Get product type to search from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product");
		String pro = sc.next();
		sc.close();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//span[@role='button']")).click();
		} catch (Exception ex) {
			System.out.println("Banner does not exists");
		}
		driver.findElement(By.name("q")).sendKeys(pro);
		driver.findElement(By.xpath("//button[starts-with(@title, 'Search for Products')]")).click();
		Thread.sleep(3000);
		int trc = 0;
		int pn = 2;
		while (true) {
			List<WebElement> results = driver.findElements(By.xpath("//div[contains(@data-tkid, 'SEARCH')]"));
			int prc = results.size();
			trc = trc + prc;
			try {
				driver.findElement(By.linkText("" + pn)).click();
				Thread.sleep(3000);
				pn++;
			} catch (Exception ex) {
				break;
			}

		}
	System.out.println("Total number of results "+trc);

	}
}
