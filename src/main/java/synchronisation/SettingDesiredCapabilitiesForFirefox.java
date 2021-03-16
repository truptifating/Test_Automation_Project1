package synchronisation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SettingDesiredCapabilitiesForFirefox {

	public static void main(String[] args) 
	{
		
//		//1)
//		FirefoxOptions option= new FirefoxOptions();
//		option.setHeadless(true);
		FirefoxProfile profile= new FirefoxProfile();		
	   DesiredCapabilities caps= new DesiredCapabilities();
	   caps.setCapability("marionette", true);
	   caps.setCapability(FirefoxDriver.PROFILE, profile);
	   caps.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
	 //  option.merge(caps);
	 
	   System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Test_Automation_Project_1/geckodriver");  
	   WebDriver driver = new FirefoxDriver(caps);
	   driver.get("https://demoqa.com/browser-windows");
		
	//2)
	   
//		  WebDriver driver = new FirefoxDriver();
//		  driver.manage().deleteAllCookies();
//		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
//		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//	      driver.get("https://demoqa.com/browser-windows");	      
//	      driver.manage().window().maximize();

	}

}
