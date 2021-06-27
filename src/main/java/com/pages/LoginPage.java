package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;

public class LoginPage extends TestBase{
//constructor
	public LoginPage() throws Exception {
		super();
		PageFactory.initElements(driver, this);//Loginpage this=new Logipage();
		
	}
//	Repository
//	By userName=By.name("email");
	@FindBy(name="email")WebElement username;
	@FindBy(name="pass")WebElement password;
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	WebElement loginbutton;
	
//	Actions or methods
	public void verifyCurrentUrl()
	{
		String curl=driver.getCurrentUrl();
		System.out.println(curl);
//		Assert.assertTrue(false);
		driver.quit();

	}
	public void verifyTitle()
	{
	        
	        System.out.println(driver.getTitle());
	        driver.quit();
	}
	public void verifyLogin(String un ,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
