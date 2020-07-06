package HandleDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleEx2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Test_Automation_Project_1/geckodriver");  
		  WebDriver driver = new FirefoxDriver();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get("https://www.facebook.com/");
	      
	      WebElement Day= driver.findElement(By.id("day"));
	      WebElement Month= driver.findElement(By.id("month"));
	      WebElement Year= driver.findElement(By.id("year"));
	 
	      String dob= "2-Mar-1994";    // We can also pass data from excel sheet as this is hardcoded one
	      String dobArr[]= dob.split("-");
	      
	      selectValueFromDropDown(Day, dobArr[0]);            
	      selectValueFromDropDown(Month, dobArr[1]);  //Method Call
	      selectValueFromDropDown(Year, dobArr[2]);
	      
	         
	}
	
	public static void selectValueFromDropDown(WebElement element, String value)
	{
		Select select = new Select(element); /* Creating one select method once and sending multiple values*/
		select.selectByVisibleText(value);
	}

}
