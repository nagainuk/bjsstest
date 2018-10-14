package com.TestAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestAutomation.util.TestBase;


public class SignIn extends TestBase
{
	// Identify the webelements
	@FindBy(linkText="Sign in")
	WebElement signin;
	
	@FindBy(id="email")
	WebElement Emailaddress;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement login;
	
	// initialising the page objects
	public SignIn()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Homepage loginPage(String Emailadd,String pwd)
	{
		Emailaddress.sendKeys(Emailadd);
		password.sendKeys(pwd);
		
		//Click on SignIn button
		login.click();
		return new Homepage();
	}

}
