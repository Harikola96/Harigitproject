package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test59Solution1
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.goindigo.in/"); 
		Thread.sleep(10000);
		//Collect all radio buttons
		List<WebElement> neighbors=driver.findElements(By.xpath("//span[@role='radio']"));
		System.out.println(neighbors.size());
		//Get count of visible radio buttons that have ::after pseudo-element
        int count = 0;
        for(WebElement neighbor:neighbors) 
        {
        	if(neighbor.isDisplayed())
        	{
        		String script="var elem=arguments[0];" +
        		//Check for the presence of the ::after pseudo-element by returning the after object
                        "var after=window.getComputedStyle(elem,'::after');" +
                        "return(after);";
                JavascriptExecutor js=(JavascriptExecutor) driver;
                Object afterObject=js.executeScript(script, neighbor);
                // Check if the after object has any styles applied
                if(afterObject!=null && !afterObject.toString().isEmpty()) {
                    count++;
        		}
            }
        }
        System.out.println("Count of radio buttons with ::after pseudo-element: " + count);
		//Close site
		driver.quit();
	}
}
