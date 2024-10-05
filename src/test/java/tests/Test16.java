package tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://my.aidaform.com/signup");
		Thread.sleep(3000);
		driver.findElement(By.name("nick name")).sendKeys("Hari");
		driver.findElement(By.name("email")).sendKeys("harikrishnakola5781@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Hari@143");
		driver.findElement(By.name("Confirm password")).sendKeys("Hari@143");
		driver.findElement(By.xpath(null));

	}

}
