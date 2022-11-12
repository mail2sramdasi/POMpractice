package test;

import org.testng.annotations.Test;


import pages.UserPage;

public class DashboardTest 
{
	static UserPage up=null;
	
  @Test
  public void test01() 
  {
	  LoginTest.dp.getText();
	  
  }
  
  @Test
  public void test02() 
  {
	 up = LoginTest.dp.getUserPgeDriver();
	  
  }
  
  
}
