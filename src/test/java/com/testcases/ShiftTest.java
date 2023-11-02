package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.ShiftFn;

public class ShiftTest extends Basetest {
	
	Loginfunctionality lf;
	ShiftFn shift;
	
	public ShiftTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		
		initialization();
		
		lf = new Loginfunctionality();
		lf.verifylogin();
		
		shift = new ShiftFn();
		
		}
	
	@Test (priority = 1)
	public void addnewshiftvalidation() throws Throwable {
		
		shift.verifyaddnewshift();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    Assert.assertEquals(recordcount, 20);
	}

	
	@Test (priority = 2)
	public void editshiftvalidation() throws Throwable {
		
		shift.verifyeditshift();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Shifts");
			
	}
	
	@Test (priority = 3)
	public void deleteshiftvalidation() throws Throwable {
		
		shift.verifydeleteshift();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    Assert.assertEquals(recordcount, 19);
		
		}
	
	@AfterTest
	public void teardown() {
		
	}}
