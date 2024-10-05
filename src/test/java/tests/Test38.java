package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test38 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> l1 = driver.findElements(By.xpath("//img"));
		List<WebElement> l2 = driver.findElements(By.xpath("//span"));
		List<WebElement> l3 = driver.findElements(By.xpath("//div"));
		System.out.println(l1.size());
		System.out.println(l2.size());
		System.out.println(l3.size());

	}
}
