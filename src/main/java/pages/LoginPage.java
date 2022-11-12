package pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver =null;
	
	
	@FindBy (xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy (xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy (xpath = "//button")
	WebElement btn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void login()
	{
		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		btn.click();
		
	}
	
	public DashBoardPage getDriver()
	{
		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		btn.click();
		if(driver.getTitle().equalsIgnoreCase("JavaByKiran | Dashboard"))
			return new DashBoardPage(driver);
		
		return null;
		
	}
	
	
}
