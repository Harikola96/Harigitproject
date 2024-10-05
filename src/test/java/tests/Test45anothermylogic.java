package tests;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test45anothermylogic {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter for product");
		String pro=sc.nextLine();
		sc.close();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys(pro);
		driver.findElement(By.xpath("//input[@type='submit']"));
		Thread.sleep(5000);
		List<WebElement> Elements=driver.findElements(By.xpath("//*"));
		System.out.println(Elements.size());
		int vc=0;
		for(WebElement element:Elements)
		{
			if(element.isDisplayed())
			{
				vc++;
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].style.border='2px red dotted';", element);
			}
		}
		System.out.println("count of visible elements in first page "+vc);
		driver.close();
	}
}
//Result
//all count 3177
//count of visible elements in first page 1616
