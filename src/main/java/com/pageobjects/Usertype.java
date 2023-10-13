package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class Usertype extends Basetest{
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement element;
	
	@FindBy(xpath="//span[normalize-space()='Masters']")
	WebElement master;
	
	@FindBy(xpath="//a[normalize-space()='User Types']")
	WebElement usertp;
	
	@FindBy(xpath="//a[normalize-space()='Add New']")
	WebElement addnew;
	
	@FindBy(xpath="//input[@id='TypeName']")
	WebElement tname;
	
	@FindBy(xpath="//input[@id='TypeCode']")
	WebElement tcode;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement sav;

	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	WebElement srch;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/a[1]/button[1]/i[1]")
	WebElement edit;
	
	
    public Usertype() {
    	PageFactory.initElements(driver, this);
    }
    
    public void verifyusertype() throws Exception {
    	Thread.sleep(3000);
    	element.click();
    	master.click();
    	usertp.click();
    	Thread.sleep(3000);
    	Utils.mouseHoverandClickOnElement(driver, addnew);
    	
    	
    	tname.sendKeys(prop.getProperty("TypeName"));
    	tcode.sendKeys(prop.getProperty("TypeCode"));
    	Thread.sleep(3000);
    	sav.click();
    	Thread.sleep(3000);
    	
    	driver.navigate().to("http://empirehome.myprojectsonline.co.in/Master/Usertypes");
    	srch.sendKeys(prop.getProperty("Search"));
    	
    	srch.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	edit.click();
    	
     	
    	Thread.sleep(3000);
    	tname.clear();
    	tname.sendKeys(prop.getProperty("edittypename"));
    	Thread.sleep(3000);
    	sav.click();
   	
    }
    
}
