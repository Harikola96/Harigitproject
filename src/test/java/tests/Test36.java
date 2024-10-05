package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test36 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> l = driver.findElements(By.xpath("//*"));
		System.out.println(l.size());

	}
}
