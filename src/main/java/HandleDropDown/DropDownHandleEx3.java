package HandleDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleEx3 
{

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
	      
	      Select select = new Select(Day);
	    //  select.selectByIndex(3);   // Value in 3 index will select. We use it rarely	      
	   //   select.isMultiple();       //For selecting multiple values in particular dropdown
	      
	      
	      List<WebElement> listDays=select.getOptions();       // to give the list of all options in Dropdown
	      System.out.println(listDays.size());                 // It will give 32 value including that which is by default selected
	      int TotalDays= listDays.size()-1;  
	      System.out.println("Total Days in Month are " +TotalDays);
	      
	      //Printing all the values from dropdown
	      
	      for(int i=0; i<listDays.size();i++) 
	      {
	    	  String DayValue= listDays.get(i).getText(); // Every value we get from WebPage while automating is string value and not int
	    	  System.out.println("Day=" +DayValue);
	    	  
	    	  
	      }	      	      
	     
	}

}
