package tests;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test51 {
	public static void main(String[] args) throws Exception {
		// Get product type to search from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Innings 1 or 2");
		int in=sc.nextInt();
		sc.close();
		WebDriver driver=new ChromeDriver();
		driver.get("https://m.cricbuzz.com/live-cricket-scorecard/87878/rsa-vs-ind-final-icc-mens-t20-world-cup-2024");
	Thread.sleep(5000);
	List<WebElement> nobl=driver.findElements(By.xpath("//div[contains(@id, 'innings-"+in+"')]//*[text()='not out']"));
	for(WebElement nob:nobl)
	{
		String nobn=nob.findElement(By.xpath("preceding-sibling::a[1]")).getText();
		String nobr=nob.findElement(By.xpath("following::div[1]")).getText();
		 System.out.println(nobn+" did "+nobr);
	}
	
	}
}
