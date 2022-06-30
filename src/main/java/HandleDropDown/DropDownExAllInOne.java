package HandleDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExAllInOne {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\Test_Automation_Project1\\chromedriver.exe");  
		  WebDriver driver = new ChromeDriver();
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
