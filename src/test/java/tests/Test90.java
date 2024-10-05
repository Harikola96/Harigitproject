package tests;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test90
{
	public static void main(String[] args) throws Exception
	{
		//open chrome browser
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//get default JavaScript code execution timeout
		Duration d=driver.manage().timeouts().getScriptTimeout();
		System.out.println(d.getSeconds()); //30 seconds
		//set JavaScript code execution timeout
		driver.manage().timeouts().scriptTimeout(Duration.ofMillis(3));
		//Launch site
        driver.get("https://www.gmail.com");
		WebElement e=driver.findElement(By.name("identifier"));
        ((RemoteWebDriver) driver).executeScript("arguments[0].style.border='5px red solid';",e);
	}
}
