package TestingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadingFileInMachine {

	public static void main(String[] args) {
		//Learn from QAFox channel youtube
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/p/page7.html");
		driver.findElement(By.linkText("ZIP file")).click();//it will download the code in Download folder of machine and not in project workspace



	}

}
