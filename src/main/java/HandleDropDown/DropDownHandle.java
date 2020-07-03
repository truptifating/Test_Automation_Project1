package HandleDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle 
{

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Test_Automation_Project_1/geckodriver");  
	  WebDriver driver = new FirefoxDriver();
//	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
      driver.get("https://www.facebook.com/");
      
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
