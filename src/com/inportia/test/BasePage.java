package com.inportia.test;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	public WebDriver browser;
	
	public  BasePage(WebDriver driverp)
	{
		browser=driverp;
	}
	
	public void pageRefresh(){
		browser.navigate().refresh();
	}
	
	public void getUrl(){
		System.out.println(browser.getCurrentUrl());
	}
	}
	
	


