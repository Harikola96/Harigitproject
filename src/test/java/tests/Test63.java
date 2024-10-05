package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test63 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_file");
		Thread.sleep(5000);
		WebElement fe = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(fe);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='file']"))
				.sendKeys("C:\\Users\\91996\\Pictures\\Saved Pictures\\IMG_4849.jpg");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
	}

}
