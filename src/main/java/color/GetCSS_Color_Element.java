package color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSS_Color_Element {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		WebElement ele=driver.findElement(By.xpath("//input[@value='Check Your Refund']"));
		String bgColor=ele.getCssValue("background");
		System.out.println(bgColor);
		
		
		WebElement ele1=driver.findElement(By.xpath("//a[@title='One Way']"));
		String borderColor=ele1.getCssValue("border-color");
		System.out.println(borderColor);
		
		String textColor=ele1.getCssValue("color");
		System.out.println(textColor);
		
		
		//Note--we will get all the color values in HTML/CSS so we can cross verify in Color picker online
	}

}
