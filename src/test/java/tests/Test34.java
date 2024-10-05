package tests;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test34 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter innings 1 or 2");
		int inum = sc.nextInt();
		System.out.println("Enter batters 1 or 2 or...");
		int bnum = sc.nextInt();
		sc.close();
		WebDriver driver = new ChromeDriver();
		driver.get("https://m.cricbuzz.com/live-cricket-scorecard/87878/rsa-vs-ind-final-icc-mens-t20-world-cup-2024");
		try {
			String x = driver
					.findElement(By.xpath(
							"(//div[contains(@id,'scard') and contains(@id,'innings-" + inum
							+ "')]//div[@class='text-xs']/div[contains(@class,'scorecard-bat')])[" + bnum + "]/div[2]"))
					.getText();

		}
		catch(NoSuchElementException x)  {
			System.out.println("No given innings or No given batters found in page source");
		}

	}

}
