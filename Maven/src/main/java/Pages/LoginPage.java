package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		}
	public WebElement Find_Email() {	
	WebElement	email = driver.findElement(By.id("email"));
		return email;
	}
	public WebElement Find_password() {	
		WebElement	password = driver.findElement(By.id("pass"));
			return password;
		}

	public WebElement Find_loginbutton() {
		WebElement loginbutton = driver.findElement(By.id(""));
		return loginbutton;
	}
	public LandingPage dologin(String Email,String Password) {
		//driver method to send inputs to username, password
		Find_Email().sendKeys(Email);
		Find_password().sendKeys(Password);
		LandingPage landingpage= new LandingPage();
		return landingpage;
	}
}
	

