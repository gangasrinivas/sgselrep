package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.LandingPage;
import Pages.LaunchPage;
import Pages.LoginPage;
import Pages.ProfilePage;

public class ProfileTest {
	WebDriver driver;
	
	@Test
	public void testProfile() {
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		LaunchPage lp = new LaunchPage(driver);
		LoginPage loginpage=lp.gotoFBLoginPage();
		loginpage.dologin("cnu_0033@yahoo.com", "234234");
		LandingPage landingpage=loginpage.dologin("xxxxx","yyyy");
		ProfilePage profilepage=landingpage.gotoProfilePage();
		profilepage.verifyprofile();
		
	}
}
