package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test55 {
	public static void main(String[] args) throws Exception {
		// Get product type to search from keyboard
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.aidaform.com/signup");
		Thread.sleep(5000);
		List<WebElement> l = driver.findElements(By.tagName("input"));
		System.out.println("Total numer of input elements " + l.size());
		int rbc = 0, cbc = 0, tbc = 0, fac = 0, rabc = 0, ubc = 0, bc = 0, sbc = 0, sebc = 0, pbc = 0, dc = 0, hec = 0;
		int others = 0;
		for (WebElement e : l) {
			String x = e.getAttribute("type");
			switch (x) {
			case "text":
				tbc++;
				break;
			case "radio":
				rbc++;
				break;
			case "checkbox":
				cbc++;
				break;
			case "file":
				fac++;
				break;
			case "range":
				rabc++;
				break;
			case "url":
				ubc++;
				break;
			case "button":
				bc++;
				break;
			case "submit":
				sbc++;
				break;
			case "search":
				sebc++;
				break;
			case "password":
				pbc++;
				break;
			case "date":
				dc++;
				break;
			default:
				others++;
				break;
			}
		}
		System.out.println("Text boxes count is " + tbc);
		System.out.println("Check boxes count is " + cbc);
		System.out.println("radio buttons count is " + rbc);
		System.out.println("file attachments count is " + fac);
		System.out.println("URL boxes count is " + ubc);
		System.out.println("Push buttons count is " + bc);
		System.out.println("Hidden elements count is " + hec);
		System.out.println("Submit buttons count is " + sbc);
		System.out.println("Password boxes count is " + pbc);
		System.out.println("Search boxes count is " + sebc);
		System.out.println("Range boxes count is " + rabc);
		System.out.println("Date boxes count is " + dc);
		System.out.println("Others count is " + others);

	}
}
