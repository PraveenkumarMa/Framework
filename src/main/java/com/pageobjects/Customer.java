package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class Customer extends Basetest {
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement element;
	
	@FindBy(xpath="//span[normalize-space()='Customers']")
	WebElement customer;
	
	@FindBy(xpath="//a[normalize-space()='Add Customer']")
	WebElement addcustomer;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	WebElement customername;
	
	@FindBy(xpath="//input[@placeholder='Enter Mobile Number']")
	WebElement mobnumber;
	
	@FindBy(xpath="//input[@placeholder='Enter Email Id']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Enter Whatsapp Number']")
	WebElement whatsapp;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	WebElement srch;
	
	
	@FindBy(xpath="//tbody/tr[1]/td[11]/a[1]/button[1]/i[1]")
	WebElement edit;
	
	@FindBy(xpath="//tbody/tr[1]/td[11]/a[3]/button[1]/i[1]")
	WebElement delete;
	
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div[1]/button")
	WebElement yes;
	
	public Customer() {
		PageFactory.initElements(driver, this);
	}
	public void verifycustomeradd() throws Exception {
		Thread.sleep(3000);
		element.click();
		customer.click();
		addcustomer.click();
		Thread.sleep(3000);
		Utils.mouseHoverandClickOnElement(driver, customername);
		customername.sendKeys(prop.getProperty("CustomerName"));
		mobnumber.sendKeys(prop.getProperty("MobileNumber"));
		email.sendKeys(prop.getProperty("Emailid"));
		whatsapp.sendKeys(prop.getProperty("WhatsAppNumber"));
		save.click();
		Thread.sleep(3000);
		
		driver.navigate().to("http://empirehome.myprojectsonline.co.in/User/CustomerList");
		srch.sendKeys(prop.getProperty("search"));
		srch.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		edit.click();
		Thread.sleep(3000);
		customername.clear();
		customername.sendKeys(prop.getProperty("editcustomer"));
		Thread.sleep(3000);
		save.click();
		Thread.sleep(3000);
		
		driver.navigate().to("http://empirehome.myprojectsonline.co.in/User/CustomerList");
		srch.sendKeys(prop.getProperty("srch"));
		srch.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		delete.click();
		yes.click();
		
	
	}
}



