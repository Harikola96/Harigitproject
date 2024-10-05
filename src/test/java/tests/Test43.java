package tests;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test43 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Set<String> uniqueColors = new HashSet<>();
		List<WebElement> elements = driver.findElements(By.cssSelector("*"));
		String[] colorProperties = { "color", "background-color", "border-top-color", "border-right-color",
				"border-bottom-color", "border-left-color", "outline-color", "text-decoration-color",
				"column-rule-color", "caret-color", "box-shadow", "text-shadow" };
		for (WebElement element : elements) {
			for (String property : colorProperties) {
				String colorvalue = element.getCssValue(property);
				if (property.equals("box-shadow") || property.equals("text-shadow"))
				{
					if (colorvalue != null && !colorvalue.isEmpty()) {
						String[] shadowColors = colorvalue.split(",");
						for (String shadowColor : shadowColors)
						{
							String trimmedColor = shadowColor.trim();
							if (trimmedColor.matches("[r][g][b][a]?[(][.*][)]")) {
								uniqueColors.add(trimmedColor);
							}
						}

					}

				}
				else {
						if(colorvalue!=null && !colorvalue.isEmpty())
							uniqueColors.add(colorvalue);
				}
			}
		}
		System.out.println("unique color total count is"+uniqueColors.size());
		for(String colors:uniqueColors)
			System.out.println(colors);
	}
}
