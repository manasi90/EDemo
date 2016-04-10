package com.inportia.test;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainDriver {
	
	static WebDriver driver;
	public static void main(String[]args)
	{
		driver =new FirefoxDriver();
		driver.get("https://www.edmodo.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.loginAction();
		loginpage.verify();
		loginpage.getUrl();
		loginpage.pageRefresh();
		driver.close();
		
	}
	

}
