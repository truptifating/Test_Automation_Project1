package HandleDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExAllInOne {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Test_Automation_Project_1/geckodriver");  
		  WebDriver driver = new FirefoxDriver();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy' and @id='u_0_2']")).click();
	      
	    Select select= new Select(driver.findElement(By.xpath("//select[@id='month']")));
	    List<WebElement> list=select.getOptions();
	    for(WebElement str:list) {
	    	System.out.println(str.getText());
	    }
	    
	    
		
		

	}

}
