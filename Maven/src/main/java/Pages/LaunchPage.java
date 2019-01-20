package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchPage {
	WebDriver driver ;
	
	public LaunchPage(WebDriver driver) {
		
		this.driver=driver;
		//System.setProperty("webdriver.chrome.driver", "E:\\drivers\\geckodriver.exe");
		System.out.println("Im in constructor");
		
	}
	public LoginPage gotoFBLoginPage() {
		System.out.println("Im in gotoFBLoginPage");
		driver.get("http://facebook.com");
		LoginPage loginpage = new LoginPage(driver);
		System.out.println("launch page");
		return loginpage;
		
	}
}