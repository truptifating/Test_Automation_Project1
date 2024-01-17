package crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory 
{
   public static WebDriver driver;
   
   public String browser="chrome";
   
   public void initializeDriver()
   {
	   if(driver==null)
	   {
		  if(browser.equalsIgnoreCase("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver", "/geckdriver.exe");
			  driver =new FirefoxDriver();
		  }
		  else if(browser.equalsIgnoreCase("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", ".exe");
			  driver =new ChromeDriver();
		  }
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("URL");
		   
		   
	   }
   }
   
   
}
