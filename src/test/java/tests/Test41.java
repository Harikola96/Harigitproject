package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test41 {

	public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.amazon.in");
	List<WebElement> allimages=driver.findElements(By.xpath("//*"));
	System.out.println(allimages.size());
	List<WebElement> vimages=new ArrayList<WebElement>();

	for(WebElement image:allimages) {
		if(image.isDisplayed())
		{
			vimages.add(image);
		}
		
	}
	System.out.println(vimages.size());
	for(WebElement vimage:vimages)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='2px green solid';", vimage);
	}
	
	

	}
}
