package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GoogleSearchPage 
{
	//Rule-1: Element locators as private properties including "driver" and "wait" objects
	private WebDriver driver;
	private FluentWait<WebDriver> wait;
	@FindBy(name="q") private WebElement searchBox;
	@FindBy(xpath="(//ul[@role='listbox'])[1]/li") private List<WebElement> autosuggestions;
	//Rule-2: public constructor method with "driver" and "wait" objects as arguments
	public GoogleSearchPage(WebDriver driver, FluentWait<WebDriver> wait)
	{
		this.driver=driver;
		this.wait=wait;
		PageFactory.initElements(driver,this); //to initialize elements
	}
	//Rule-3: public methods for operations on elements
	public void fillSearchBoxAndSubmit(String value)
	{
		wait.until(visibilityOf(searchBox)).sendKeys(value,Keys.ENTER);
	}
	public int getCountOfAutoSuggestions(String value)
	{
		wait.until(visibilityOf(searchBox)).sendKeys(value);
		wait.until(visibilityOfAllElements(autosuggestions));
		return(autosuggestions.size());
	}
	public List<String> getAutoSuggestionsText(String value)
	{
		wait.until(visibilityOf(searchBox)).sendKeys(value);
		wait.until(visibilityOfAllElements(autosuggestions));
		List<String> l=new ArrayList<String>();
		for(WebElement autosuggestion:autosuggestions)
		{
			l.add(autosuggestion.findElement(By.xpath("descendant::span[1]")).getText());
		}
		return(l);
	}
	public void selectAnAutoSuggestion(String value, String expectedsuggestion)
	{
		wait.until(visibilityOf(searchBox)).sendKeys(value);
		wait.until(visibilityOfAllElements(autosuggestions));
		int flag=0;
		for(WebElement autosuggestion:autosuggestions)
		{
			String temp=autosuggestion.findElement(By.xpath("descendant::span[1]")).getText();
			if(temp.equalsIgnoreCase(expectedsuggestion) || temp.contains(expectedsuggestion))
			{
				autosuggestion.click();
				flag=1;
			}
		}
		if(flag==0)
		{
			throw new RuntimeException("Given expected suggestion does not found in cache");
		}
	}
	//Rule-4: public methods for observe elements
	public boolean verifySearchBoxMaxLength(long expected)
	{
		String temp=wait.until(visibilityOf(searchBox)).getAttribute("maxlength");
		long actual=Long.parseLong(temp);
		if(expected==actual)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	public boolean isGivenAutoSuggestionExists(String value, String expectedsuggestion)
	{
		wait.until(visibilityOf(searchBox)).sendKeys(value);
		wait.until(visibilityOfAllElements(autosuggestions));
		int flag=0;
		for(WebElement autosuggestion:autosuggestions)
		{
			String temp=autosuggestion.findElement(By.xpath("descendant::span[1]")).getText();
			if(temp.equalsIgnoreCase(expectedsuggestion) || temp.contains(expectedsuggestion))
			{
				autosuggestion.click();
				flag=1;
			}
		}
		if(flag==0)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
}
