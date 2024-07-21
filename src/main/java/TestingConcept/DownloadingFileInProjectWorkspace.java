package TestingConcept;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadingFileInProjectWorkspace {

	public static void main(String[] args) {
		//Learn from QAFox channel youtube
		ChromeOptions options= new ChromeOptions();
		
		HashMap<String, Object> chromePrefs= new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);//disabling download popups
		
		String downloadFilePath= System.getProperty("user.dir");
		chromePrefs.put("download.default_directory", downloadFilePath); //downloading in path given
		
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/p/page7.html");
		driver.findElement(By.linkText("ZIP file")).click();//it will download the code in Download folder of machine and not in project workspace



	}

}
