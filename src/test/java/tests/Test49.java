package tests;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test49 {

	public static void main(String[] args) throws Exception {
  
		// Get product type to search from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Search for a product");
		String pro = sc.nextLine();
		sc.close();
				
		WebDriver driver = new ChromeDriver();
			   
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		try {
	 
   
			driver.findElement(By.xpath("//span[@role='button']")).click();
   
		} catch (Exception ex) {
   
			System.out.println("No Banner exists");
		}
						
		driver.findElement(By.name("q")).sendKeys(pro, Keys.ENTER);
		Thread.sleep(5000);
									
		int trc = 0;
		while (true) {
   
									
			List<WebElement> results = driver.findElements(By.xpath(
					"//div[contains(@data-tkid, 'SEARCH')]"));
																		 
			int cprc = results.size();
			trc = trc + cprc;
			try {
	  
	
				driver.findElement(By.xpath("//span[text()='Next']/parent::a")).click();
				Thread.sleep(5000);
	
			} catch (Exception ex) {
	
				break;
			}
		}
		System.out.println("count of all results in all pages is "+trc);
			  }
}
