package com.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage login;

	public LoginPageTest() throws Exception {
		super();
		
	}
	@BeforeMethod
	public void openBrowser() throws Exception
	{
		intialization();
		login=new LoginPage();
	}
	
	@Test(priority=1)
	public void verifyCurrentUrl()
	{
		login.verifyCurrentUrl();
	}
	@Test(priority=2)
	public void verifyTitleTest()
	{
		
		login.verifyTitle();
	}
	@Test(priority=3)
	public void verifyLoginTest()
	{
		login.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

}
