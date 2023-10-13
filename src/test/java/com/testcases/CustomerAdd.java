package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;

import com.pageobjects.Loginfunctionality;

public class CustomerAdd extends Basetest{
	Loginfunctionality lp;
	CustomerAdd cap;
    public CustomerAdd() {
    super();
    	
	
    
    }
    
	@BeforeMethod
    public void setup() {
    initialization();
  	lp = new Loginfunctionality();
  	cap = new CustomerAdd ();
	}
	
	@Test
	public void verifycustomeradd() throws Exception {
	lp.verifylogin();
	cap.verifycustomeradd();
	String urltest = driver.getCurrentUrl();
	Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/User/CustomerList");
	}
	
	@AfterMethod
	public void teardown() {
	//driver.close();
	}
}

