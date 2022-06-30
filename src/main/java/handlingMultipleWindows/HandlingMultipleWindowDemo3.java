package handlingMultipleWindows;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingMultipleWindowDemo3 {

	public static void main(String[] args) throws InterruptedException 
	{
		  //Setting the desired capabilities
//		   FirefoxProfile profile= new FirefoxProfile();		
//		   DesiredCapabilities caps= new DesiredCapabilities();
//		   caps.setCapability("marionette", true);
//		   caps.setCapability(FirefoxDriver.PROFILE, profile);
//		   caps.setCapability(CapabilityType.TAKES_SCREENSHOT, true);		   
//		  System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Test_Automation_Project_1/geckodriver");  
//		  WebDriver driver = new FirefoxDriver();
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\Test_Automation_Project1\\chromedriver.exe");  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	      driver.get("https://demoqa.com/browser-windows");	      
	      driver.manage().window().maximize();
	      
	      //Getting Parent Window
	      String ParentWindowid=driver.getWindowHandle();
	      System.out.println("Parent window Id is-->"+ParentWindowid);
	     
	      
	      //Opening Multiple Window Multiple Windows
	      WebElement NewWindow=driver.findElement(By.xpath("//*[@id=\"windowButton\"]"));
	      
	      for(int i=0;i<3;i++) 
	      {
	    	  NewWindow.click();
	    	  Thread.sleep(3000);	    	  
	      }
	      
	      //Printing all the id of open window by Array List
	      ArrayList<String> window_count= new ArrayList<String>(driver.getWindowHandles());
	      System.out.println("No of windows open are "+window_count.size());
	      System.out.println("Printing the ids of all window-->"+window_count);
	      
	      //Printing the id one by one
	      for(String str:window_count)
	      {
	    	  System.out.println("Printing the ids of all window one by one-->"+str);
	      }
	      
	      //Capturing the title of the window
	      for(int j=0;j<window_count.size();j++)
	      {
	    	  System.out.println(driver.switchTo().window((String)window_count.get(j)).getTitle());
	      }
	      //Closing all the windows
	      for(int k=0;k<window_count.size();k++)
	      {
	    	  driver.switchTo().window((String)window_count.get(k)).close();
	      }

	}

}
