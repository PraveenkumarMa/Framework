package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.CategoriesFn;
import com.pageobjects.Loginfunctionality;

public class Categories extends Basetest {
	
	Loginfunctionality lf;
	CategoriesFn ctfn;
	
	public Categories() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		
		lf = new Loginfunctionality();
		lf.verifylogin();
		
		ctfn = new CategoriesFn();
	}
	
	
	@Test (priority = 1)
	public void addnewcategoryvalidation() throws Throwable {
		ctfn.common();
		ctfn.verifyaddnewcategory();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    Assert.assertEquals(recordcount, 8);
		
	}
	
	@Test (priority = 2)
	public void editcategoryvalidation() throws Throwable {
		
		ctfn.verifyeditcategory();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Categories");
	}
	
	@Test (priority = 3)
	public void deletecategoryvalidation() throws Throwable {
		
		ctfn.verifydeletecategory();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    Assert.assertEquals(recordcount, 7);
	}

	@AfterTest
	public void teardown() {
		
	}}


