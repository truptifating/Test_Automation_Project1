package HandleDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle 
{

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\Test_Automation_Project1\\chromedriver.exe");  
		  WebDriver driver = new ChromeDriver();
//	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
      driver.get("https://en-gb.facebook.com/r.php");
      
      WebElement Day= driver.findElement(By.id("day"));
      WebElement Month= driver.findElement(By.id("month"));
      WebElement Year= driver.findElement(By.id("year"));
      
      /*Select select1= new Select(Day);
      select1.selectByVisibleText("2");s
      
      Select select2= new Select(Day);
      select2.selectByVisibleText("Mar");
      
      Select select3= new Select(Day);
      select3.selectByVisibleText("1994");*/
      
      selectValueFromDropDown(Day, "2");            
      selectValueFromDropDown(Month, "Mar");         //Method Call
      selectValueFromDropDown(Year, "1994");
         
	}

	
	public static void selectValueFromDropDown(WebElement element, String value)
	{
		Select select = new Select(element);      /* Creating one select method once and sending multiple values*/
		select.selectByVisibleText(value);
	}
}
