package HandleDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectingMultipleValues 
{
	 public static void main(String[] args)
	 {
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\Test_Automation_Project1\\chromedriver.exe");  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://demo.guru99.com/test/newtours/register.php");
		  
		  WebElement country= driver.findElement(By.xpath("//select[@name='country']"));
		  
		  Select select= new Select(country);
		  select.selectByVisibleText("ALGERIA");
		  select.selectByIndex(1);
		  boolean value=select.isMultiple();
	 }

}
