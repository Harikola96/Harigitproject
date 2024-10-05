package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test40 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	List<WebElement> images=driver.findElements(By.xpath("//img"));
	System.out.println(images.size());
	int vc=0, hc=0;
	
	for(WebElement x:images) {
		if(x.isDisplayed())
		{
			vc++;
			System.out.println(vc+")." +x.getAttribute("src"));
		}
		else
			hc++;
	}
	System.out.println("displayed images " +vc);
	System.out.println("non displayed images " +hc);
	

	}
}
