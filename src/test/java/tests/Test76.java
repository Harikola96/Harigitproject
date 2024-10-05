package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test76 {
	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/oprweb/test.jsp?filename=javascript-alert1");
		Thread.sleep(5000);
		driver.switchTo().frame("iframewrapper");
		driver.findElement(By.xpath("//input[@value='Click me']")).click();
		Thread.sleep(5000);
		Alert al = driver.switchTo().alert();
		String x = al.getText();
		System.out.println(x);
		Thread.sleep(3000);
		al.accept();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();

	}
}
