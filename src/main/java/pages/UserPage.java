package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	WebDriver driver=null;
	
	public UserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy (xpath = "") WebElement element;
	@FindBy (xpath = "//h1") WebElement hedaingUser;
	
	public void showHeading()
	{
		System.out.println(hedaingUser.getText());
	}
}
