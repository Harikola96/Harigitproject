package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class CacheLookupPage 
{
	//locators(properties)
	private WebDriver driver;
    private FluentWait<WebDriver> wait;  
	@FindBy(linkText="Gmail") private WebElement mylink1;
	@FindBy(linkText="Gmail") @CacheLookup private WebElement mylink2;
	//public constructor method
	public CacheLookupPage(WebDriver driver, FluentWait<WebDriver> wait)
	{
		this.driver=driver;
        this.wait=wait;
        PageFactory.initElements(driver, this); //For lazy initialization
	}
	//general methods
	public long getTimeWithoutCacheLookup()
	{
		long x=System.currentTimeMillis();
		for(int i=1;i<=100;i++)
		{
			wait.until(visibilityOf(mylink1)).getText();
		}
		long y=System.currentTimeMillis();
		return((y-x)/1000);
	}
	
	public long getTimeWithCacheLookup()
	{
		long x=System.currentTimeMillis();
		for(int i=1;i<=100;i++)
		{
			wait.until(visibilityOf(mylink2)).getText();
		}
		long y=System.currentTimeMillis();
		return((y-x)/1000);
	}
}
