package handlingMultipleWindows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import junit.framework.Assert;

public class HandlingMultipleWindowsDemo1 
{
	//SoftAssert softassert= new SoftAssert();
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{ //String capabilityName = null;
//		System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Test_Automation_Project_1/geckodriver");  
//		  FirefoxOptions options= new FirefoxOptions();
//		  DesiredCapabilities capabilities= DesiredCapabilities.firefox();
//		 
//		  	capabilities.setCapability(capabilityName, options);
//		  	options.addArguments("--disable-extensions");   
//	        options.setExperimentalOption("useAutomationExtension", false);
//	        options.addArguments("disable-plugins");
//	        options.addArguments("enable-automation");
//	        options.addArguments("--disable-infobars");
//	        options.addArguments("--start-maximized");
//	        driver = new FirefoxDriver(options);   
		
//			driver= new FirefoxDriver();
//	        driver.manage().window().maximize();
//	        Thread.sleep(1000); 	
		
//		WebDriver driver = new FirefoxDriver();
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\Test_Automation_Project1\\chromedriver.exe");  
		  WebDriver driver = new ChromeDriver();
     	  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	      driver.get("https://demoqa.com/browser-windows");
	      driver.manage().window().maximize();
	      
	   
	      //Getting Parent Window
	      String ParentWindowid=driver.getWindowHandle();
	      System.out.println("Parent window-->"+ParentWindowid);
	     
	      
	      //Handling Multiple Windows By set
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
	      
	      Iterator<String> itr=allWindowsHandle.iterator();
	      
	      while(itr.hasNext()) 
	      {
	    	 String child=itr.next();
	    	 if(!ParentWindowid.equals(child))
	    	 {
	    		 driver.switchTo().window(child);
	    		 System.out.println(driver.switchTo().window(child).getTitle());
	    	 }
	    	  System.out.println(driver.switchTo().window(itr.next()).getTitle());
	      }
	      driver.switchTo().window(ParentWindowid);
	    
	      

	}

}
