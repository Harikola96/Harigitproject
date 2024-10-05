package tests;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test86 {
	public static void main(String[] args) throws Exception {
		// Open initial browser window
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		int w = driver.manage().window().getSize().getWidth();
		int h = driver.manage().window().getSize().getHeight();
		System.out.println(w + "," + h);
		Dimension d = new Dimension(400, 200);
		driver.manage().window().setSize(d);
		int x = driver.manage().window().getPosition().getX();
		int y = driver.manage().window().getPosition().getY();
		System.out.println(x + "," + y);
		Point p = new Point(400, 200);
		driver.manage().window().setPosition(p);
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.close();

	}
}