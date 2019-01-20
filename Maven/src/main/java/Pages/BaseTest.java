package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	WebDriver driver;
	
	public void OpenBrowser(String browser) {
		
		if(browser.equals("Mozilla")) {
			System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();	
		}
		else if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","E:\\drivers\\geckodriver.exe" );
			
		}
		
	}

}
