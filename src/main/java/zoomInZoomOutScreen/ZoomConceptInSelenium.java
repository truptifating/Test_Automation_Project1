package zoomInZoomOutScreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomConceptInSelenium {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/");
		JavascriptExecuter js=(JavasscriptExecutor)driver;
        String zoomScreen ="document.body.style.zoom ='50%'";//This is for chrome, safari,edge
   //     String zoonScreenForFirefox ="document.body.style.MozTransform='scale(1)'"; //This is for firefox browser
        //Scale(1)=100%,Scale(2=200%,Scale(0.5)=50%)
        js.executeScript(zoomScreen);
	}

}
