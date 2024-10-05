package tests;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test91 {
	public static void main(String[] args) throws Exception {
		// open chrome browser
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Set<String> s=driver.manage().logs().getAvailableLogTypes();
		System.out.println(s);
		//get browser logs
		System.out.println("Browser logs:");
		LogEntries bl=driver.manage().logs().get("browser");
		for(LogEntry l:bl)
		{
			System.out.println(l.getMessage());
		}
		//browser driver software logs
		LogEntries dl=driver.manage().logs().get("driver");
		for(LogEntry l:dl)
		{
			System.out.println(l.getMessage());
		}
		//
		LogEntries cl=driver.manage().logs().get("client");
		for(LogEntry l:cl)
		{
			System.out.println(l.getMessage());
		}
		
		
	}
}
