package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws Exception
	{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("./src/main/java/com/config/config.properties");
		prop.load(ip);
	}
	
	public static void intialization()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	driver=	new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	}
	

}
