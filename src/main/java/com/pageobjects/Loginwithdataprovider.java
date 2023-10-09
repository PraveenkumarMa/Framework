package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Loginwithdataprovider extends Basetest {
	@FindBy(name = "emailid")
	WebElement email;
	@FindBy(id = "pword")
	WebElement passord;
	@FindBy(xpath = "//button[@class='btn green_btn']")
	WebElement login;
	
	
	public Loginwithdataprovider(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		
		
	
	public void verifylogin(String username, String password) {
		email.sendKeys(username);
		passord.sendKeys(password);
		login.click();
	}

}
