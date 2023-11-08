package com.pageobjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class AddProductPage extends Basetest {
	@FindBy(xpath="//span[@class='pe-7s-keypad']")
	WebElement element;
	
	@FindBy(xpath="//span[normalize-space()='Inventory']")
	WebElement inventory;
	
	@FindBy(xpath="//a[normalize-space()='Add Inventory']")
	WebElement addinven;
	
	@FindBy(xpath="//input[@placeholder='Enter Model Number']")
    WebElement mnumber;
    
    @FindBy(xpath="//textarea[@name='Title']")
    WebElement ititle;
    
    @FindBy(xpath="//textarea[@name='ItemDescription']")
    WebElement idescription;
    
    @FindBy(xpath="//input[@placeholder='Enter Height']")
    WebElement hght;
    
    @FindBy(xpath="//input[@placeholder='Enter Width']")
    WebElement wdth;
    
    @FindBy(xpath="//input[@placeholder='Enter Breadth']")
    WebElement brdh;
    
    @FindBy(xpath="//input[@placeholder='Enter Color Name']")
    WebElement color;
    
    @FindBy(xpath="//input[@id='actual']")
    WebElement aprice;
    
    @FindBy(xpath="//*[@id=\"lobicard-custom-control1\"]/div[2]/form/div[1]/div[17]/div/span/span[1]/span")
    WebElement mrp;
    
    @FindBy(xpath="//li[contains(text(),'1.00')]")
    WebElement mrpp;
    
    @FindBy(xpath="//input[@placeholder='Enter Qty ']")
    WebElement qty;
    
    @FindBy(xpath="//input[@name='ProductMainImageUploaded']")
    WebElement img;
    
    @FindBy(xpath="//button[normalize-space()='Save']")
    WebElement save;
    
    @FindBy (xpath = "//input[@placeholder='Search']")
	WebElement modelsearch;
    
    public AddProductPage() {
    	PageFactory.initElements(driver, this);;
    }
            		
    public void verifyaddproduct(String modelnumber, String itemtitle, String ItemDescription, String height, String width, String breadth, String colorname, String actualprice, String quantity ) throws Exception {
    	Thread.sleep(3000);
    	element.click();
    	inventory.click();
    	addinven.click();
    	mnumber.sendKeys(modelnumber);
    	ititle.sendKeys(itemtitle);
    	idescription.sendKeys(ItemDescription);
    	hght.sendKeys(height);
    	wdth.sendKeys(width);
    	brdh.sendKeys(breadth);
    	color.sendKeys(colorname);
    	aprice.sendKeys(actualprice);
    	mrp.click();
    	mrpp.click();
    	Thread.sleep(2000);
    	
    	qty.sendKeys(quantity);

    	Thread.sleep(3000);
	Utils.actions(driver, img);
		
		Utils.robot(prop.getProperty("imagepath"));
		
		Thread.sleep(2000);
				
			save.click();
			
			Thread.sleep(2000);
			
			modelsearch.sendKeys(prop.getProperty("Modelsearch"));
			modelsearch.sendKeys(Keys.ENTER);
			
    	
    	}
    	
}
