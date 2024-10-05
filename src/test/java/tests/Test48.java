package tests;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test48 {
	public static void main(String[] args) throws Exception {
		// Get product type to search from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product");
		String pro = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(pro);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(5000);
		int trc = 0;
		int pn = 2;
		while (true) {
			List<WebElement> results = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
			int cprc = 0;
			for (WebElement result : results) {
				if (result.isDisplayed())
					;
				cprc++;
			}
			trc = trc + cprc;
			try {
				driver.findElement(By.xpath("//a[@aria-label='Go to next page " + pn + "']")).click();
				Thread.sleep(3000);
				pn++;
			} 
			catch (Exception ex) {
				break;
			}

		}
		System.out.println("count of all results in all pages is " + trc);
		System.out.println("count of all pages "+pn);
	}
}
