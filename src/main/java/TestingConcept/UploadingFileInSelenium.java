package TestingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFileInSelenium {

	public static void main(String[] args) 
	{
		//Learn from QAFox channel youtube
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Users\\USER\\Desktop\\Office\\Trupti_Fating_Testing_4years_4.0.pdf");
		//Note: In sendKeys we need to copy the path or location of file which we want to upload

	}

}
