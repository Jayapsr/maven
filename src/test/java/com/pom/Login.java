package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class Login extends BaseClass {
public  Login() {
PageFactory.initElements(driver, this);
}
	@FindBy(id="username")
	WebElement txtUserName;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(id="login")
	WebElement clkLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getClkLogin() {
		return clkLogin;
		
		
	}
	public void login(String userName,String password) {
	type(getTxtUserName(), userName);
	type(getTxtPassword(), password);
	Click(getClkLogin());
		
		
		

	}
}
