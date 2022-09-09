package com.inetBanking.pageObjects;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
	
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "uid")
	WebElement textUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name = "btnLogin")
	WebElement btnLogin;
	
	public void setUserName(String uname)
	{
		textUserName.sendKeys(uname);	
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
}


