package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronisationInSelenium
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Test_Automation_Project_1/geckodriver");  
		  WebDriver driver = new FirefoxDriver();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get("https://www.facebook.com/");
	      
	      WebElement FirstName= driver.findElement(By.name("firstname"));
	      WebElement LastName= driver.findElement(By.name("lastname"));
	      WebElement MobileNo= driver.findElement(By.xpath(" //*[@id=\"u_0_r\"]"));
	      WebElement ForgottenAccountLink= driver.findElement(By.linkText("Forgotten account?"));
	         	   
	      sendKeys(driver, FirstName, 10, "TOM");
	      sendKeys(driver, LastName, 5, "JERRY");
	      sendKeys(driver, MobileNo, 5, "7020523477");
	      clickOn(driver, ForgottenAccountLink, 10);
	}
	
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) 
	{
		WebDriverWait ww= new WebDriverWait(driver, timeout);
		ww.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void clickOn(WebDriver driver, WebElement element, int timeout) 
	{
		WebDriverWait ww= new WebDriverWait(driver, timeout);
		ww.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
