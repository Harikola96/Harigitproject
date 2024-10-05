package tests;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test53 {
	public static void main(String[] args) throws Exception {
		// Get product type to search from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter innings 1 or 2");
		int in = sc.nextInt();
		sc.close();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/87878/rsa-vs-ind-final-icc-mens-t20-world-cup-2024");
		Thread.sleep(5000);
		List<WebElement> dnbl = driver.findElements(By.xpath("//div[contains(@id, 'innings_" + in
				+ "')]//*[contains(text(), 'Did not Bat')]/following-sibling::div/a"));
		for (WebElement dnbn : dnbl) {
			System.out.println(dnbn.getText());
		}
		// driver.quit();
	}
}
