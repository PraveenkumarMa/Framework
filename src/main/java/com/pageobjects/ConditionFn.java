package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class ConditionFn extends Basetest {
	
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement element;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement masters;
	
	@FindBy (xpath = "//a[normalize-space()='Condition']")
	WebElement condition;
	
	@FindBy (xpath = "//a[normalize-space()='Add New']")
	WebElement addnew;
	
	@FindBy (xpath = "//input[@id='ConditionName']")
	WebElement conditionname;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;
	
	@FindBy (xpath = "//select[@name='mydatatable_length']")
	WebElement length;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement edit;
	
	@FindBy (xpath = "//i[@class='fa fa-trash-o']")
	WebElement delete;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement yes;
	
	public ConditionFn() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyaddcondition() throws Throwable {
		
		Thread.sleep(2000);
		element.click();
		masters.click();
		condition.click();
		Thread.sleep(2000);
		addnew.click();
		conditionname.sendKeys(prop.getProperty("ConditionName"));
		Thread.sleep(2000);
		savebutton.click();
		Utils.dropdowns(length, "100");
		
	}
	
	
	public void verifyeditcondition() throws Throwable {
		
		Thread.sleep(2000);
		search.sendKeys(prop.getProperty("ConditionName"));
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		edit.click();
		Thread.sleep(2000);
		conditionname.clear();
		conditionname.sendKeys(prop.getProperty("editConditionName"));
		Thread.sleep(2000);
		savebutton.click();
		
	}
	
	
	public void verifydeletecondition() throws Throwable {
		
		Thread.sleep(2000);
		search.sendKeys(prop.getProperty("editConditionName"));
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		delete.click();
		Thread.sleep(2000);
		yes.click();
		Thread.sleep(2000);
		Utils.dropdowns(length, "100");
		
		
	}}
