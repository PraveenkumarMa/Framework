package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class CategoriesFn extends Basetest {
	
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement element;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement masters;
	
	@FindBy (xpath = "//a[normalize-space()='Categories']")
	WebElement categories;
	
	@FindBy (xpath = "//a[normalize-space()='Add New Category']")
	WebElement addnewcategory;
	
	@FindBy (xpath = "//input[@id='CategoryName']")
	WebElement categoryname;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;
	
	@FindBy (xpath = "//select[@name='mydatatable_length']")
	WebElement tablelength;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement edit;
	
	@FindBy (id = "preloader")
	WebElement loader;
	
	@FindBy (xpath = "//i[@class='fa fa-trash-o']")
	WebElement delete;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement alert;
	
	@FindBy (xpath = "//select[@name='mydatatable_length']")
	WebElement length;
	
	public CategoriesFn() {
		PageFactory.initElements(driver,this);
	}
	
	
	public void common() throws Throwable {
		
		Thread.sleep(2000);
		element.click();
		masters.click();
		categories.click();
	}	
		
	public void verifyaddnewcategory() throws Throwable {	
		
		Thread.sleep(2000);
		addnewcategory.click();
		categoryname.sendKeys(prop.getProperty("caregoryName"));
		Thread.sleep(2000);
		savebutton.click();
		
	}
	
	public void verifyeditcategory() throws Throwable {
				
		search.sendKeys(prop.getProperty("caregoryName"));
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		edit.click();
		

		
		categoryname.clear();
		categoryname.sendKeys(prop.getProperty("editcategoryName"));
		Thread.sleep(2000);
		savebutton.click();
		
		WebElement Edit = driver.findElement(By.xpath("//div[@id='mydatatable_info']"));	
	}
	
	public void verifydeletecategory() throws Throwable {
		
		search.sendKeys(prop.getProperty("editcategoryName"));
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		delete.click();
		Thread.sleep(2000);
		alert.click();
		}}

