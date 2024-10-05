package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test32 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.get("https://m.cricbuzz.com/live-cricket-scorecard/87878/rsa-vs-ind-final-icc-mens-t20-world-cup-2024");
	Thread.sleep(3000);
	String x=driver.findElement(By.xpath(
			"(//div[contains(@id,'scard') and contains(@id,'innings-1')]//div[@class='text-xs']/div[contains(@class,'scorecard-bat')])[1]/div[2]"))
		    .getText();
		System.out.println(x);

	}

}
