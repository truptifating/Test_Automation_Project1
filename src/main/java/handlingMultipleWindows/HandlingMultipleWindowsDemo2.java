package handlingMultipleWindows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleWindowsDemo2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Test_Automation_Project_1/geckodriver");  
		  WebDriver driver = new FirefoxDriver();
//		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	      driver.get("https://demoqa.com/browser-windows");	      
	      driver.manage().window().maximize();
	      
	      //Getting Parent Window
	      String ParentWindowid=driver.getWindowHandle();
	      System.out.println("Parent window-->"+ParentWindowid);
	     
	      
	      //Opening Multiple Window Multiple Windows
	      WebElement NewWindow=driver.findElement(By.xpath("//*[@id=\"windowButton\"]"));
	      
	      for(int i=0;i<3;i++) 
	      {
	    	  NewWindow.click();
	    	  Thread.sleep(3000);	    	  
	      }
	      
	      //Printing all the id of open window
	      Set<String> allWindowsHandle=driver.getWindowHandles();
	      System.out.println("Printing the ids of all window-->"+allWindowsHandle);
	      System.out.println("Printing the no of window-->"+allWindowsHandle.size());
	      
	      String lastWindowHandle="";
	      
	      //Printing the ids of windows one by one
	      for(String handle:allWindowsHandle)
	      {
	    	  System.out.println("Switching to window-->" +handle);
	    	  System.out.println("Navigating to google.com");
	    	  driver.switchTo().window(handle);	    	 
	    	  driver.get("http://google.com");
	    	  lastWindowHandle=handle;
	      }
	      
	      // Switch to the parent window and closing it
	      driver.switchTo().window(ParentWindowid).close();
	      
	      driver.switchTo().window(lastWindowHandle);
	      driver.get("http://toolsqa.com");
	      
      
	}

}
