package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.EndtoEndfn;
import com.pageobjects.Loginfunctionality;

public class EndtoEnd extends Basetest {
	
	Loginfunctionality lf;
	EndtoEndfn eef;
	
	public EndtoEnd() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		
		initialization();
		
		lf = new Loginfunctionality();
		eef = new EndtoEndfn();
		
	}
	
	@Test (priority = 1)
	public void salesexecutivevalidation() throws Throwable {
		lf.verifylogin();
		eef.customerregister();
		eef.verifysalesexecutiveaddcustomer(1);
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/");
	}
	
	@Test (priority = 2)
	public void salesorderdispatchvalidation() throws Throwable {
		lf.verifylogin();
		eef.verifysalesorderdispatch();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/AdminSales/PrintTaxInvoice?invoiceid=176");
	}}

