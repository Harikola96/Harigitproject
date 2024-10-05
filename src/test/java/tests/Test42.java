package tests;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test42 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Set<String> colors = new HashSet<String>();
		List<WebElement> allimages = driver.findElements(By.xpath("//*"));
		for (WebElement image : allimages) {
			String backgroundColor = image.getCssValue("background-color");
			colors.add(backgroundColor);

			String color = image.getCssValue("color");
			colors.add(color);
		}
		System.out.println("Total count of used colors in web page is " + colors.size());

		for (String color : colors) {
			System.out.println(color);
		}
	
	}
}
