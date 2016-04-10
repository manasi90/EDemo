package com.inportia.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;




public class LoginPage extends BasePage{
	WebDriver browser;
	
	public LoginPage(WebDriver browserp)
	{
		super(browserp);
	}
	
	By login_button =By.linkText("Login");
	By username_text =By.name("username");
	By password_textbox =By.name("password");
	By submit_button =By.xpath(".//*[@id='facebox']/div/table/tbody/tr/td/div[2]/form/a");
	By note_link =By.linkText("Note");
	public void click_on_login_button()
	{
		browser.findElement(login_button).click();
	}
	
	public void enterUsername()
	{
		browser.findElement(username_text).sendKeys("my@gmail.com");
	}
	
	public void enterPassword()
	{
		browser.findElement(password_textbox).sendKeys("123456");
	}
	
	public void submit_button()
	{
		browser.findElement(submit_button).click();
		
	
	}
	
	public void verify()
	{
		boolean is_present= browser.findElement(note_link).isDisplayed();
		Assert.assertTrue(is_present, "verify message");
	
	}
	
	public void loginAction()
	{
		click_on_login_button();
		enterUsername();
		enterPassword();
		submit_button();
	
	}
	}


