package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;

import com.pageobjects.Usertype;

public class UsertypeTest extends Basetest{
	Loginfunctionality lp;
	Usertype user;
	public UsertypeTest() {
	super();
	}
    
	@BeforeMethod
    public void setup() {
    initialization();
  	lp = new Loginfunctionality();
  	user = new Usertype();
	}
	
	@Test
	public void verifyusertypetestm() throws Exception {
	lp.verifylogin();
	user.verifyusertype();
	String urltest = driver.getCurrentUrl();
	Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Usertypes");
	}
	
	@AfterMethod
	public void teardown() {
	}


}
