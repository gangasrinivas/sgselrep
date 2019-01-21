package com.selenium.core.ddf.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	WebDriver driver;
	//****************Common Functions on GUI *********************
	public void OpenBrowser(String browser) {
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\drivers\\geckodriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
			else if (browser.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().window().maximize();

			}
	}
	public void Click() {}
	public void type() {}
	public void navigate(String url) {
		driver.get(url);		
		
	}
	//****************Validations Functions *********************
	public void isElementPresent() {}
	public void VerifyTitle() {}
	public void VerifyText() {}
	//****************Reporting Functions *********************
	public void TakeScreenShort() {}
	public void reporFail() {}
	public void reportPass() {}

}
