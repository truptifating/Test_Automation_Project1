//package HandleDropDown;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class DropDownSelectingOption 
//{
//	WebDriver driver= new FirefoxDriver();
//	
//	// Getting options from dropdown
//	Select sel1= new Select(driver.findElement(By.xpath("xpath of dropdown")));	
//	List<WebElement> options11 = sel1.getOptions();  //It will fetch all the options from dropdown 	 
//	 for(int i=0;i<options11.size();i++)
//	 {
//	 String drop_down_values=options11.get(i).getText();
//	 }
//	
//	
//	// Getting first selected options from drop down
//	Select sel2= new Select(driver.findElement(By.xpath("")));
//	WebElement firstSelectedValue= sel2.getFirstSelectedOption();  //this method will return the selected value of the dropdown, and if it is a multi-select dropdown, this method will return the first selected value of the dropdown. 
//	
//	// Getting all Selected options from drop down
//	Select sel3= new Select(driver.findElement(By.xpath("")));
//	List<WebElement> getallValues= sel3.getAllSelectedOptions(); //method will return the only selected value of the dropdown, and if it is a multi-select dropdown, this method will return all the selected values of the dropdown
//	
//	//
//	
//	
//}
