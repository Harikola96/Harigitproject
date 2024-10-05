package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	Thread.sleep(5000);
	String s=driver.getWindowHandle();
	System.out.println(s);
	}
}
