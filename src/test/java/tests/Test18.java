package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	Thread.sleep(5000);
	driver.get("https://www.google.co.in/");
	Thread.sleep(5000);
	String s=driver.getPageSource();
	System.out.println("page source is:");
	System.out.println(s);
	}

}
