package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in/");
		Thread.sleep(3000);

		String u = driver.getCurrentUrl();
		if (u.startsWith("https"))
			System.out.println("secured");
		else
			System.out.println("Not secured");
		System.out.println("Hi Mahi");

		
		String sc="Hari";
		System.out.println(sc);
		driver.close();
		

	}

}
