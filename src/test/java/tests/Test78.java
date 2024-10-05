		package tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test78 {
	public static void main(String[] args) throws Exception {
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
	Thread.sleep(5000);
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.linkText("Visit W3Schools.com!")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	Set<String> s=driver.getWindowHandles();
	List<String> l=new ArrayList<>(s);
	driver.switchTo().window(l.get(1));
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[@aria-label='Login to your account'])")).click();
	Thread.sleep(5000);
	driver.switchTo().window(l.get(0));
	driver.findElement(By.id("getwebsitebtn")).click();
	Thread.sleep(5000);
	s=driver.getWindowHandles();
	l=new ArrayList<>(s);
	driver.switchTo().window(l.get(2));
	driver.findElement(By.xpath("(//a[@title='Login to your account'])")).click();
	Thread.sleep(5000);
	driver.switchTo().window(l.get(0));
	}
}
