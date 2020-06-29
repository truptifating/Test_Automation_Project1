package HandleDropDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownHandle 
{

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Test_Automation_Project_1/geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("https://www.facebook.com/");
      

	}

}
