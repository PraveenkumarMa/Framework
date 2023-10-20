package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Holiday;
import com.pageobjects.Loginfunctionality;


public class Holidayfn extends Basetest{
	Loginfunctionality lop;
	Holiday hop;
    public Holidayfn() {
    super();
    }
	@BeforeMethod
    public void setup() {
    initialization();
  	lop = new Loginfunctionality();
  	hop = new Holiday();
	}
	@Test
	public void verifyholiday() throws Exception {
	lop.verifylogin();
	hop.verifyholiday();
	String urltest = driver.getCurrentUrl();
	Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Holidays");
	}
	
	@AfterMethod
	public void teardown() {
	//driver.close();
	}

}

