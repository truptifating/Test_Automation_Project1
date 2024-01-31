package zoomInZoomOutScreen;

import java.awt.Dimension;
//import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserResize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Dimension d=new Dimension(500,900);
	//	driver.manage().window().setSize(d);

	}

}
