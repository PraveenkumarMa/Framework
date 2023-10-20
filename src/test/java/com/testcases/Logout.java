package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.LogoutF;

public class Logout extends Basetest {
	
	Loginfunctionality lf;
	LogoutF logout;
	
	public Logout() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		
		lf = new Loginfunctionality();
		lf.verifylogin();
		
		logout = new LogoutF();
		
		}
	
	@Test
	public void logoutvalidation() throws Throwable {
		
		logout.verifylogout();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/");
	}
	
	@AfterMethod
	public void teardown() {
		
	}}
