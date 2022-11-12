package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver =null;
	
	
	public DashBoardPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (tagName = "h1" ) WebElement heading;
	
	@FindBy (xpath = "//span[text()='Users']" ) WebElement usersLink;
	
	public void getText()
	{
		System.out.println(heading.getText());
	}
	
	public UserPage getUserPgeDriver()
	{
		usersLink.click();
		if (driver.getTitle().equalsIgnoreCase("JavaByKiran | User"))
			return new UserPage(driver);
		
		return null;
			
	
			
	}
	
	
}
