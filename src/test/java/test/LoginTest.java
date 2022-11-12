package test;

import org.testng.annotations.Test;

import Base.BaseClass;
import pages.DashBoardPage;
import pages.LoginPage;

public class LoginTest extends BaseClass{
	
	static DashBoardPage  dp =null;
  @Test
  public void login() 
  {
	  setUp();
	  LoginPage lp = new LoginPage(driver);
	  dp = lp.getDriver();
	  
  }
}
