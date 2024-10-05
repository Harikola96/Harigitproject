package pages;

import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.WebSiteUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class LoginPage
{
	//Rule-1: elements locators as private properties including "driver" and "wait" objects
	private WebDriver driver;
    private FluentWait<WebDriver> wait;  
    @FindBy(id="login_field") private WebElement usernameField;
    @FindBy(id="password") private WebElement passwordField;
    @FindBy(xpath="//input[@value='Sign in']") private WebElement loginButton;
    @FindBy(xpath="//div[@role='alert']") private WebElement errorMsg;
    
    //Rule-2: public constructor method with "driver" and "wait" objects as arguments
    public LoginPage(WebDriver driver, FluentWait<WebDriver> wait) 
    {
        this.driver=driver;
        this.wait=wait;
        PageFactory.initElements(driver, this); //For lazy initialization
    }     
    
    //Rule-3: public methods for operations on elements
    public void enterUsername(String username) 
    {
        wait.until(visibilityOf(usernameField));
        usernameField.clear();
        usernameField.sendKeys(username);
    }
    public void enterPassword(String password) 
    {
        wait.until(visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void clickLoginButton() 
    {
        wait.until(elementToBeClickable(loginButton)).click();
    }
    
    //Rule-4: public methods for observe elements
    public boolean isErrorMsgDisplayed() 
    {
    	try
    	{
    		Pattern p=Pattern.compile("Incorrect username or password");
    		By b=WebSiteUtility.getByFromWebElement(errorMsg);
		    wait.until(textMatches(b,p));
		    return(true);
    	}
    	catch(TimeoutException ex)
    	{
    		return(false);
    	}
    }
}



